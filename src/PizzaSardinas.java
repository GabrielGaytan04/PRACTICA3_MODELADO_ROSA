/**
 * Clase encargada de generar una pizza de sardinas 
 * Hereada de la clase Pizza
 **/

public class PizzaSardinas extends Pizza{

   /**
    * Aunque quisieramos vivir en un mundo ideal en el que todas las pizzas costaran lo mismo, eso no es posible.
    * Cada pizza puede tener un costo distinto dependiendo del sabor. Un efecto mas  del capitalismo gore. 
    **/

    public PizzaSardinas(String tipoMasa){

        super("4", "Pizza Sardinas", "Pizza con sardinas y queso oaxaca", 175.00, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
	System.out.println("Colocarle queso a una PIZZA DE SARDINAS es una tarea paricularmente apestosa!!!!");
        
    }

    @Override
    protected void colocarProteina() {
        System.out.println("Colocando 3 latas de sardinas...Casi nadie pide esta cosa. Tenemos un exceso de sardinas en la bodega.");
        
    }
}
