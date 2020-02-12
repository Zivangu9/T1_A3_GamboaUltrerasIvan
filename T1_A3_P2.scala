import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
		println("------------Divisores de un numero------------")
		print("Numero: ")
		var num = readInt
    	println("Divisores: "+divisores(num))
	}
	def divisores(num:Int,cont:Int = 1): String = {
    if(cont<=num)
      if(num%cont==0)
      	cont + ", "+divisores(num,cont+1)
      else
      	divisores(num,cont+1)
    else
    	""
  }
}