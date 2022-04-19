
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Zachary/Documents/Spring2022/CS4345/team7_follow/ebean-backend/conf/routes
// @DATE:Mon Apr 18 16:59:09 CDT 2022


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
