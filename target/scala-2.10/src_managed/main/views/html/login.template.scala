
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[User,List[Integer],List[Integer],List[Integer],Form[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User, pics:List[Integer],categories:List[Integer],places:List[Integer],helpForm: Form[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.105*/("""

"""),_display_(Seq[Any](/*3.2*/main("User")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	<head>
	<style>
		.cell """),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""width:100px;height:100px;"""),format.raw/*6.35*/("""}"""),format.raw/*6.36*/("""
	</style>
	<script>

	function postImages()"""),format.raw/*10.23*/("""{"""),format.raw/*10.24*/("""
		document.getElementById("img"+"""),_display_(Seq[Any](/*11.34*/places/*11.40*/.get(0))),format.raw/*11.47*/(""").src=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at(Picture.find.byId(pics.get(0)).image_link))),format.raw/*11.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*12.34*/places/*12.40*/.get(1))),format.raw/*12.47*/(""").src=""""),_display_(Seq[Any](/*12.55*/routes/*12.61*/.Assets.at(Picture.find.byId(pics.get(1)).image_link))),format.raw/*12.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*13.34*/places/*13.40*/.get(2))),format.raw/*13.47*/(""").src=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at(Picture.find.byId(pics.get(2)).image_link))),format.raw/*13.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*14.34*/places/*14.40*/.get(3))),format.raw/*14.47*/(""").src=""""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at(Picture.find.byId(pics.get(3)).image_link))),format.raw/*14.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*15.34*/places/*15.40*/.get(4))),format.raw/*15.47*/(""").src=""""),_display_(Seq[Any](/*15.55*/routes/*15.61*/.Assets.at(Picture.find.byId(pics.get(4)).image_link))),format.raw/*15.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*16.34*/places/*16.40*/.get(5))),format.raw/*16.47*/(""").src=""""),_display_(Seq[Any](/*16.55*/routes/*16.61*/.Assets.at(Picture.find.byId(pics.get(5)).image_link))),format.raw/*16.114*/("""";
	"""),format.raw/*17.2*/("""}"""),format.raw/*17.3*/("""

	function allowDrop(ev)
	"""),format.raw/*20.2*/("""{"""),format.raw/*20.3*/("""
	ev.preventDefault();
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/("""

	function drag(ev)
	"""),format.raw/*25.2*/("""{"""),format.raw/*25.3*/("""
	ev.dataTransfer.setData("Text",ev.target.id);
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/("""

	function drop(ev)
	"""),format.raw/*30.2*/("""{"""),format.raw/*30.3*/("""
	var me = document.getElementById(ev.target.id);
	ev.preventDefault();
	var data=ev.dataTransfer.getData("Text");
	var pic = document.getElementById(data);
	var temp = pic.src;
	pic.src = me.src;
	me.src = temp;
	"""),format.raw/*38.2*/("""}"""),format.raw/*38.3*/("""
	</script>
	</head>
	<body onload="javascript:postImages()">

	"""),_display_(Seq[Any](/*43.3*/helper/*43.9*/.form(action = routes.Application.validateLogin())/*43.59*/ {_display_(Seq[Any](format.raw/*43.61*/("""
	<span id="testy"></span>
	<table border="1">
	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img1" src=""""),_display_(Seq[Any](/*48.25*/routes/*48.31*/.Assets.at("images/white.png"))),format.raw/*48.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img2" src=""""),_display_(Seq[Any](/*51.25*/routes/*51.31*/.Assets.at("images/white.png"))),format.raw/*51.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img3" src=""""),_display_(Seq[Any](/*54.25*/routes/*54.31*/.Assets.at("images/white.png"))),format.raw/*54.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img4" src=""""),_display_(Seq[Any](/*57.25*/routes/*57.31*/.Assets.at("images/white.png"))),format.raw/*57.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img5" src=""""),_display_(Seq[Any](/*63.25*/routes/*63.31*/.Assets.at("images/white.png"))),format.raw/*63.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img6" src=""""),_display_(Seq[Any](/*66.25*/routes/*66.31*/.Assets.at("images/white.png"))),format.raw/*66.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img7" src=""""),_display_(Seq[Any](/*69.25*/routes/*69.31*/.Assets.at("images/white.png"))),format.raw/*69.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img8" src=""""),_display_(Seq[Any](/*72.25*/routes/*72.31*/.Assets.at("images/white.png"))),format.raw/*72.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img9" src=""""),_display_(Seq[Any](/*78.25*/routes/*78.31*/.Assets.at("images/white.png"))),format.raw/*78.61*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img10" src=""""),_display_(Seq[Any](/*81.26*/routes/*81.32*/.Assets.at("images/white.png"))),format.raw/*81.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img11" src=""""),_display_(Seq[Any](/*84.26*/routes/*84.32*/.Assets.at("images/white.png"))),format.raw/*84.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img12" src=""""),_display_(Seq[Any](/*87.26*/routes/*87.32*/.Assets.at("images/white.png"))),format.raw/*87.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>

	</tr>
		<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img13" src=""""),_display_(Seq[Any](/*93.26*/routes/*93.32*/.Assets.at("images/white.png"))),format.raw/*93.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img14" src=""""),_display_(Seq[Any](/*96.26*/routes/*96.32*/.Assets.at("images/white.png"))),format.raw/*96.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img15" src=""""),_display_(Seq[Any](/*99.26*/routes/*99.32*/.Assets.at("images/white.png"))),format.raw/*99.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img16" src=""""),_display_(Seq[Any](/*102.26*/routes/*102.32*/.Assets.at("images/white.png"))),format.raw/*102.62*/("""" alt="" class="img-rounded" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	</tr>
	</table>
	""")))})),format.raw/*108.3*/("""
	</body>
""")))})))}
    }
    
    def render(user:User,pics:List[Integer],categories:List[Integer],places:List[Integer],helpForm:Form[Category]): play.api.templates.HtmlFormat.Appendable = apply(user,pics,categories,places,helpForm)
    
    def f:((User,List[Integer],List[Integer],List[Integer],Form[Category]) => play.api.templates.HtmlFormat.Appendable) = (user,pics,categories,places,helpForm) => apply(user,pics,categories,places,helpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 23:07:38 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/login.scala.html
                    HASH: 31ee74602ce9baff5adc5ae61e38a9199302fbe7
                    MATRIX: 829->1|1027->104|1064->107|1084->119|1123->121|1175->147|1203->148|1255->173|1283->174|1355->218|1384->219|1454->253|1469->259|1498->266|1542->274|1557->280|1633->333|1705->369|1720->375|1749->382|1793->390|1808->396|1884->449|1956->485|1971->491|2000->498|2044->506|2059->512|2135->565|2207->601|2222->607|2251->614|2295->622|2310->628|2386->681|2458->717|2473->723|2502->730|2546->738|2561->744|2637->797|2709->833|2724->839|2753->846|2797->854|2812->860|2888->913|2919->917|2947->918|3001->945|3029->946|3080->970|3108->971|3157->993|3185->994|3261->1043|3289->1044|3338->1066|3366->1067|3607->1281|3635->1282|3735->1347|3749->1353|3808->1403|3848->1405|4032->1553|4047->1559|4099->1589|4334->1788|4349->1794|4401->1824|4636->2023|4651->2029|4703->2059|4938->2258|4953->2264|5005->2294|5254->2507|5269->2513|5321->2543|5556->2742|5571->2748|5623->2778|5858->2977|5873->2983|5925->3013|6160->3212|6175->3218|6227->3248|6476->3461|6491->3467|6543->3497|6779->3697|6794->3703|6846->3733|7082->3933|7097->3939|7149->3969|7385->4169|7400->4175|7452->4205|7703->4420|7718->4426|7770->4456|8006->4656|8021->4662|8073->4692|8309->4892|8324->4898|8376->4928|8613->5128|8629->5134|8682->5164|8845->5295
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|48->20|48->20|50->22|50->22|53->25|53->25|55->27|55->27|58->30|58->30|66->38|66->38|71->43|71->43|71->43|71->43|76->48|76->48|76->48|79->51|79->51|79->51|82->54|82->54|82->54|85->57|85->57|85->57|91->63|91->63|91->63|94->66|94->66|94->66|97->69|97->69|97->69|100->72|100->72|100->72|106->78|106->78|106->78|109->81|109->81|109->81|112->84|112->84|112->84|115->87|115->87|115->87|121->93|121->93|121->93|124->96|124->96|124->96|127->99|127->99|127->99|130->102|130->102|130->102|136->108
                    -- GENERATED --
                */
            