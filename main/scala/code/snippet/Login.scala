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

class Login {
	var name = ""
	var pwd = ""
	
	def processEntryAdd () { 
		
		if(name=="5111222MRPAM111"&&pwd=="PWD")
		{
		setSessionAttribute("logged","true");
		S.redirectTo("/page/index")
		
		}
	}
	
	def add (xhtml : NodeSeq) : NodeSeq = {
		
	bind("entry", xhtml,
		"name" -> SHtml.text(name, name = _),
		"pwd" -> SHtml.text(pwd, pwd = _),
		"submit" -> SHtml.submit("Нэвтрэх", processEntryAdd))
	}
	
}