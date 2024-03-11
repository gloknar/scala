package ClaseOOP6

// defino la clase a la que acompañará el objeto "companionObject"
class companionObject(var nombre:String, var apellidos:String, var tipo: String) {

  override def toString: String = "Nombre: "+nombre+" "+apellidos+" "+tipo
}

// El object companion se debe llamar igual que la clase a la que acompaña
//Durante la creacion de una instancia de la clase, podré acceder a los métodos
// del object companion
object companionObject {
  val tipo_vip = "VIP"
  val tipo_normal = "Normal"

  def estatico():Unit = {
    println("esto es un método estatico")
  }
}

object programa {
  def main(args: Array[String]):Unit = {
    var estudiante1 = new companionObject(nombre = "Pedrin", apellidos = "Riquelme", tipo = companionObject.tipo_normal)

    //Puedo acceder al método del object companion
    companionObject.estatico()

    //Como hice override al toString, cuando tratamos a una instancia
    //de la clase companionObject como una string, se modifica su comportamiento
    println(estudiante1)
  }
}