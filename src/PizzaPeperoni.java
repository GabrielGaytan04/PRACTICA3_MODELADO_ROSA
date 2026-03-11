/**
 * Clase encargada de generar una pizza de pepperoni
 * Hereada de la clase Pizza
 **/

public class PizzaPeperoni extends Pizza{

   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaPeperoni(String tipoMasa){
        super("3", "Pizza Peperoni", "Pizza con peperoni, pos si vdd", 100.00, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("COLOCANDO MUCHO QUESO. La pizza de PEPERONI sabe mejor cuando tiene queso");
    }

    @Override
    protected void colocarProteina() {
	System.out.println("Sera muy atascado COLOCAR 100 RODAJAS DE PEPERONI? Nahhh....");
        
    }
}
