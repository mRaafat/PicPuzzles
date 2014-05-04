// @SOURCE:/Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/conf/routes
// @HASH:e2b784e0a25384bc6806e99a51e3651aa8f9d1d4
// @DATE:Sun May 04 15:29:52 EET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_signUp1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_chooseGridSeq2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("e"))))
        

// @LINE:12
private[this] lazy val controllers_Application_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:14
private[this] lazy val controllers_Application_validateLogin4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validateLogin"))))
        

// @LINE:17
private[this] lazy val controllers_Application_success5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("success"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.signUp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """e""","""controllers.Application.chooseGridSeq(user:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validateLogin""","""controllers.Application.validateLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """success""","""controllers.Application.success()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_signUp1(params) => {
   call { 
        invokeHandler(controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_chooseGridSeq2(params) => {
   call(params.fromQuery[String]("user", None)) { (user) =>
        invokeHandler(controllers.Application.chooseGridSeq(user), HandlerDef(this, "controllers.Application", "chooseGridSeq", Seq(classOf[String]),"GET", """""", Routes.prefix + """e"""))
   }
}
        

// @LINE:12
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:14
case controllers_Application_validateLogin4(params) => {
   call { 
        invokeHandler(controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Nil,"GET", """""", Routes.prefix + """validateLogin"""))
   }
}
        

// @LINE:17
case controllers_Application_success5(params) => {
   call { 
        invokeHandler(controllers.Application.success(), HandlerDef(this, "controllers.Application", "success", Nil,"GET", """""", Routes.prefix + """success"""))
   }
}
        

// @LINE:20
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     