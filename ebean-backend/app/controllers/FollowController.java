package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class FollowController extends Controller {
    public Result follow() {
        System.out.println"Follow a user");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();

        User u = User.findById(user_id);
        ObjectNode result = null;
        if (u != null) {
            Follow f = Follow.findByUsers(/*this_id*/, user_id);
            if (f == null) {
                System.out.println("New follow");
                result = Json.newObject();
                Follow follow = new Follow();
                follow.edge_id = 1;
                follow.user_id = /*this_id*/;
                follow.other_id = user_id;
                follow.save();
                result.put("body", follow);
            }
        }
        return ok(result);
    }

    public Result block() {
        System.out.println"Block a user");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();

        User u = User.findById(user_id);
        ObjectNode result = null;
        if (u != null) {
            Follow f = Follow.findByUsers(user_id, /*this_id*/);
            if (f != null) {
                System.out.println("Can block");
                result = Json.newObject();
                f.delete();
                return ok(true);
            }
        }
        return ok(false);
    }

    public Result unfollow() {
        System.out.println"Unfollow a user");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();

        User u = User.findById(user_id);
        ObjectNode result = null;
        if (u != null) {
            Follow f = Follow.findByUsers(/*this_id*/, user_id);
            if (f != null) {
                System.out.println("Can unfollow");
                result = Json.newObject();
                f.delete();
                return ok(true);
            }
        }
        return ok(false);
    }

    public Result getFollowers() {
        System.out.println("Get followers");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();
        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        Follow[] f = Follow.listByTarget(user_id);
        ObjectNode result = null;
        result.put("body", f);
        return ok(result);
    }

    public Result getFollowing() {
        System.out.println("Get following");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();
        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        Follow[] f = Follow.listBySource(user_id);
        ObjectNode result = null;
        result.put("body", f);
        return ok(result);
    }

    public Result getNumFollowers() {
        System.out.println("Get followers count");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();
        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        Follow[] f = Follow.listByTarget(user_id);
        ObjectNode result = null;
        result.put("body", f.length);
        return ok(result);
    }

    public Result getNumFollowing() {
        System.out.println("Get following count");
        JsonNode req = request().params().asJson();
        Long user_id = req.get("user_id").asLong();
        if(user_id == null) {
            return badRequest("Invalid user_id");
        }

        Follow[] f = Follow.listBySource(user_id);
        ObjectNode result = null;
        result.put("body", f.length);
        return ok(result);
    }
}
