
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
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(categories: List[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*2.2*/main("Signup")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""

<head>
    
    <title>Sign up | Sign up page</title>
    
</head>

<body>

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
        """),_display_(Seq[Any](/*31.10*/for(category <- categories) yield /*31.37*/{_display_(Seq[Any](format.raw/*31.38*/("""
        <option>"""),_display_(Seq[Any](/*32.18*/category/*32.26*/.catName)),format.raw/*32.34*/("""</option>
        """)))})),format.raw/*33.10*/("""
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

</body>

""")))})))}
    }
    
    def render(categories:List[Category]): play.api.templates.HtmlFormat.Appendable = apply(categories)
    
    def f:((List[Category]) => play.api.templates.HtmlFormat.Appendable) = (categories) => apply(categories)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 03 22:17:21 EET 2014
                    SOURCE: /home/mohamed/Documents/PicPuzzle/app/views/signUp.scala.html
                    HASH: 78fc126f1f7e3b0a3a4b9b1ded0dfb6d917c1545
                    MATRIX: 783->1|905->29|941->31|963->45|1001->46|2027->1036|2070->1063|2109->1064|2163->1082|2180->1090|2210->1098|2261->1117
                    LINES: 26->1|29->1|30->2|30->2|30->2|59->31|59->31|59->31|60->32|60->32|60->32|61->33
                    -- GENERATED --
                */
            