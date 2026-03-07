/**
 * Decorador que agrega aritos a un helado.
 *
 * Esta clase extiende {@code DecoradorHelado} y añade aritos
 * como topping al helado base. Modifica la descripción del helado
 * y puede afectar su precio.
 *
 * Forma parte del patrón de diseño Decorator, permitiendo agregar
 * nuevas características a un objeto de manera dinámica sin
 * modificar su implementación original.
 */
public class DecoradorAritos extends DecoradorHelado{
    
    /**
     * Construye un decorador de aritos para el helado dado.
     *
     * @param helado el helado al que se le agregará el decorado.
     */
    public DecoradorAritos(Helado helado) {
        super(helado);
    }

    /**
     * Regresa el nombre del decorado.
     *
     * @return el nombre del decorador.
     */
    @Override
    public String getNombre(){
        return "Decorado de aritos";
    }

    /**
     * Regresa el precio del helado con el decorado agregado.
     *
     * @return el precio total del helado.
     */
    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    /**
     * Regresa la descripción del helado incluyendo el decorado.
     *
     * @return la descripción del helado con aritos.
     */
    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", aritos"; 
    }
}