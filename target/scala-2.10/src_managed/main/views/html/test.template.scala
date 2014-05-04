
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:User, number: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*4.2*/main("test")/*4.14*/{_display_(Seq[Any](format.raw/*4.15*/("""
"""),_display_(Seq[Any](/*5.2*/user/*5.6*/.category1)),format.raw/*5.16*/(""" """),_display_(Seq[Any](/*5.18*/number)),format.raw/*5.24*/("""
""")))})))}
    }
    
    def render(user:User,number:Integer): play.api.templates.HtmlFormat.Appendable = apply(user,number)
    
    def f:((User,Integer) => play.api.templates.HtmlFormat.Appendable) = (user,number) => apply(user,number)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 12:35:55 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/test.scala.html
                    HASH: 3b6f96b74a7b732b7e87e6db549d828880cc59d9
                    MATRIX: 779->1|951->29|987->82|1007->94|1045->95|1081->97|1092->101|1123->111|1160->113|1187->119
                    LINES: 26->1|32->1|33->4|33->4|33->4|34->5|34->5|34->5|34->5|34->5
                    -- GENERATED --
                */
            