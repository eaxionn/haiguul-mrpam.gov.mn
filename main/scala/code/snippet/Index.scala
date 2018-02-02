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

class Index {

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
	
}