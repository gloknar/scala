// Clases abstractas

package ClaseOOP8

abstract class carrera(titulo:String, universidad:String) {

  //Método estándar
  def mayusculas() :Unit = {
    println(titulo.toUpperCase())
  }

  //Método abstracto, definimos el tipo que devuelve pero no tiene codigo
  def presentacion:String
}


class asignatura (titulo:String, universidad:String, asignatura:String) extends carrera(titulo, universidad) {

  //En la clase hija resolvemos el método abstracto "presentacion"
  override def presentacion: String = {
    var tmp_string:String = ""
    tmp_string = s"Bienvenido a la $universidad, estudias la carrera $titulo y la asignatura $asignatura"
    tmp_string  // return tmp_string
  }

}


object programa {
  def main (args: Array[String]): Unit = {

    var asignatura1 = new asignatura("Ingenieria Multimedia", "UA", "Matemáticas discretas")
    println(asignatura1.mayusculas())

    println(asignatura1.presentacion)

  }
}