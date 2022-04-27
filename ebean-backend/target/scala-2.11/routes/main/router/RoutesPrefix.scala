
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/myusernamesthis/Documents/team7_follow/ebean-backend/conf/routes
// @DATE:Wed Apr 27 17:18:29 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
