 /**
  * Clase encargada de guardar mensajes que podamos ocupar
  * en la aplicación
  **/

public class Mensajes {

    /** Saludo **/
    public String saludo(){

        return "\n------------------------------------------------------------"+
        "\nBIENVENID@ AL" +
        "\nPEQUEÑO CESARIN!!!!" +
        "\n¿List@ para ordenar?";
    }

    /** Despedida **/
    public String despedida(){

        return "\n--------------------------------------------------------"+
        "\nGRACIAS POR VENIR AL..." +
        "\nPEQUEÑO CESARIN!!!!" +
        "\n¡Vuelve pronto! PIZZA PIZZA";
    }

    /** Menu de opciones por alimento **/
    public String menuGeneral(){
      return "\n------------------------------------------------------------" +
      "\n¿QUÉ DESEA ORDENAR HOY?" +
      "\n1.PIZZA" +
      "\n2.HELADO" +
      "\n3.PIZZA Y HELADO" +
      "\n4.SALIR" ;
    }

    /**
     * SUB-MENÚS 
     * Considerando que el usuario va a tener un numero limitado de opciones, 
     * conviene separar las opciones disponibles para cada alimento. 
     **/

     /**Menú de pizzas **/
    public String menuPizzas(){
        return "\n--------------------------------------------------------------" + 
        "\n¡PIZZAS!"+
        "\n1.PEPPERONI" +
        "\n2.HAWAIANA" +
        "\n3.MEXICANA" +
        "\n4.SARDINAS" +
        "\n5.SOYA"; 
      
    }

    /** Menú de helados**/
    public String saboresHelado(){
        return "\n--------------------------------------------------------------" + 
        "\n¡HELADOS!"+
        "\n1.VAINILLA" +
        "\n2.CHOCOLATE" +
        "\n3.FRESA"; 
    }

    /** Opciones de cobertura**/
    public String coberturasHelado(){
        return "\n--------------------------------------------------------------" + 
        "\n¡DECORA TU HELADO!"+
        "\n1.ARITOS" +
        "\n2.CHISPAS" +
        "\n3.GUSANOS" +
        "\n4.KIWIS" +
        "\n5.MALVAVISCOS" +
        "\n6.MANGUITOS" +
        "\n7.PANDITAS" ; 
    }
}
