
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/myusernamesthis/Documents/team7_follow/ebean-backend/conf/routes
// @DATE:Thu Apr 28 10:20:59 CDT 2022

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:18
    def getProfile(user_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("user_id", user_id))
    }
  
    // @LINE:9
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def registerNew(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:21
  class ReverseFollowController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getFollowers(user_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "follows/" + implicitly[PathBindable[Long]].unbind("user_id", user_id) + "/in")
    }
  
    // @LINE:36
    def getNumFollowers(user_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "follows/" + implicitly[PathBindable[Long]].unbind("user_id", user_id) + "/in/count")
    }
  
    // @LINE:33
    def getFollowing(user_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "follows/" + implicitly[PathBindable[Long]].unbind("user_id", user_id) + "/out")
    }
  
    // @LINE:21
    def follow(): Call = {
    
      () match {
      
        // @LINE:21
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "follows")
      
      }
    
    }
  
    // @LINE:39
    def getNumFollowing(user_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "follows/" + implicitly[PathBindable[Long]].unbind("user_id", user_id) + "/out/count")
    }
  
    // @LINE:27
    def unfollow(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "follows/out")
    }
  
  }


}
