import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
		println("------------Sumatoria con limites------------")
		print("Limite inferior: ")
		var li = readInt
		print("Limite superior: ")
		var ls = readInt
    	println("Sumatoria: "+sumatoriaLimites(li,ls))
	}
  def sumatoriaLimites(li:Int,ls:Int): Int = {
    if(ls>li)
      ls + sumatoriaLimites(li,ls-1)
    else
      li
  }
}