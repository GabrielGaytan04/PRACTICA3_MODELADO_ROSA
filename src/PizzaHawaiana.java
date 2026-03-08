/**
 * Clase encargada de generar una pizza de hawaiana 
 * Hereada de la clase Pizza 
 **/

public class PizzaHawaiana extends Pizza{

   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaHawaiana(String tipoMasa){
        super("1", "Pizza Hawaiana", "Pizza con piña y jamón", 145.00, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("Colocando queso a una PIZZA HAWAIANA. Nunca entendere el odio a la HAWAIANA");
        
    }

    @Override
    protected void colocarProteina() {
	System.out.println("Colocando MUCHO jamon y piña. ¿Sabian que la pizza HAWAINA  nació en Canadá?");
        
    }
}
