/**
 * Clase encargada de generar una pizza mexicana
 * Hereada de la clase Pizza
 **/
public class PizzaMexicana extends Pizza{

   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaMexicana(String tipoMasa){

        super("2", "Pizza Mexicana", "Pizza con chorizo y chile", 150.00, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("COLOCAMOS QUESO CON MUCHA CEBOLLA!!! LA PIZZA MEXICANA SIEMPRE LLEVA MAS CEBOLLA QUE QUESO");
        
    }

    @Override
    protected void colocarProteina() {
	System.out.println("Colocamos un poco de chorizo, algo de chile, pimiento y MUCHA CEBOLLA. MMMM CEBOLLA... ");
        
    }
}
