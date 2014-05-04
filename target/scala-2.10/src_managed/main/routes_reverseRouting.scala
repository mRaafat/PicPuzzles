<<<<<<< HEAD
// @SOURCE:/Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/conf/routes
// @HASH:a56d73997666753319ac081b917ae72aeed5a7bd
// @DATE:Sun May 04 08:53:00 EET 2014
=======
// @SOURCE:/home/mohamed/Documents/PicPuzzle/conf/routes
// @HASH:4978330a440cf0765c2a4b29ec9d77d9c1abee02
// @DATE:Sun May 04 02:16:46 EET 2014
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


<<<<<<< HEAD
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
class ReverseAssets {
    

// @LINE:10
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

<<<<<<< HEAD
// @LINE:8
=======
// @LINE:7
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


<<<<<<< HEAD
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:10
class ReverseAssets {
    

// @LINE:10
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

<<<<<<< HEAD
// @LINE:8
=======
// @LINE:7
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
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
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
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
        


<<<<<<< HEAD
// @LINE:11
// @LINE:8
=======
// @LINE:10
// @LINE:7
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
// @LINE:6
package controllers.ref {


<<<<<<< HEAD
// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:10
class ReverseAssets {
    

// @LINE:10
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

<<<<<<< HEAD
// @LINE:8
=======
// @LINE:7
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    