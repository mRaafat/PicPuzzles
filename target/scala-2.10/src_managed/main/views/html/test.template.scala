
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.13*/("""
"""),_display_(Seq[Any](/*4.2*/main("test")/*4.14*/{_display_(Seq[Any](format.raw/*4.15*/("""
""")))})),format.raw/*5.2*/("""
"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 15:27:48 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/test.scala.html
                    HASH: 45027212524a0e017f574412de9ce9299e404e7e
                    MATRIX: 771->1|926->12|962->65|982->77|1020->78|1052->80
                    LINES: 26->1|32->1|33->4|33->4|33->4|34->5
                    -- GENERATED --
                */
            