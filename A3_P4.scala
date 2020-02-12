import scala.io.StdIn._
object Prueba{  
  def main(args: Array[String])={
    println("------------Cociente entre dos numeros------------")
    print("Primer numero: ")
    var num1 = readInt
    print("Segundo numero: ")
    var num2 = readInt
    //println("Divisiones: ")
    var coc = cocientesRango(num1,num2,num2)
    coc = coc.split(" ").distinct.mkString(" ")
    println("Cocientes: "+coc)
  }
  def cocientesRango(numI:Int,numS:Int,numDiv:Int):String = {
    if(numI<=numS)
      if(numDiv>=numI){
        if(numS%numDiv==0){
          //println(numS+"/"+numDiv+"="+(numS/numDiv))
          cocientesRango(numI,numS,numDiv-1) + " "+(numS/numDiv)
        }
        else
          cocientesRango(numI,numS,numDiv-1)
      }
      else
        cocientesRango(numI,numS-1,numS-1)
    else
      ""
  }
}