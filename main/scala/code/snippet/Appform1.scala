package code
package snippet

import net.liftweb.util.Helpers._
import java.util.Date
import net.liftweb.common._
import net.liftweb.http._
import S._
import net.liftweb.util._
import Helpers._
import scala.xml._
import java.util.Calendar

class Appform1 {
	val now = Calendar.getInstance()
	val m = now.get(Calendar.MINUTE)
	val s=getSessionAttribute("logged").toString()
	if(s!="Full(true)")
	{
		S.redirectTo("/index")
	}
	var name=""
	
	def ld (xhtml : NodeSeq) : NodeSeq = {
		bind("entry", xhtml,
		"name" -> SHtml.text(name, name = _))
	}
	
	var v1=""
	var v2=""
	var v3=""
	var v4=""
	var v5=""
	
	def processEntryCancel () { 
	}
	
	def processEntryAdd () { 
		
		if(urlEncode(v1)==urlEncode("5111222")&&urlEncode(v2)==urlEncode("Иванхоу Майнз")&&urlEncode(v3)==urlEncode("Улаанбаатар")&urlEncode(v4)==urlEncode("Сүхбаатар")&&urlEncode(v5)==urlEncode("432"))
		{
			S.redirectTo("/page/appform2")
		}
	}
	
	
	
	def add (xhtml : NodeSeq) : NodeSeq = {
		
	bind("entry", xhtml,
		"v1" -> SHtml.text(v1, v1 = _),
		"v2" -> SHtml.text(v2, v2 = _),
		"v3" -> SHtml.text(v3, v3 = _),
		"v4" -> SHtml.text(v4, v4 = _),
		"v5" -> SHtml.text(v5, v5 = _),
		"cancel" -> SHtml.submit("Болих", processEntryCancel),
		"submit" -> SHtml.submit("Дараах", processEntryAdd))
	}
	
}