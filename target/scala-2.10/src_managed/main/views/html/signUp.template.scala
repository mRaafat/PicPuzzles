
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
<<<<<<< HEAD
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.50*/("""
"""),_display_(Seq[Any](/*3.2*/main("Signup")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
=======
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.50*/("""
"""),_display_(Seq[Any](/*4.2*/main("Signup")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af

<head>
    
    <title>Sign up | Sign up page</title>
    
</head>

<body>
<<<<<<< HEAD

    """),_display_(Seq[Any](/*13.6*/helper/*13.12*/.form(routes.Application.signUp())/*13.46*/{_display_(Seq[Any](format.raw/*13.47*/("""
=======
<fieldset>
    """),_display_(Seq[Any](/*14.6*/helper/*14.12*/.form(routes.Application.signUp())/*14.46*/{_display_(Seq[Any](format.raw/*14.47*/("""
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
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
<<<<<<< HEAD
            <div class="col-md-6">
        <p> <h3>Choose a category then choose corresoponding places</h3></p>
        <select class="form-control" title="choose a category" name="Categories" >
        """),_display_(Seq[Any](/*33.10*/for(category <- categories) yield /*33.37*/{_display_(Seq[Any](format.raw/*33.38*/("""
        <option>"""),_display_(Seq[Any](/*34.18*/category/*34.26*/.catName)),format.raw/*34.34*/("""</option>
        """)))})),format.raw/*35.10*/("""
        </select>
=======
    
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
            </div>
       
                    <input name="action" type="submit" value="Save">
                        <input name="action" type="submit" value="Save">
                            <input name="action" type="submit" value="Save">
                                <input name="action" type="submit" value="Save">
                                    <input name="action" type="submit" value="Save">
                 <div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="2" name="num">2</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="3"name="num">3</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="4"name="num">4</button><br>
                 </div><div class="col-md-3">
                <button type="submit" class="btn btn-default btn-block" value="5"name="num">5</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="6"name="num">6</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block " value="7"name="num">7</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="8 "name="num">8</button><br>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="9"name="num">9</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="10"name="num">10</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="11"name="num">11</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="12"name="num">12</button><br>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="13"name="num">13</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="14"name="num">14</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="15"name="num">15</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" value="16"name="num">16</button>
                 </div>
            </div>
        </div>        
      </form>
    </div>
<<<<<<< HEAD
    """)))})),format.raw/*76.6*/("""
</body>
""")))})))}
=======
   </body>
    """)))})),format.raw/*95.6*/("""

""")))})),format.raw/*97.2*/("""
""")))})),format.raw/*98.2*/("""
"""))}
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
    }
    
    def render(categories:List[Category],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(categories,userForm)
    
    def f:((List[Category],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (categories,userForm) => apply(categories,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sun May 04 08:54:40 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/signUp.scala.html
                    HASH: 413de473b4f1698e4d5c33d35f27e883f7391ef6
                    MATRIX: 794->1|969->49|1005->85|1027->99|1065->100|1183->183|1198->189|1241->223|1280->224|2229->1137|2272->1164|2311->1165|2365->1183|2382->1191|2412->1199|2463->1218|4860->3584
                    LINES: 26->1|30->1|31->3|31->3|31->3|41->13|41->13|41->13|41->13|61->33|61->33|61->33|62->34|62->34|62->34|63->35|104->76
=======
                    DATE: Sun May 04 12:18:09 EET 2014
                    SOURCE: /home/mohamed/Documents/PicPuzzle/app/views/signUp.scala.html
                    HASH: 60d2646f39e5a7882188fc5221d5bb99531da7d9
                    MATRIX: 794->1|986->49|1022->102|1044->116|1082->117|1210->210|1225->216|1268->250|1307->251|1504->412|1611->497|1658->508|1857->685|1920->712|2078->848|2131->865|2146->871|2215->931|2254->932|2391->1033|2434->1060|2473->1061|2527->1079|2544->1087|2574->1095|2625->1114|5742->4200|5776->4203|5809->4205
                    LINES: 26->1|32->1|33->4|33->4|33->4|43->14|43->14|43->14|43->14|48->19|51->22|52->23|56->27|58->29|61->32|63->34|63->34|63->34|63->34|65->36|65->36|65->36|66->37|66->37|66->37|67->38|124->95|126->97|127->98
>>>>>>> 54fc45df253886bde714d000874945b7dc6820af
                    -- GENERATED --
                */
            