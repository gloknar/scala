//Clase escritura archivos planos
package ClaseIO2

object output {
  def main(args: Array[String]): Unit = {

    //paquete output
    import java.io._


    // Opcion 1: Creamos una instancia de PrintWriter
    val archivo = new PrintWriter( (new File("C:/Users/acasamat/tmp/prueba.txt") ) )
    archivo.write("Esto es una prueba\n")
    archivo.write("Esta es la segunda linea\n")

    archivo.close()


    // Opcion 2: Creamos una instancia de File, otra de FileWriter y BufferedWriter
    //O sea, abro un buffer de escritura (un puntero), creamos un objeto que le permita al buffer escribir en un archivo
    val archivo2 = new File("C:/Users/acasamat/tmp/prueba2.txt")
    val bw = new BufferedWriter(new FileWriter(archivo2))
    bw.write("Esto es una prueba")

    bw.close()

  }
}
