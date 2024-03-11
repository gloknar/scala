// CLASE CONSTRUCTORES MULTIPLES
package ClaseOOP4

//Como vamos a usar muchos constructores auxiliares, creamos
// la clase sin ningun parametro ni paréntesis
class producto {

  //Creamos aqui los parametros de la clase
  private var nombre:String = _
  private var pvp:Double = _
  private var gama:String = _


  def imprimir():Unit = {
    println(nombre, pvp, gama)
  }



  //Constructores auxiliares
  def this(nombre:String) = {

    //Primero invocamos a un constructor anterior, que en este caso
    //será el constructor primario
    this()
    this.nombre = nombre
  }

  def this(nombre:String, pvp:Double, gama:String) = {

    //Llamo al constructor anterior
    this(nombre)
    this.pvp = pvp
    this.gama = gama
  }

}


object Programa {
  def main(args: Array[String]): Unit = {

    //Creado con constructor primario
    var producto1 = new producto()
    producto1.imprimir()

    //Creado con constructor auxiliar 1
    var producto2 = new producto(nombre = "CPU")
    producto2.imprimir()

    //Creado con constructor auxiliar 2
    var producto3 = new producto(nombre = "Trust", pvp = 70.0, gama = "Oficina")
    producto3.imprimir()
  }
}