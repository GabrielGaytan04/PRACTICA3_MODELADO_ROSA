/**
 * Decorador que agrega kiwis a un helado.
 *
 * Esta clase extiende {@code DecoradorHelado} y añade kiwis como
 * topping al helado base, modificando su descripción y posiblemente
 * su precio.
 *
 * Forma parte del patrón de diseño Decorator, permitiendo agregar
 * nuevas características a un helado sin modificar su implementación
 * original.
 */
public class DecoradorKiwis extends DecoradorHelado{
    
    /**
     * Construye un decorador de kiwis para el helado dado.
     *
     * @param helado el helado al que se le agregará el decorado.
     */
    public DecoradorKiwis(Helado helado) {
        super(helado);
    }


    /**
     * Regresa el precio del helado con el decorado agregado.
     *
     * @return el precio total del helado.
     */
    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 528.00; 
    }

    /**
     * Regresa la descripción del helado incluyendo el decorado.
     *
     * @return la descripción del helado con kiwis.
     */
    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", kiwis"; 
    }
}