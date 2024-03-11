// CLASE CONSTRUCTORES MULTIPLES
package ClaseOOP5

object singletons {
  def aprobado():Unit = {
    println("aprobado")}

  def suspendido():Unit = {
    println("suspendido")}
}


object Programa {
  def main(args: Array[String]): Unit = {

    //No te deja crear una instancia del objeto/singleton
    //var cosa = new singletons()

    //Pero sí te deja acceder a sus metodos
    singletons.suspendido()
  }
}