/**
 * Decorador que agrega chispas a un helado.
 *
 * Esta clase extiende {@code DecoradorHelado} y añade chispas
 * como topping al helado base. Modifica la descripción del helado
 * y puede afectar su precio.
 *
 * Forma parte del patrón de diseño Decorator, que permite añadir
 * funcionalidades a un objeto de forma dinámica sin modificar
 * su implementación original.
 */
public class DecoradorChispas extends DecoradorHelado{
    
    /**
     * Construye un decorador de chispas para el helado dado.
     *
     * @param helado el helado al que se le agregará el decorado.
     */
    public DecoradorChispas(Helado helado) {
        super(helado);
    }
    

    /**
     * Regresa el precio del helado con el decorado agregado.
     *
     * @return el precio total del helado.
     */
    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 2.00; 
    }

    /**
     * Regresa la descripción del helado incluyendo el decorado.
     *
     * @return la descripción del helado con chispas.
     */
    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", chispas"; 
    }
}