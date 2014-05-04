
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Category],Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(categories: List[Category],userForm:Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.50*/("""
"""),_display_(Seq[Any](/*4.2*/main("Signup")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""

<head>
    
    <title>Sign up | Sign up page</title>
    
</head>

<body>
<fieldset>
    """),_display_(Seq[Any](/*14.6*/helper/*14.12*/.form(routes.Application.signUp())/*14.46*/{_display_(Seq[Any](format.raw/*14.47*/("""
    <div class="container">

      <form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please enter your details below</h2>
        """),_display_(Seq[Any](/*19.10*/inputText(
            userForm("name"),
            '_label -> "Full name"
        ))),format.raw/*22.10*/("""
         """),_display_(Seq[Any](/*23.11*/inputPassword(
                userForm("password"), 
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            ))),format.raw/*27.14*/("""
            
            """),_display_(Seq[Any](/*29.14*/inputText(
                userForm("email"), '_label -> "Email",
                '_help -> "Enter a valid email address."
            ))),format.raw/*32.14*/("""
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <div class="text-center">  
            <button class="btn btn-primary btn-block" type="submit">Sign up</button> <br> 
        </div>
        
      </form>

    </div>
   </body>
    

    """)))})),format.raw/*46.6*/("""

""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(categories:List[Category],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(categories,userForm)
    
    def f:((List[Category],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (categories,userForm) => apply(categories,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 15:27:48 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/signUp.scala.html
                    HASH: 98a7eedd16059a5d0115461f6225464ed8a30c23
                    MATRIX: 794->1|986->49|1022->102|1044->116|1082->117|1210->210|1225->216|1268->250|1307->251|1504->412|1611->497|1658->508|1857->685|1920->712|2078->848|2425->1164|2459->1167
                    LINES: 26->1|32->1|33->4|33->4|33->4|43->14|43->14|43->14|43->14|48->19|51->22|52->23|56->27|58->29|61->32|75->46|77->48
                    -- GENERATED --
                */
            