import java.util.Scanner;

/**
 * Clase encargada de ocupar los elementos programados
 * hasta la fecha. 
 **/

public class Aplicacion{

    /**
     * ATRIBUTOS DE CLASE
     * En la aplicacion buscaremos limitarnos a llamar a los objetos y métodos creados hasta la fecha. 
     */

    /**Objeto para mostrar mensajes**/
    Mensajes mensajes = new Mensajes();

    /**Objeto para poder registrar entradas del usuario**/
    Scanner registro = new Scanner(System.in); 

    /**Robot para ir registrando y modificanod los estados**/
    Robot robot = new Robot();

    /**
     * Metodo app que sera llamado en el main 
     **/
    public void app(){

	    /**Mostramos el saludo general**/
        System.out.println(mensajes.saludo());

        /**Actualiza estado del robot*/
        robot.actualizarEstado(robot.getTomandoOrden());

        /**Mandamos a mostrar el menu general**/
        System.out.println(mensajes.menuGeneral());

        /**El usuario asigna su valor de entrada al menu general**/
        int menuGeneral = registro.nextInt();

        /**
         * Realizamos un switch dependiendo de la opción 
         * ingresada por el usuario. 
         **/

        switch(menuGeneral) {
            /**1.El usuario quiere una pizza**/
            case 1 : 
                /**Mostramos un menu**/
                System.out.println(mensajes.menuPizzas());
                /**Llamamos al metodo de preparacion de la pizza**/
                preparaPizza();
            break;

             /**2.El usuario quiere un helado**/
            case 2 :
                /**Mostramos un menu**/
                System.out.println(mensajes.saboresHelado());
                /**Llamamos al metodo de preparacion de la pizza**/
                preparaHelado();
            break;

            /**3.El usuario quiere una pizza y un helado**/
            case 3 :
                /**Mostramos un menu**/
                System.out.println(mensajes.menuPizzas());
                preparaPizza();
                System.out.println(mensajes.saboresHelado());
                preparaHelado();
            break;

            /**4 El usuario quiere salir*/
            case 4:
                /**Mostramos un menu**/
                System.out.println(mensajes.despedida());
            break; 

            /**Default: mostrar menu general**/
            default :
                /**Mostramos un menu**/
                System.out.println(mensajes.menuGeneral());
        }
    }

    /**
     * METODOS DE FUNCIONAMIENTO Y ACTUALIZACION 
     * Una vez elegida una opcion, debemos preparar el alimento y 
     * actualizar al robot durante el proceso.
     **/



     public void preparaPizza(){

        /**Registramos la opcion en una variable interna**/
        int tipoPizza = registro.nextInt();

        /**Hacemos switch de la opcion**/
        switch(tipoPizza){

            case 1 :
                /**Creamos una pizza de pepperoni**/
                PizzaPeperoni peperoni = new PizzaPeperoni("napolitana");
                /*Preparamos la pizza**/
                peperoni.prepararPizza();
            break;

            case 2 : 
               /**Creamos una pizza de pepperoni**/
                PizzaHawaiana hawaiana = new PizzaHawaiana("napolitana");
                /*Preparamos la pizza**/
                hawaiana.prepararPizza();
            break;

            case 3: 
                /**Creamos una pizza de pepperoni**/
                PizzaMexicana mexicana = new PizzaMexicana("napolitana");
                /*Preparamos la pizza**/
                mexicana.prepararPizza();
            break; 

            case 4: 
                /**Creamos una pizza de pepperoni**/
                PizzaSardinas sardinas = new PizzaSardinas("napolitana");
                /*Preparamos la pizza**/
                sardinas.prepararPizza();
            break;

            case 5:
               /**Creamos una pizza de pepperoni**/
                PizzaSoya soya = new PizzaSoya("napolitana");
                /*Preparamos la pizza**/
                soya.prepararPizza();
            break; 
        }
     }

     /**Nota: Falta agregar si la persona quiere agregar un topping, ahorita lo hace de forma automatica**/
     public void preparaHelado(){

        /**Registramos la opcion en una variable interna**/
        int saborHelado = registro.nextInt();
        
            switch(saborHelado){
                case 1:
                    /**Creamos un helado de vainilla**/
                    HeladoVainilla vainlla = new HeladoVainilla();
                    /**Mostramos las coberturas de helado disponibles **/
                    System.out.println(mensajes.coberturasHelado());
                    /**Agregamos cobertura**/
                    agregaCobertura(vainlla);
                break;

                case 2:
                     /**Creamos un helado de chocolate**/
                     HeladoChocolate chocolate = new HeladoChocolate();
                     /**Mostramos las coberturas de helado disponibles **/
                     System.out.println(mensajes.coberturasHelado());
                     /**Agregamos cobertura**/
                     agregaCobertura(chocolate);
                break;

                case 3:
                    /**Creamos un helado de fresa**/
                    HeladoFresa fresa = new HeladoFresa();
                    /**Mostramos las coberturas de helado disponibles **/
                    System.out.println(mensajes.coberturasHelado());
                    /**Agregamos cobertura**/
                    agregaCobertura(fresa);
                break;
            }
     }

     /**
      * Metodo complementario que sea usado en el metodo de prepaparacion del helado
      */
     public void agregaCobertura(Helado helado){
          
        /**Registramos la opcion en una variable interna**/
        int cobertura = registro.nextInt();
            switch(cobertura){

                case 1:
                    /**Decoramos con aritos**/
                    DecoradorAritos aritos = new DecoradorAritos(helado);
                break;

                case 2:
                     /**Decoramos con chispas**/
                     DecoradorChispas chispas = new DecoradorChispas(helado);
                break;

                case 3:
                    /**Decoramos con gusanitos**/
                     DecoradorGusanitos gusanitos = new DecoradorGusanitos(helado);
                break;

                case 4:
                    /**Decoramos con Kiwis**/
                    DecoradorKiwis kiwis = new DecoradorKiwis(helado);
                break;

                case 5:
                    /**Decoramos con malvaviscos**/
                    DecoradorMalvaviscos malvaviscos = new DecoradorMalvaviscos(helado);
                break;

                case 6:
                    /**Decoramos con Manguitos**/
                    DecoradorManguitos manguitos = new DecoradorManguitos(helado);
                break;

                case 7: 
                    /**Decoramos con panditas**/
                    DecoradorPanditas panditas = new DecoradorPanditas(helado);
                break;
            }
        
     }
}