/**
 * Clase encargada de contener
 * al metodo main de la practica
 **/

public class main{


    /**METODO MAIN**/
    public static void main(String[] args){

         /**
          * LIMPIEZA DE PANTALLA
	  * El primer paso del programa debe de ser limpiar la pantalla (Mayormente por motivos superficiales y esteticos jaja)
	  * Pero en serio, seria mucho mas facil visualizar el contenido. Por rapidez, nos conviene realizar ese proceso usando
	  * un flush, Existen formas mas elegantes, pero esta fue la que se nos ocurrio.
	  * FUENTE DE CONSULTA:
	  * https://rootstack.com/es/blog/java-limpiar-pantalla
	   **/

        System.out.print("\033[H\033[2J");
        System.out.flush();

	  /**
	   * Crecion de un objeto tipo Aplicacion y
	   * llamada al metodo main
	   **/

        Aplicacion aplicacion = new Aplicacion();
        aplicacion.app();

    }
}
