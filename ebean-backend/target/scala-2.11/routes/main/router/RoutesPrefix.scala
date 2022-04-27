
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Zachary/Documents/Spring2022/CS4345/team7_follow/ebean-backend/conf/routes
// @DATE:Wed Apr 27 17:12:07 CDT 2022


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
