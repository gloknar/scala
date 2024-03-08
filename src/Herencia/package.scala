package Herencia

// Esta será la clase padre, y las hijas heredarán sus properties hp y marca
class coche {
  //Properties de la clase
  var hp:Double = _  //horsepower
  var marca:String = _

  //Métodos de la clase
  def inspeccionarCoche():Unit = {
    println(hp)
    println(marca)
  }
}

class modelo extends coche {
  var modelo:String = _
  var anyo_comercializacion:Int =_

  def inspeccionarModelo():Unit = {
    println(modelo)
    println(anyo_comercializacion)
  }
}


//Creamos el cuerpo del codigo
object Main {
  def main (args: Array[String]): Unit ={

    // Creamos una instancia de modelo de coche
    var Sandero= new modelo
    Sandero.hp = 90
    Sandero.modelo = "Sandero"
    Sandero.anyo_comercializacion = 2007
    Sandero.marca = "Dacia"

    Sandero.inspeccionarCoche()
    Sandero.inspeccionarModelo()
  }


}