package ClaseOOP2


class elemento_genomico(param_priv : Int =2) {

  // property publica
  var concentracion: Int = _

  // property privada, puedo acceder a ella en la generacion de la clase en cuestion,
  // pero en el main no me deja acceder
  private var ubicacion:String = _
  ubicacion = "nucleo"

  //property protegida
  protected val tipo:String = "acido nucleico"

  // Dentro de la clase acido_nucleico, puedo acceder a su parametro privado
  var x:Int = param_priv *2
}

// Al crear una clase hija, me obliga a asignarle un valor al parametro :(
class transposon() extends elemento_genomico(param_priv = 2) {

  // Las clases hijas pueden acceder a las variables públicas y protegidas,
  // pero no a las privadas
  var tipo_transposon:String = s"$tipo y elemento genomico movil"

  // Desde la clase hija no puedo acceder al parametro privado de la clase padre
  //transposon.param_priv

}




object Principal {
  def main(args: Array[String]): Unit = {

  var acido_nucleico_1 = new elemento_genomico(param_priv = 6)
  acido_nucleico_1.concentracion = 80 //mmol

  //No puedo ver en el main el parametro privado, pero puedo ver esta variable derivada
  println(acido_nucleico_1.x)

  var Helibat1 = new transposon()
  println(Helibat1.tipo_transposon)
  }
}