// @SOURCE:/Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/conf/routes
// @HASH:e2b784e0a25384bc6806e99a51e3651aa8f9d1d4
// @DATE:Sun May 04 15:29:52 EET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:14
def validateLogin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "validateLogin")
}
                                                

// @LINE:10
def chooseGridSeq(user:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "e" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("user", user)))))
}
                                                

// @LINE:17
def success(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "success")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
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
                        

// @LINE:14
def validateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin"})
      }
   """
)
                        

// @LINE:10
def chooseGridSeq : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chooseGridSeq",
   """
      function(user) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "e" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("user", user)])})
      }
   """
)
                        

// @LINE:17
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
                        

// @LINE:12
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
        


// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:14
def validateLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Seq(), "GET", """""", _prefix + """validateLogin""")
)
                      

// @LINE:10
def chooseGridSeq(user:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chooseGridSeq(user), HandlerDef(this, "controllers.Application", "chooseGridSeq", Seq(classOf[String]), "GET", """""", _prefix + """e""")
)
                      

// @LINE:17
def success(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.success(), HandlerDef(this, "controllers.Application", "success", Seq(), "GET", """""", _prefix + """success""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    