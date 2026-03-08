/**
 * Clase encargada de ocupar los elementos programados
 * hasta la fecha. 
 **/

public class Aplicacion{

    /**
     * Metodo app que sera llamado en el main 
     **/
    public void app(){
	//Mandamos a llamar al saludo
	System.out.println(saludo());
    }

    /**
     * METODOS ASOCIADOS A MENSAJES
     **/

    /** Saludo **/
    private String saludo(){

        return "\n------------------------------------------------------------"+
        "\n---------------------BIENVENID@ AL----------------------------" +
        "\n-----------------PEQUEÑO CESARIN!!!!--------------------------" +
	"\n--------------------------------------------------------------" +
        "\n-----------------¿List@ para ordenar?-------------------------";
    }

    /** Despedida **/
    private String despedida(){

        return "\n--------------------------------------------------------"+
        "\n-----------------GRACIAS POR VENIR AL...--------------------" +
        "\n-----------------PEQUEÑO CESARIN!!!!------------------------" +
        "\n-------------------------------------------------------------" +
        "\n--------------¡Vuelve pronto! PIZZA PIZZA -------------------";
    }
}


