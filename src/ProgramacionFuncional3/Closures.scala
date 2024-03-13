package ProgramacionFuncional3


object principal {

  var constante:Int = 100

  //Creo una funcion que admite un solo argumento, pero usa otras variables para sus calculos, y
  // estas otras variables están fuera de su ámbito, o sea no están dentro del cuerpo de esa funcion
  val sumar = (x:Int) => x + constante


  def main(args: Array[String]):Unit = {

    println(sumar(5))

    //Lo bueno de las closures es que puedes modificar el valor durante el pipeline del programa
    constante = 90

    println(sumar(5))

  }
}