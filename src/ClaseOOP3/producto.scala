package ClaseOOP3

class producto(id:Int, nombre:String) {

  println("me ha ejecutado el constructor de la clase producto")

  //////Constructor auxiliar, necesita como parametros los de la clase + los suyos propios
  // Primero creo su propio parametro en modo privado por seguridad
  private var pvp:Double = 0.0
  def this(id: Int, nombre:String, pvp:Double) = {
    this(id, nombre) //Estos parametros se resuelven con el construtor padre
    this.pvp = pvp  // Este parametro del constructor adicional lo resuelvo por separado
  }

  // metodo de la clase producto
  def imprimir():Unit ={
    println(id, nombre,pvp)
  }


}


object Programa {
  def main(args: Array[String]): Unit = {

    //Instancia creada con el constructor primario, no tiene PVP
    var cpu1 = new producto(id = 1, nombre= "Ryzen 3900X")

    cpu1.imprimir()

    //Instancia creada con el constructor auxiliar, tiene PVP
    var cpu2 = new producto(id = 2, nombre = "Intel I7 7700K", pvp = 500.99)

    cpu2.imprimir()

  }
}