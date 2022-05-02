
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/myusernamesthis/Documents/team7_follow/ebean-backend/conf/routes
// @DATE:Thu Apr 28 10:20:59 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:21
  FollowController_2: controllers.FollowController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:21
    FollowController_2: controllers.FollowController
  ) = this(errorHandler, HomeController_0, UserController_1, FollowController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, FollowController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """user_id<[^/]+>""", """controllers.UserController.getProfile(user_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows""", """controllers.FollowController.follow()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/in""", """controllers.FollowController.follow()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/out""", """controllers.FollowController.unfollow()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/""" + "$" + """user_id<[^/]+>/in""", """controllers.FollowController.getFollowers(user_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/""" + "$" + """user_id<[^/]+>/out""", """controllers.FollowController.getFollowing(user_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/""" + "$" + """user_id<[^/]+>/in/count""", """controllers.FollowController.getNumFollowers(user_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/""" + "$" + """user_id<[^/]+>/out/count""", """controllers.FollowController.getNumFollowing(user_id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_getUsers3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers3_invoker = createInvoker(
    UserController_1.getUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      """ Get Users""",
      this.prefix + """users"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_getProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("user_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getProfile4_invoker = createInvoker(
    UserController_1.getProfile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getProfile",
      Seq(classOf[Long]),
      "GET",
      """ Get User""",
      this.prefix + """users/""" + "$" + """user_id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FollowController_follow5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows")))
  )
  private[this] lazy val controllers_FollowController_follow5_invoker = createInvoker(
    FollowController_2.follow(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "follow",
      Nil,
      "POST",
      """ Follow a particular user""",
      this.prefix + """follows"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_FollowController_follow6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/in")))
  )
  private[this] lazy val controllers_FollowController_follow6_invoker = createInvoker(
    FollowController_2.follow(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "follow",
      Nil,
      "POST",
      """ Remove a particular Follower (Block them from following you)""",
      this.prefix + """follows/in"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_FollowController_unfollow7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/out")))
  )
  private[this] lazy val controllers_FollowController_unfollow7_invoker = createInvoker(
    FollowController_2.unfollow(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "unfollow",
      Nil,
      "POST",
      """ Unfollow a particular user""",
      this.prefix + """follows/out"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_FollowController_getFollowers8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/"), DynamicPart("user_id", """[^/]+""",true), StaticPart("/in")))
  )
  private[this] lazy val controllers_FollowController_getFollowers8_invoker = createInvoker(
    FollowController_2.getFollowers(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "getFollowers",
      Seq(classOf[Long]),
      "GET",
      """ Get all the followers of a particular user""",
      this.prefix + """follows/""" + "$" + """user_id<[^/]+>/in"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_FollowController_getFollowing9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/"), DynamicPart("user_id", """[^/]+""",true), StaticPart("/out")))
  )
  private[this] lazy val controllers_FollowController_getFollowing9_invoker = createInvoker(
    FollowController_2.getFollowing(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "getFollowing",
      Seq(classOf[Long]),
      "GET",
      """ Get all the following of a particular user""",
      this.prefix + """follows/""" + "$" + """user_id<[^/]+>/out"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_FollowController_getNumFollowers10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/"), DynamicPart("user_id", """[^/]+""",true), StaticPart("/in/count")))
  )
  private[this] lazy val controllers_FollowController_getNumFollowers10_invoker = createInvoker(
    FollowController_2.getNumFollowers(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "getNumFollowers",
      Seq(classOf[Long]),
      "GET",
      """Get the number of people who follows a user""",
      this.prefix + """follows/""" + "$" + """user_id<[^/]+>/in/count"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_FollowController_getNumFollowing11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/"), DynamicPart("user_id", """[^/]+""",true), StaticPart("/out/count")))
  )
  private[this] lazy val controllers_FollowController_getNumFollowing11_invoker = createInvoker(
    FollowController_2.getNumFollowing(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowController",
      "getNumFollowing",
      Seq(classOf[Long]),
      "GET",
      """Get the number of people following a particular user""",
      this.prefix + """follows/""" + "$" + """user_id<[^/]+>/out/count"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:12
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:15
    case controllers_UserController_getUsers3_route(params) =>
      call { 
        controllers_UserController_getUsers3_invoker.call(UserController_1.getUsers())
      }
  
    // @LINE:18
    case controllers_UserController_getProfile4_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_UserController_getProfile4_invoker.call(UserController_1.getProfile(user_id))
      }
  
    // @LINE:21
    case controllers_FollowController_follow5_route(params) =>
      call { 
        controllers_FollowController_follow5_invoker.call(FollowController_2.follow())
      }
  
    // @LINE:24
    case controllers_FollowController_follow6_route(params) =>
      call { 
        controllers_FollowController_follow6_invoker.call(FollowController_2.follow())
      }
  
    // @LINE:27
    case controllers_FollowController_unfollow7_route(params) =>
      call { 
        controllers_FollowController_unfollow7_invoker.call(FollowController_2.unfollow())
      }
  
    // @LINE:30
    case controllers_FollowController_getFollowers8_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_FollowController_getFollowers8_invoker.call(FollowController_2.getFollowers(user_id))
      }
  
    // @LINE:33
    case controllers_FollowController_getFollowing9_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_FollowController_getFollowing9_invoker.call(FollowController_2.getFollowing(user_id))
      }
  
    // @LINE:36
    case controllers_FollowController_getNumFollowers10_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_FollowController_getNumFollowers10_invoker.call(FollowController_2.getNumFollowers(user_id))
      }
  
    // @LINE:39
    case controllers_FollowController_getNumFollowing11_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_FollowController_getNumFollowing11_invoker.call(FollowController_2.getNumFollowing(user_id))
      }
  }
}
