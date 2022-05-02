package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.Follow;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;

public class FollowController extends Controller {
    public Result follow() {
        System.out.println("Follow a user");
        JsonNode req = request().body().asJson();
        User src = User.findById(req.get("user_id").asLong());
        User oth = User.findById(req.get("other_id").asLong());

        ObjectNode result = null;
        if (src != null && oth != null) {
            Follow f = Follow.findByUsers(src.user_id, oth.user_id);
            if (f == null) {
                System.out.println("New follow");
                result = Json.newObject();
                Follow follow = new Follow();
                follow.user_id = src.user_id;
                follow.other_id = oth.user_id;
                follow.save();
                result.put("edge_id", follow.edge_id);
                result.put("user_id", follow.user_id);
                result.put("other_id", follow.other_id);
            }
        }
        return ok(result).withHeaders(
                "Access-Control-Allow-Origin", "*"
        );
    }

    public Result block() {
        System.out.println("Block a user");
        JsonNode req = request().body().asJson();
        User src = User.findById(req.get("user_id").asLong());
        User oth = User.findById(req.get("other_id").asLong());

        if (src != null && oth != null) {
            Follow f = Follow.findByUsers(oth.user_id, src.user_id);
            if (f != null) {
                System.out.println("Can block");
                f.delete();
                return ok("true");
            }
        }
        return ok("false");
    }

    public Result unfollow() {
        System.out.println("Unfollow a user");
        JsonNode req = request().body().asJson();
        User src = User.findById(req.get("user_id").asLong());
        User oth = User.findById(req.get("other_id").asLong());

        if (src != null && oth != null) {
            Follow f = Follow.findByUsers(src.user_id, oth.user_id);
            if (f != null) {
                System.out.println("Can unfollow");
                f.delete();
                return ok("true");
            }
        }
        return ok("false");
    }

    public Result getFollowers(Long user_id) {
        System.out.println("Get followers");

        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        List<Follow> f = Follow.listByTarget(user_id);
        List<User> u = new ArrayList();
        for (int i = 0; i < f.size(); i++) {
            User temp = User.findById(f.get(i).user_id);
            u.add(temp);
        }
        return ok(Json.toJson(u));
    }

    public Result getFollowing(Long user_id) {
        System.out.println("Get following");

        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        List<Follow> f = Follow.listBySource(user_id);
        List<User> u = new ArrayList();
        for (int i = 0; i < f.size(); i++) {
            User temp = User.findById(f.get(i).other_id);
            u.add(temp);
        }
        return ok(Json.toJson(u));
    }

    public Result getNumFollowers(Long user_id) {
        System.out.println("Get followers count");

        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        List<Follow> f = Follow.listByTarget(user_id);
        ObjectNode result = null;
        result.put("count", f.size());
        return ok(result);
    }

    public Result getNumFollowing(Long user_id) {
        System.out.println("Get following count");

        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        List<Follow> f = Follow.listBySource(user_id);
        ObjectNode result = null;
        result.put("count", f.size());
        return ok(result);
    }
}
