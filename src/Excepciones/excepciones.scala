package Excepciones

object principal {

  def dividir (n1:Int, n2:Int):Float = {
    n1/n2
  }

  def main (args: Array[String]):Unit = {
    var n1 = 10
    var n2 = 10

    // encapsulamos el codigo de interes en el try
    try {
      println(dividir(n1, n2))
    } catch {
        // para coger un tipo de excepcion en concreto
        case div_0 : ArithmeticException => println("dividiste por 0: "+div_0)
        //Para coger cualquier excepcion (las excepciones son hijas de la superclase Throwable
        case error_general: Throwable => println("Ocurio un error no determinado: "+ error_general)
    } finally {
      //Finally es que independientemente de si ocurre un error, siempre se ejecuta este codigo
      //Ejemplo: Abres un archivo o una conexion a base de datos, pues al final tendrás que cerrar la conexion
      println("Eso es todo")
    }

    //Ejemplo de levantar (raise en python) una excepcion

    def pedirCarnetConducir(edad:Int)={
      if (edad<= 18) {
        throw new Exception("eres menor de edad")
      } else { println("carnet concedido")}
    }

    pedirCarnetConducir(17)

  }
}
