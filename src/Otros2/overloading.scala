//Clase Overloading
package Otros2


class Estudiante{

  //Primer metodo "hola"
  def hola():Unit = {
    println("Primer método")
  }

  //Segundo metodo "hola"
  def hola(nombre:String): Unit = {
    println("Segundo metodo"+nombre)
  }


  //Tercer metodo "hola"
  def hola(nombre:String, edad:Int):Unit ={
    println("tercer metodo:" + nombre + edad)
  }


}

object overloading {
  def main(args: Array[String]): Unit = {

    var estudiante1 = new Estudiante()

    estudiante1.hola()
    estudiante1.hola("Jaime")
    estudiante1.hola("Jaime", 20)

  }
}
