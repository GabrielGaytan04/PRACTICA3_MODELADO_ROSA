/**
 * Decorador que agrega malvaviscos a un helado.
 *
 * Esta clase extiende {@code DecoradorHelado} y añade malvaviscos
 * como topping al helado base. Modifica la descripción del helado
 * y puede alterar su precio.
 *
 * Forma parte del patrón de diseño Decorator, que permite añadir
 * responsabilidades a un objeto de manera dinámica.
 */
public class DecoradorMalvaviscos extends DecoradorHelado{
    
    /**
     * Construye un decorador de malvaviscos para el helado dado.
     *
     * @param helado el helado al que se le agregará el decorado.
     */
    public DecoradorMalvaviscos(Helado helado) {
        super(helado);
    }

    /**
     * Regresa el precio del helado con el decorado agregado.
     *
     * @return el precio total del helado.
     */
    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 456.00; 
    }


    /**
     * Regresa la descripción del helado incluyendo el decorado.
     *
     * @return la descripción del helado con malvaviscos.
     */
    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", malvaviscos"; 
    }
}