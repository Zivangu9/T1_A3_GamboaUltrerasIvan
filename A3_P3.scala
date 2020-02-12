import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
		println("------------Factorial de un numero------------")
		print("Numero: ")
		var num = readInt
    println("Factorial: "+factorial(num))
	}
  def factorial(num:Int,cont:Int = 1): Int = {
    if(cont<=num)
      cont*factorial(num,cont+1)
    else
    	1
  }
}