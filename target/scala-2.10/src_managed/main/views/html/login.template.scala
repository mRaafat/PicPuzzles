
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Form[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User, helpForm: Form[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(Seq[Any](/*3.2*/main("User")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	<head>
	<style>
		.cell """),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""width:100px;height:100px;"""),format.raw/*6.35*/("""}"""),format.raw/*6.36*/("""
	</style>
	<script>

	function postImages()"""),format.raw/*10.23*/("""{"""),format.raw/*10.24*/("""
		document.getElementById("img1").src=""""),_display_(Seq[Any](/*11.41*/routes/*11.47*/.Assets.at("images/plant2.jpg"))),format.raw/*11.78*/("""";
	"""),format.raw/*12.2*/("""}"""),format.raw/*12.3*/("""

	function allowDrop(ev)
	"""),format.raw/*15.2*/("""{"""),format.raw/*15.3*/("""
	ev.preventDefault();
	"""),format.raw/*17.2*/("""}"""),format.raw/*17.3*/("""

	function drag(ev)
	"""),format.raw/*20.2*/("""{"""),format.raw/*20.3*/("""
	ev.dataTransfer.setData("Text",ev.target.id);
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/("""

	function drop(ev)
	"""),format.raw/*25.2*/("""{"""),format.raw/*25.3*/("""
	var me = document.getElementById(ev.target.id);
	ev.preventDefault();
	var data=ev.dataTransfer.getData("Text");
	var pic = document.getElementById(data);
	var temp = pic.src;
	pic.src = me.src;
	me.src = temp;
	"""),format.raw/*33.2*/("""}"""),format.raw/*33.3*/("""
	</script>
	</head>
	<body onload="javascript:postImages()">

	"""),_display_(Seq[Any](/*38.3*/helper/*38.9*/.form(action = routes.Application.validateLogin())/*38.59*/ {_display_(Seq[Any](format.raw/*38.61*/("""
	<span id="testy"></span>
	<table border="1">
	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
		<img id="img1" src=""""),_display_(Seq[Any](/*43.24*/routes/*43.30*/.Assets.at("images/plant1.jpg"))),format.raw/*43.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img2" src="images/wheels.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img3" src="images/sm-ala2ona.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img4" src="images/sm-ala2ona.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img5" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img6" src="images/wheels.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img7" src="images/sm-ala2ona.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img8" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img9" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img10" src="images/wheels.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img11" src="images/sm-ala2ona.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img12" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img13" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img14" src="images/wheels.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img15" src="images/sm-ala2ona.png" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)"><img id="img16" src="images/me.jpg" draggable="true" ondragstart="drag(event)" width="99" height="99"></td>
	</tr>
	</table>
	""")))})),format.raw/*70.3*/("""
	</body>
""")))})))}
    }
    
    def render(user:User,helpForm:Form[Category]): play.api.templates.HtmlFormat.Appendable = apply(user,helpForm)
    
    def f:((User,Form[Category]) => play.api.templates.HtmlFormat.Appendable) = (user,helpForm) => apply(user,helpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 20:21:58 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/login.scala.html
                    HASH: 55f6dae2651e378a16066da543f3c04a72169f27
                    MATRIX: 787->1|919->39|956->42|976->54|1015->56|1067->82|1095->83|1147->108|1175->109|1247->153|1276->154|1353->195|1368->201|1421->232|1452->236|1480->237|1534->264|1562->265|1613->289|1641->290|1690->312|1718->313|1794->362|1822->363|1871->385|1899->386|2140->600|2168->601|2268->666|2282->672|2341->722|2381->724|2564->871|2579->877|2632->908|5543->3788
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|38->10|38->10|39->11|39->11|39->11|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|50->22|50->22|53->25|53->25|61->33|61->33|66->38|66->38|66->38|66->38|71->43|71->43|71->43|98->70
                    -- GENERATED --
                */
            