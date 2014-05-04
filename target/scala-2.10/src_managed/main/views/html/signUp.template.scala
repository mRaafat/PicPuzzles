
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
  
            """),_display_(Seq[Any](/*34.14*/helper/*34.20*/.form(action=routes.Application.signUp(),'id ->"Categories")/*34.80*/{_display_(Seq[Any](format.raw/*34.81*/("""
                <select class="form-control" title="choose a category" name="Categories" >
        """),_display_(Seq[Any](/*36.10*/for(category <- categories) yield /*36.37*/{_display_(Seq[Any](format.raw/*36.38*/("""
        <option>"""),_display_(Seq[Any](/*37.18*/category/*37.26*/.catName)),format.raw/*37.34*/("""</option>
        """)))})),format.raw/*38.10*/("""

        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <div class="text-center">
            
        <button class="btn btn-primary btn-block" type="submit">Sign up</button> <br>
            
        </div>
        <div class="row">
    
            </div>
            <div class="col-md-6">
                <div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="1" name="num">1</button>
                </div> <div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="2" name="num">2</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="3"name="num">3</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="4"name="num">4</button><br>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="5"name="num">5</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="6"name="num">6</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block " value="7"name="num">7</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="8 "name="num">8</button><br>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="9"name="num">9</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="10"name="num">10</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="11"name="num">11</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="12"name="num">12</button><br>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="13"name="num">13</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="14"name="num">14</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="15"name="num">15</button>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="16"name="num">16</button>
                 </div>
            </div>
        </div>
        
      </form>

    </div>
   </body>
    """)))})),format.raw/*92.6*/("""

""")))})),format.raw/*94.2*/("""
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(categories:List[Category],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(categories,userForm)
    
    def f:((List[Category],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (categories,userForm) => apply(categories,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 12:35:55 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/signUp.scala.html
                    HASH: 3bdd0dc8669eab43bc8c1c702717b01a76af35b9
                    MATRIX: 794->1|986->49|1022->102|1044->116|1082->117|1210->210|1225->216|1268->250|1307->251|1504->412|1611->497|1658->508|1857->685|1920->712|2078->848|2131->865|2146->871|2215->931|2254->932|2391->1033|2434->1060|2473->1061|2527->1079|2544->1087|2574->1095|2625->1114|5536->3994|5570->3997|5603->3999
                    LINES: 26->1|32->1|33->4|33->4|33->4|43->14|43->14|43->14|43->14|48->19|51->22|52->23|56->27|58->29|61->32|63->34|63->34|63->34|63->34|65->36|65->36|65->36|66->37|66->37|66->37|67->38|121->92|123->94|124->95
                    -- GENERATED --
                */
            