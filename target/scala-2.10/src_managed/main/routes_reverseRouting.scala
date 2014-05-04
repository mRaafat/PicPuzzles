// @SOURCE:/Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/conf/routes
// @HASH:4851b580354308dab7050584e5a9b1d842b5b1cf
// @DATE:Sun May 04 15:22:53 EET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def validateLogin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "validateLogin")
}
                                                

// @LINE:14
def success(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "success")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def validateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin"})
      }
   """
)
                        

// @LINE:14
def success : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.success",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "success"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:11
def validateLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Seq(), "GET", """""", _prefix + """validateLogin""")
)
                      

// @LINE:14
def success(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.success(), HandlerDef(this, "controllers.Application", "success", Seq(), "GET", """""", _prefix + """success""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    