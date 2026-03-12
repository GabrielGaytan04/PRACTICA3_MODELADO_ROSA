public class HeladoChocolate implements Helado{
    
     /** Sabor o descripción del helado. */
    private String sabor;

    /** Precio del helado. */
    private double precio;

    /**
     * Construye un helado de fresa con valores iniciales.
     */
    public HeladoChocolate(){
        this.sabor = "chocolate";
        this.precio = 873.00;
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
