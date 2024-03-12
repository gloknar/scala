// Clase leer archivos texto plano
package ClaseIO1

// Carga paquete I/O
import scala.io.Source


object input {
  def main(args: Array[String]): Unit = {

    val ruta_archivo = "./files/prueba.txt"
    val archivo = Source.fromFile(ruta_archivo)

    //opcion 1
    for (linea <- archivo.getLines()){
      println(linea)
    }


    //// Opcion 2
    //val lineas = archivo.getLines().toList
    //// Esto es una función anónima, sería lo mismo que foreach( lambda x: x = print(x)
    //lineas.foreach(x=>println(x))


    //No olvides cerrar el arhcivo, como me enseñaron en el master
    archivo.close()
  }
}
