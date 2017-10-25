package api.controllers

import com.twitter.finagle.http.Request
import com.twitter.finagle.mux.Response
import com.twitter.finatra.http.Controller
class UserController extends Controller {
  get("/hello") {
    _ : Request => "<h1>Hello</h1>"
  }
}
