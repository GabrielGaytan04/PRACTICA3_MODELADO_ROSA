/**
 * Representa un helado de vainilla.
 *
 * Esta clase implementa la interfaz {@code Helado} y define las
 * características básicas de este producto, como su nombre,
 * precio y descripción.
 */
public class HeladoVainilla implements Helado{
    
    /** Sabor o descripción del helado. */
    private String sabor;

    /** Precio del helado. */
    private double precio;

    /**
     * Construye un helado de vainilla con valores iniciales.
     */
    public HeladoVainilla(){
        this.sabor = "chocolate";
        this.precio = 0;
    }

    /**
     * Regresa el nombre del helado.
     *
     * @return el nombre del producto.
     */
    @Override
    public String getNombre(){
        return "Helado de vainilla";
    }

    /**
     * Regresa el precio del helado.
     *
     * @return el precio del producto.
     */
    @Override
    public double getPrecio() { 
        return precio; 
    }

    /**
     * Regresa la descripción o sabor del helado.
     *
     * @return la descripción del producto.
     */
    @Override
    public String getDescripcion() { 
        return sabor; 
    }
}
