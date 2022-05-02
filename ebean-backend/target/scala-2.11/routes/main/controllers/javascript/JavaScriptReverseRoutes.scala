
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/myusernamesthis/Documents/team7_follow/ebean-backend/conf/routes
// @DATE:Thu Apr 28 10:20:59 CDT 2022

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:18
    def getProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getProfile",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0)})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:12
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseFollowController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getFollowers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.getFollowers",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0) + "/in"})
        }
      """
    )
  
    // @LINE:36
    def getNumFollowers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.getNumFollowers",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0) + "/in/count"})
        }
      """
    )
  
    // @LINE:33
    def getFollowing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.getFollowing",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0) + "/out"})
        }
      """
    )
  
    // @LINE:21
    def follow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.follow",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows"})
          }
        
        }
      """
    )
  
    // @LINE:39
    def getNumFollowing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.getNumFollowing",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0) + "/out/count"})
        }
      """
    )
  
    // @LINE:27
    def unfollow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowController.unfollow",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/out"})
        }
      """
    )
  
  }


}
