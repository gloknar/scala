package ClaseOOP8

// Un case class es una clase que ya implementa por defecto una serie de funcionalidades
// y tiene un object companion
case class prueba(nombre:String, edad:Int)


object principal {
  def main(args: Array[String]): Unit = {

    //El case class implementa un apply, enotnces no hace falta usar la clausula new
    var instancia_1 = prueba("jaime",20)

    //hashcode(), equals() y copy() son ejemplos de metodos
    // implementados por defecto en una case class
    println(instancia_1.hashCode())
    val instancia_2 = instancia_1.copy(nombre= "Ribera", edad = 30)
    println(instancia_1.equals(instancia_2))

    println(instancia_1)
  }
}
