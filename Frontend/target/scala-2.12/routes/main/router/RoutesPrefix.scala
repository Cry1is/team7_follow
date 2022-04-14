// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Zachary/Downloads/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Tue Feb 22 11:59:15 CST 2022


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
