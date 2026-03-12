/**
 * Decorador que agrega panditas a un helado.
 *
 * Esta clase extiende {@code DecoradorHelado} y añade una descripción
 * adicional al helado base, representando un topping de panditas.
 *
 * Forma parte del patrón de diseño Decorator, permitiendo añadir
 * características a un helado sin modificar su clase original.
 */
public class DecoradorPanditas extends DecoradorHelado{
    
    /**
     * Construye un decorador de panditas para el helado dado.
     *
     * @param helado el helado al que se le agregará el decorado.
     */
    public DecoradorPanditas(Helado helado) {
        super(helado);
    }


    /**
     * Regresa el precio del helado con el decorado agregado.
     *
     * @return el precio total del helado.
     */
    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 4.00; 
    }

    /**
     * Regresa la descripción del helado incluyendo el decorado.
     *
     * @return la descripción del helado con panditas.
     */
    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", panditas"; 
    }
}