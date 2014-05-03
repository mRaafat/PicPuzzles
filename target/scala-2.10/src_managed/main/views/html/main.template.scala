
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.48*/routes/*8.54*/.Assets.at("stylesheets/jumbotron-narrow.css"))),format.raw/*8.100*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.100*/("""">
                <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.62*/routes/*10.68*/.Assets.at("stylesheets/signin.css"))),format.raw/*10.104*/("""">
	    <script src=""""),_display_(Seq[Any](/*11.20*/routes/*11.26*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.71*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(Seq[Any](/*12.20*/routes/*12.26*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*12.68*/("""" type="text/javascript"></script>
            
    </head>
    <body>
        """),_display_(Seq[Any](/*16.10*/content)),format.raw/*16.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 03 17:29:12 EET 2014
                    SOURCE: /home/mohamed/Documents/PicPuzzle/app/views/main.scala.html
                    HASH: 33e7a7202bad571154aef01b499d52d7e83db9b8
                    MATRIX: 778->1|902->31|990->84|1016->89|1107->145|1121->151|1189->197|1277->250|1291->256|1356->299|1456->363|1471->369|1530->405|1588->427|1603->433|1670->478|1760->532|1775->538|1839->580|1955->660|1984->667
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16
                    -- GENERATED --
                */
            