import scala.math._
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
		println("------------Conversor de sistema decimal a binario------------")
		print("Numero: ")
		var num = readInt
    println("Binario: "+binario(num,digitosBinarios(num)))
	}
  def binario(num:Double,bin:Int): String = {
  	if(num>=0&&bin>=0)
      if(num>=pow(2,bin))
        "1" + binario(num-pow(2,bin),bin-1)
      else
        "0" + binario(num,bin-1)
    else
      ""
  }
  def digitosBinarios(num:Int,bin:Int=0): Int = {
    if(num>pow(2,bin))
      digitosBinarios(num,bin+1)
    else
      bin-1
  }
}