
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Zachary/Documents/Spring2022/CS4345/team7_follow/ebean-backend/conf/routes
// @DATE:Mon Apr 18 16:59:09 CDT 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFollowController FollowController = new controllers.ReverseFollowController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFollowController FollowController = new controllers.javascript.ReverseFollowController(RoutesPrefix.byNamePrefix());
  }

}
