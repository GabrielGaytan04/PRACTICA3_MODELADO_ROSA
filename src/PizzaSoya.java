/**
 * Clase encargada de generar una pizza de soya
 * Hereada de la clase Pizza 
 **/


public class PizzaSoya extends Pizza{
    
   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaSoya(String tipoMasa){
	//NOTA: En esta pizza, el valor booleano debe ser true. 
        super("5", "Pizza Soya", "Pizza con soya texturizada", 250.00, true, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("Colocando queso a la pizza de SOYA. Si el queso vegano no fuera TAN CARO.... podriamos decir que es vegana.");
        
    }

    @Override
    protected void colocarProteina() {
	System.out.println("Colocando soya texturizada....Cada paquete de soya vale un dia de mi salario....");
        
    }
}
