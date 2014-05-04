
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
object gridSeq extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:String,categories: List[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.42*/("""
"""),_display_(Seq[Any](/*4.2*/main("gridSeq")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""
<head>
    <title>Page Title</title>
</head>

<body>
                """),_display_(Seq[Any](/*10.18*/helper/*10.24*/.form(action=routes.Application.chooseGridSeq(user))/*10.76*/{_display_(Seq[Any](format.raw/*10.77*/("""
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
                """),_display_(Seq[Any](/*44.18*/helper/*44.24*/.form(action=routes.Application.chooseGridSeq(user),'_id ->"Categories")/*44.96*/{_display_(Seq[Any](format.raw/*44.97*/("""
                <select class="form-control" title="choose a category" name="Categories" >
                    """),_display_(Seq[Any](/*46.22*/for(category <- categories) yield /*46.49*/{_display_(Seq[Any](format.raw/*46.50*/("""
                    <option>"""),_display_(Seq[Any](/*47.30*/category/*47.38*/.catName)),format.raw/*47.46*/("""</option>
                    
    
                """)))})),format.raw/*50.18*/("""
     
                
    

                
        
            


</body>
""")))})),format.raw/*61.2*/("""
""")))})),format.raw/*62.2*/("""
""")))})),format.raw/*63.2*/("""
"""))}
    }
    
    def render(user:String,categories:List[Category]): play.api.templates.HtmlFormat.Appendable = apply(user,categories)
    
    def f:((String,List[Category]) => play.api.templates.HtmlFormat.Appendable) = (user,categories) => apply(user,categories)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 04 15:28:47 EET 2014
                    SOURCE: /Essam Hafez/Gam3a/10th semester/909/project/PicPuzzles/app/views/gridSeq.scala.html
                    HASH: febef1e7e9080037c6e5435c288c37fc181bed19
                    MATRIX: 791->1|975->41|1011->94|1034->109|1072->110|1179->181|1194->187|1255->239|1294->240|3780->2690|3795->2696|3876->2768|3915->2769|4064->2882|4107->2909|4146->2910|4212->2940|4229->2948|4259->2956|4344->3009|4455->3089|4488->3091|4521->3093
                    LINES: 26->1|32->1|33->4|33->4|33->4|39->10|39->10|39->10|39->10|73->44|73->44|73->44|73->44|75->46|75->46|75->46|76->47|76->47|76->47|79->50|90->61|91->62|92->63
                    -- GENERATED --
                */
            