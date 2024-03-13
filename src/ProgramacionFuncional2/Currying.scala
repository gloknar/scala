// Clase currying
package ProgramacionFuncional2


object principal {
  def main(args: Array[String]): Unit = {

    // Funcion estandar para sumar
    def sumar(x:Int, y:Int) = x+y

    //Funcion curry para sumar
    def sumar1(x:Int) = (y:Int) => x+y

    //Otra manera de hacer el currying
    def sumar2 (x: Int) (y: Int) = x+y


    //Para llamar a una funcion curry, abres tantos paréntesis como argumentos tenga
    println(sumar1(10)(20))

    //Con el curry dejamos una funcion parcialmente aplicada
    val v1 = sumar1(10)
    println(v1(80))

    // Fíjate que puedes dejar vacío algun argumento y meterselo lueg
    val v2 = sumar2(90)_
    println(v2(10))
  }
}