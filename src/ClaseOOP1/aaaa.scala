package ClaseOOP1


// Para crear una clase usamos el método class
//Los atributos van dentro del paréntesis, despues del nombre de la clase
class elemento_genomico (nombre: String, tipo_acido:String, ubicacion:String) {

  //concentracion y visualizar son publicos y se ven cuando tabulas en elemento_genomico.
  // nombre, tipo_acido y ubicacion son privados
  var concentracion: Int = _

  //CReamos el metodo para visualizar la informacion de cada instancia
  def visualizar(): Unit ={
    println(s"nombre: $nombre")
    println(s"tipo de acido nucleico: $tipo_acido")
    println(s"ubicacion en la celula: $ubicacion")
    println(s"concentracion: $concentracion")

  }


}



// los Objects son en realidad Singletons
// Este es el main, el cuerpo principal del programa
object Principal {
  def main(args: Array[String]): Unit = {


  //Creamos una instancia de acido nucleico
  var acido_nucleico_1 = new elemento_genomico(nombre = "ARN_t", tipo_acido = "ARN", ubicacion = "citoplasma")
  acido_nucleico_1.concentracion = 80 //mmol


  println(acido_nucleico_1)
  print(acido_nucleico_1.visualizar())
  }
}