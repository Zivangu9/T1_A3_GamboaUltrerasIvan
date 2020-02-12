import scala.io.StdIn._
object Prueba{  
  def main(args: Array[String])={
    println("------------Divisores entre dos numeros------------")
    print("Primer numero: ")
    var num1 = readInt
    print("Segundo numero: ")
    var num2 = readInt
    //println("Divisiones: ")
    var coc = divisoresRango(num1,num2,num2)
    println("Divisores Sin Repetir:"+coc.split(" ").distinct.mkString("").length)
    println("Divisores Repetidos:"+coc.split(" ").mkString("").length)
  }
  def divisoresRango(numI:Int,numS:Int,numDiv:Int):String = {
    if(numI<=numS)
      if(numDiv>=numI){
        if(numS%numDiv==0){
          //println(numS+"/"+numDiv+"="+(numS/numDiv))
          divisoresRango(numI,numS,numDiv-1) + " "+numDiv
        }
        else
          divisoresRango(numI,numS,numDiv-1)
      }
      else
        divisoresRango(numI,numS-1,numS-1)
    else
      ""
  }
}