
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/myusernamesthis/Documents/team7_follow/ebean-backend/conf/routes
// @DATE:Thu Apr 28 10:20:59 CDT 2022


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
