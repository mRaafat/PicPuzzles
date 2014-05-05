
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,List[Integer],List[Integer],List[Integer],Form[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(email: String, pics:List[Integer],categories:List[Integer],places:List[Integer],helpForm: Form[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.108*/("""

"""),_display_(Seq[Any](/*3.2*/main("User")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	<head>
	<style>
		.cell """),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""width:100px;height:100px;"""),format.raw/*6.35*/("""}"""),format.raw/*6.36*/("""
	</style>
	<script>

	function postImages()"""),format.raw/*10.23*/("""{"""),format.raw/*10.24*/("""
		document.getElementById("subm").style.visibility="hidden";
		document.getElementById("hiddenDIV").style.visibility="hidden";
		document.getElementById("img"+"""),_display_(Seq[Any](/*13.34*/places/*13.40*/.get(0))),format.raw/*13.47*/(""").src=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at(Picture.find.byId(pics.get(0)).image_link))),format.raw/*13.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*14.34*/places/*14.40*/.get(1))),format.raw/*14.47*/(""").src=""""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at(Picture.find.byId(pics.get(1)).image_link))),format.raw/*14.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*15.34*/places/*15.40*/.get(2))),format.raw/*15.47*/(""").src=""""),_display_(Seq[Any](/*15.55*/routes/*15.61*/.Assets.at(Picture.find.byId(pics.get(2)).image_link))),format.raw/*15.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*16.34*/places/*16.40*/.get(3))),format.raw/*16.47*/(""").src=""""),_display_(Seq[Any](/*16.55*/routes/*16.61*/.Assets.at(Picture.find.byId(pics.get(3)).image_link))),format.raw/*16.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*17.34*/places/*17.40*/.get(4))),format.raw/*17.47*/(""").src=""""),_display_(Seq[Any](/*17.55*/routes/*17.61*/.Assets.at(Picture.find.byId(pics.get(4)).image_link))),format.raw/*17.114*/("""";
		document.getElementById("img"+"""),_display_(Seq[Any](/*18.34*/places/*18.40*/.get(5))),format.raw/*18.47*/(""").src=""""),_display_(Seq[Any](/*18.55*/routes/*18.61*/.Assets.at(Picture.find.byId(pics.get(5)).image_link))),format.raw/*18.114*/("""";
	"""),format.raw/*19.2*/("""}"""),format.raw/*19.3*/("""

	function allowDrop(ev)
	"""),format.raw/*22.2*/("""{"""),format.raw/*22.3*/("""
	ev.preventDefault();
	"""),format.raw/*24.2*/("""}"""),format.raw/*24.3*/("""

	function drag(ev)
	"""),format.raw/*27.2*/("""{"""),format.raw/*27.3*/("""
	ev.dataTransfer.setData("Text",ev.target.id);
	"""),format.raw/*29.2*/("""}"""),format.raw/*29.3*/("""
	var countSwitch = 0;
	function drop(ev)
	"""),format.raw/*32.2*/("""{"""),format.raw/*32.3*/("""
	var me = document.getElementById(ev.target.id);
	ev.preventDefault();
	var data=ev.dataTransfer.getData("Text");
	var pic = document.getElementById(data);
	document.getElementById("origin").innerHTML += data +",";
	document.getElementById("target").innerHTML += ev.target.id+",";
	countSwitch++;
	var temp = pic.src;
	pic.src = me.src;
	me.src = temp;
	me.src = """"),_display_(Seq[Any](/*43.13*/routes/*43.19*/.Assets.at("images/white.png"))),format.raw/*43.49*/("""";
	if(countSwitch >= 6  )"""),format.raw/*44.24*/("""{"""),format.raw/*44.25*/("""
		document.getElementById("subm").style.visibility="visible";
		document.getElementById("table1").style.visibility="hidden";
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/("""
	"""),format.raw/*48.2*/("""}"""),format.raw/*48.3*/("""
	</script>
	</head>
	<body onload="javascript:postImages()">
	<div id="hiddenDIV">
		"""),_display_(Seq[Any](/*53.4*/helper/*53.10*/.form(action = routes.Application.validateLogin(email,pics,categories,places))/*53.88*/ {_display_(Seq[Any](format.raw/*53.90*/("""
		"""),_display_(Seq[Any](/*54.4*/helper/*54.10*/.input(helpForm("origin"), '_label -> "", '_id -> "origin")/*54.69*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*54.98*/("""
	        <input type="hidden" name=""""),_display_(Seq[Any](/*55.38*/name)),format.raw/*55.42*/("""" id=""""),_display_(Seq[Any](/*55.49*/id)),format.raw/*55.51*/("""" """),_display_(Seq[Any](/*55.54*/toHtmlArgs(args))),format.raw/*55.70*/(""">
	    """)))})),format.raw/*56.7*/("""
	    """),_display_(Seq[Any](/*57.7*/helper/*57.13*/.input(helpForm("target"), '_label -> "", '_id -> "target")/*57.72*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*57.101*/("""
	        <input type="hidden" name=""""),_display_(Seq[Any](/*58.38*/name)),format.raw/*58.42*/("""" id=""""),_display_(Seq[Any](/*58.49*/id)),format.raw/*58.51*/("""" """),_display_(Seq[Any](/*58.54*/toHtmlArgs(args))),format.raw/*58.70*/(""">
	    """)))})),format.raw/*59.7*/("""
	</div>
	<span id="testy"></span>
	<table border="1" id="table1">
	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img1" src=""""),_display_(Seq[Any](/*65.25*/routes/*65.31*/.Assets.at("images/white.png"))),format.raw/*65.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img2" src=""""),_display_(Seq[Any](/*68.25*/routes/*68.31*/.Assets.at("images/white.png"))),format.raw/*68.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img3" src=""""),_display_(Seq[Any](/*71.25*/routes/*71.31*/.Assets.at("images/white.png"))),format.raw/*71.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img4" src=""""),_display_(Seq[Any](/*74.25*/routes/*74.31*/.Assets.at("images/white.png"))),format.raw/*74.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img5" src=""""),_display_(Seq[Any](/*80.25*/routes/*80.31*/.Assets.at("images/white.png"))),format.raw/*80.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img6" src=""""),_display_(Seq[Any](/*83.25*/routes/*83.31*/.Assets.at("images/white.png"))),format.raw/*83.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img7" src=""""),_display_(Seq[Any](/*86.25*/routes/*86.31*/.Assets.at("images/white.png"))),format.raw/*86.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img8" src=""""),_display_(Seq[Any](/*89.25*/routes/*89.31*/.Assets.at("images/white.png"))),format.raw/*89.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img9" src=""""),_display_(Seq[Any](/*95.25*/routes/*95.31*/.Assets.at("images/white.png"))),format.raw/*95.61*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img10" src=""""),_display_(Seq[Any](/*98.26*/routes/*98.32*/.Assets.at("images/white.png"))),format.raw/*98.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img11" src=""""),_display_(Seq[Any](/*101.26*/routes/*101.32*/.Assets.at("images/white.png"))),format.raw/*101.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img12" src=""""),_display_(Seq[Any](/*104.26*/routes/*104.32*/.Assets.at("images/white.png"))),format.raw/*104.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>

	</tr>
		<tr>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img13" src=""""),_display_(Seq[Any](/*110.26*/routes/*110.32*/.Assets.at("images/white.png"))),format.raw/*110.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img14" src=""""),_display_(Seq[Any](/*113.26*/routes/*113.32*/.Assets.at("images/white.png"))),format.raw/*113.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img15" src=""""),_display_(Seq[Any](/*116.26*/routes/*116.32*/.Assets.at("images/white.png"))),format.raw/*116.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
		<td class="cell" ondrop="drop(event)" ondragover="allowDrop(event)">
			<img id="img16" src=""""),_display_(Seq[Any](/*119.26*/routes/*119.32*/.Assets.at("images/white.png"))),format.raw/*119.62*/("""" alt="" draggable="true" ondragstart="drag(event)" width="99" height="99">
		</td>
	</tr>

	</tr>
	</table>
	 <button type="submit" id="subm" class="btn btn-primary">Submit</button>
	""")))})),format.raw/*126.3*/("""
	</body>
""")))})))}
    }
    
    def render(email:String,pics:List[Integer],categories:List[Integer],places:List[Integer],helpForm:Form[Category]): play.api.templates.HtmlFormat.Appendable = apply(email,pics,categories,places,helpForm)
    
    def f:((String,List[Integer],List[Integer],List[Integer],Form[Category]) => play.api.templates.HtmlFormat.Appendable) = (email,pics,categories,places,helpForm) => apply(email,pics,categories,places,helpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 05 04:57:59 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/login.scala.html
                    HASH: 23fe2a0736dc3186c140b7c8696074c84ac45aec
                    MATRIX: 831->1|1032->107|1069->110|1089->122|1128->124|1180->150|1208->151|1260->176|1288->177|1360->221|1389->222|1586->383|1601->389|1630->396|1674->404|1689->410|1765->463|1837->499|1852->505|1881->512|1925->520|1940->526|2016->579|2088->615|2103->621|2132->628|2176->636|2191->642|2267->695|2339->731|2354->737|2383->744|2427->752|2442->758|2518->811|2590->847|2605->853|2634->860|2678->868|2693->874|2769->927|2841->963|2856->969|2885->976|2929->984|2944->990|3020->1043|3051->1047|3079->1048|3133->1075|3161->1076|3212->1100|3240->1101|3289->1123|3317->1124|3393->1173|3421->1174|3491->1217|3519->1218|3921->1584|3936->1590|3988->1620|4042->1646|4071->1647|4225->1774|4253->1775|4282->1777|4310->1778|4432->1865|4447->1871|4534->1949|4574->1951|4613->1955|4628->1961|4696->2020|4763->2049|4837->2087|4863->2091|4906->2098|4930->2100|4969->2103|5007->2119|5046->2127|5088->2134|5103->2140|5171->2199|5239->2228|5313->2266|5339->2270|5382->2277|5406->2279|5445->2282|5483->2298|5522->2306|5726->2474|5741->2480|5793->2510|6008->2689|6023->2695|6075->2725|6290->2904|6305->2910|6357->2940|6572->3119|6587->3125|6639->3155|6868->3348|6883->3354|6935->3384|7150->3563|7165->3569|7217->3599|7432->3778|7447->3784|7499->3814|7714->3993|7729->3999|7781->4029|8010->4222|8025->4228|8077->4258|8293->4438|8308->4444|8360->4474|8577->4654|8593->4660|8646->4690|8863->4870|8879->4876|8932->4906|9164->5101|9180->5107|9233->5137|9450->5317|9466->5323|9519->5353|9736->5533|9752->5539|9805->5569|10022->5749|10038->5755|10091->5785|10308->5970
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|38->10|38->10|41->13|41->13|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|50->22|50->22|52->24|52->24|55->27|55->27|57->29|57->29|60->32|60->32|71->43|71->43|71->43|72->44|72->44|75->47|75->47|76->48|76->48|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|85->57|85->57|85->57|85->57|86->58|86->58|86->58|86->58|86->58|86->58|87->59|93->65|93->65|93->65|96->68|96->68|96->68|99->71|99->71|99->71|102->74|102->74|102->74|108->80|108->80|108->80|111->83|111->83|111->83|114->86|114->86|114->86|117->89|117->89|117->89|123->95|123->95|123->95|126->98|126->98|126->98|129->101|129->101|129->101|132->104|132->104|132->104|138->110|138->110|138->110|141->113|141->113|141->113|144->116|144->116|144->116|147->119|147->119|147->119|154->126
                    -- GENERATED --
                */
            