package ProgramacionFuncional1



class highOrderFunctions {

  // el tipo de variable :() representa una funcion
  def funcion1(func_param:() ) = {
    func_param
  }

  // Esta funcion admite un entero y una funcion. A esta High order le puedes pasar cualquier funcion que
  // tome como input un entero y devuelva otro entero
  def funcion2(cifra1:Int, func_param:(Int)=> Int): Int = {
    func_param(cifra1)
  }
}



object principal {
  def main(args: Array[String]):Unit = {
    var ejemplo1 = new highOrderFunctions()

    // Esta funcion ejecuta la funcion que le pases como argumento, sin mas
    ejemplo1.funcion1(println("Ejemplo de funcion que acepta otra como argumento: ",80*70))

    //Esta otra coge un entero y otra funcion (aqui le paso una anónima) y procesa ese entero a otro entero
    var x = 10
    println("ejemplo de funcion que acepta un entero y otra funcion como argumentos: ", ejemplo1.funcion2(x, (x:Int)=>x*2))

  }
}