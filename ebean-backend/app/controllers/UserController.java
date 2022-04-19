package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class UserController extends Controller {

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String username = req.get("user_name").asText();
        String password = req.get("user_password").asText();

        try {
            User user = User.findByName(username); // ( match where username and password both match )
            if(user!=null && username.equals(user.user_name) && password.equals(user.user_password)){
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }

    }


    /**
     * When a user register, check if the username is taken
     * save to database if valid
     * POST
     * @return success if valid, fail if already taken
     */
    public Result registerNew() {
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String username = req.get("user_name").asText();
        String password = req.get("user_password").asText();
        String name = req.get("display_name").asText();
        String avatar = req.get("display_avatar").asText();

        User u = User.findByName(username);
        if (u == null) {
            System.out.println("new user");
            if (username == null || password == null || name == null || avatar == null)
                return badRequest("All Fields must be entered");
            User user = new User();
            user.user_name=username;
            user.user_password=password;
            user.display_name=name;
            user.display_avatar=avatar;
            user.save();
            return ok(Json.toJson(user));
        }
        return ok(Json.toJson(u));
    }

    public Result getProfile(Long user_id) {
        System.out.println("Getting profile");

        User u = User.findById(user_id);
        return ok(Json.toJson(u));
    }

}
