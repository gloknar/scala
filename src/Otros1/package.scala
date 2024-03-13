package Otros1

object principal {

  val lista = List(1,2,3,4)

  //Para crear un objeto de tipo Option (lo inicializamos a None)
  var optional1:Option[Int] = None


  def main(args: Array[String]):Unit = {
    println(lista.find(_>2))

    //Puedes recuperar el valor dentro del Some con el metodo .get()
    println(lista.find(_>2).get)  //Si pillas un None, te lanza una excepcion, para evitarla usa .getOrElse()
    println(lista.find(_>8).getOrElse(0))  //devuelveme lo que hay en el Some, si pillas un None, dame un 0

    println(optional1)

    optional1 = Some(89)
    println(optional1)
    println(optional1.getOrElse(0))

  }
}
