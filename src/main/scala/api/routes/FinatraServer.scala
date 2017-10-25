package api.routes

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import api.controllers.UserController

class FinatraServer extends HttpServer {
  override protected def configureHttp(router: HttpRouter): Unit = {
    router.add(new UserController)
  }
}
