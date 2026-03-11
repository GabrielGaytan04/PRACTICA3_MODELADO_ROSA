/**
 * Clase encargada de generar una pizza de hawaiana 
 * Hereada de la clase Pizza 
 **/

public class PizzaFrijoles extends Pizza{

   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaFrijoles(String tipoMasa){
        super("1", "Pizza Frijoles", "Pizza con frijoles parados, qué rico ñam ñam", 145.00, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("Colocando queso a una PIZZA DE FRIJOLES");
        
    }

    @Override
    protected void colocarProteina() {
	System.out.println("Colocando MUCHOS frijoles a la pizza, recién saliditos de la olla");
        
    }
}
