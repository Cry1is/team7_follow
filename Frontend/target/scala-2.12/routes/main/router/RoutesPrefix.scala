// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myusernamesthis/cs4345/team7_follow/Frontend/conf/routes
// @DATE:Wed Apr 20 22:05:25 CDT 2022


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
