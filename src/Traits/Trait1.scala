package Traits

// Creamos el trait. No le pongas nada con parentesis, ya que no admite
// constructores ni inicializadores

trait Trait1 {
  //Definimos el trait

  //este es un método abstracto del trait, porque lo definimos/programamos
  // más adelante en las clases que implementen el trait
  def imprimir(nombre:String): Unit

  //Este es un método no abstracto, viene ya definido en el trait
  def imprimir1():Unit = {
    println("metodo implementado")
    }

  // Tambien puedes reprogramar en la clase un trait
  def imprimir2(): Unit = {
    println("metodo a reprogramar")
  }

  //La clase hereda esta variable (puede ser un val)
  var edad:Int = 15
}


trait Trait2 {
  def imprimir3():Unit
}

// con la clausula with puedes hacer herencia multiple. Metele tantos withs como traits herede
class persona() extends Trait1 with Trait2 {
  def imprimir(nombre:String): Unit = {
    println(nombre.toUpperCase())
  }

  // Reprogramamos el metodo con override
  override def imprimir2(): Unit = {
    println("Metodo del trait reprogramado en la clase")
  }

  override def imprimir3(): Unit = {
    println("este es el metodo del trait2")

  }
}

// Codigo principal del componente
object main {
  def main (args: Array[String]): Unit = {
    var personita1 = new persona()
    personita1.imprimir(nombre = "Kai")

    personita1.imprimir1()

    personita1.imprimir2()

    println(personita1.edad)

    personita1.imprimir3()
  }
}