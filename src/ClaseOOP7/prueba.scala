// Crear instancias de una clase sin la clausula new

package ClaseOOP7

//Clase principal que estoy creando
class Alumno{
  var nombre:String =_
}


// Companion object de la clase "Alumno"
object Alumno{

  //Devuelve un objeto de tipo Alumno
  def apply(nombre:String): Alumno = {
    var alumno_1 = new Alumno()
    alumno_1.nombre = nombre

    //return a
    alumno_1
  }

}


object programa {
  def main(args: Array[String]): Unit = {

    var jaime = Alumno("Jaime")
    println(jaime)
  }
}