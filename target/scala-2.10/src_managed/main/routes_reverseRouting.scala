// @SOURCE:/Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/conf/routes
// @HASH:7590de50fef01b8c50c02cced5959e56007af3f7
// @DATE:Mon May 05 05:02:44 EET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
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
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def loginUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginUser")
}
                                                

// @LINE:8
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:15
def validateLogin(email:String, cp:java.util.List[Integer], c:java.util.List[Integer], p:java.util.List[Integer]): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "validateLogin" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)), Some(implicitly[QueryStringBindable[java.util.List[Integer]]].unbind("cp", cp)), Some(implicitly[QueryStringBindable[java.util.List[Integer]]].unbind("c", c)), Some(implicitly[QueryStringBindable[java.util.List[Integer]]].unbind("p", p)))))
}
                                                

// @LINE:10
def chooseGridSeq(user:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "gridSeq" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("user", user)))))
}
                                                

// @LINE:17
def success(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "success")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
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
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def loginUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser"})
      }
   """
)
                        

// @LINE:8
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:15
def validateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateLogin",
   """
      function(email,cp,c,p) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[java.util.List[Integer]]].javascriptUnbind + """)("cp", cp), (""" + implicitly[QueryStringBindable[java.util.List[Integer]]].javascriptUnbind + """)("c", c), (""" + implicitly[QueryStringBindable[java.util.List[Integer]]].javascriptUnbind + """)("p", p)])})
      }
   """
)
                        

// @LINE:10
def chooseGridSeq : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chooseGridSeq",
   """
      function(user) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "gridSeq" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("user", user)])})
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
                        
    
}
              
}
        


// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
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
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def loginUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginUser(), HandlerDef(this, "controllers.Application", "loginUser", Seq(), "GET", """""", _prefix + """loginUser""")
)
                      

// @LINE:8
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:15
def validateLogin(email:String, cp:java.util.List[Integer], c:java.util.List[Integer], p:java.util.List[Integer]): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateLogin(email, cp, c, p), HandlerDef(this, "controllers.Application", "validateLogin", Seq(classOf[String], classOf[java.util.List[Integer]], classOf[java.util.List[Integer]], classOf[java.util.List[Integer]]), "POST", """""", _prefix + """validateLogin""")
)
                      

// @LINE:10
def chooseGridSeq(user:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chooseGridSeq(user), HandlerDef(this, "controllers.Application", "chooseGridSeq", Seq(classOf[String]), "POST", """""", _prefix + """gridSeq""")
)
                      

// @LINE:17
def success(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.success(), HandlerDef(this, "controllers.Application", "success", Seq(), "GET", """""", _prefix + """success""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    