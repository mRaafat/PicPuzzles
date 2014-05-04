
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
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.50*/("""
"""),_display_(Seq[Any](/*3.2*/main("Signup")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""

<head>
    
    <title>Sign up | Sign up page</title>
    
</head>

<body>

    """),_display_(Seq[Any](/*13.6*/helper/*13.12*/.form(routes.Application.signUp())/*13.46*/{_display_(Seq[Any](format.raw/*13.47*/("""
    <div class="container">

      <form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please enter your details below</h2>
        <input type="text" class="form-control" placeholder="Name" required>
        <input type="email" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <div class="text-center">
            
        <button class="btn btn-primary btn-block" type="submit">Sign up</button>
            
        </div>
        <div class="row">
            <div class="col-md-6">
        <p> <h3>Choose a category then choose corresoponding places</h3></p>
        <select class="form-control" title="choose a category" name="Categories" >
        """),_display_(Seq[Any](/*33.10*/for(category <- categories) yield /*33.37*/{_display_(Seq[Any](format.raw/*33.38*/("""
        <option>"""),_display_(Seq[Any](/*34.18*/category/*34.26*/.catName)),format.raw/*34.34*/("""</option>
        """)))})),format.raw/*35.10*/("""
        </select>
            </div>
            <div class="col-md-6">
                <div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="1">1</button>
                </div> <div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="2">2</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="3">3</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="4">4</button><br>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="5">5</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="6">6</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block " id="7">7</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="8 ">8</button><br>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="9">9</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="10">10</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="11">11</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="12">12</button><br>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="13">13</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="14">14</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="15">15</button>
                 </div><div class="col-md-3">
                <button type="button" class="btn btn-default btn-block" id="16">16</button>
                 </div>
            </div>
        </div>        
      </form>
    </div>
    """)))})),format.raw/*76.6*/("""
</body>
""")))})))}
    }
    
    def render(categories:List[Category],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(categories,userForm)
    
    def f:((List[Category],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (categories,userForm) => apply(categories,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 08:54:40 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/signUp.scala.html
                    HASH: 413de473b4f1698e4d5c33d35f27e883f7391ef6
                    MATRIX: 794->1|969->49|1005->85|1027->99|1065->100|1183->183|1198->189|1241->223|1280->224|2229->1137|2272->1164|2311->1165|2365->1183|2382->1191|2412->1199|2463->1218|4860->3584
                    LINES: 26->1|30->1|31->3|31->3|31->3|41->13|41->13|41->13|41->13|61->33|61->33|61->33|62->34|62->34|62->34|63->35|104->76
                    -- GENERATED --
                */
            