import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
		println("------------Cantidad de vocales en cadena------------")
		print("Cadena: ")
		var cad = readLine
    println("Vocales: "+vocalesEnCadena(cad))
	}
  def vocalesEnCadena(cadena:String): Int = { 
    if(cadena!=""){
        val cha = cadena.charAt(0)
      if(cha=='a'||cha=='A'||cha=='e'||cha=='E'||cha=='i'||cha=='I'||cha=='o'||cha=='O'||cha=='u'||cha=='U')
        1+vocalesEnCadena(cadena.substring(1))
      else
        vocalesEnCadena(cadena.substring(1))  
    }
    else
      0
  }
}