package Package2

object holaMundo extends App {
  def calcular(operacion:String,numero1: Int, numero2: Int)= {
    if (numero2 == 0) {
      "No se puede dividir por 0"
    } else  {
      operacion match {case "+" => numero1+numero2
      case "-" => numero1-numero2
      case "*" => numero1*numero2
      case "/" => numero1/numero2
      case _ => "Operacion Incorrecta"}}
  }

  print(calcular("+",1, 4))
}