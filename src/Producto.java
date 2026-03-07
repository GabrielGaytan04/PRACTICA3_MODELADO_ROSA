/**
 * Interfaz que representa un producto que puede ser ordenado por el cliente.
 *
 * Define los métodos básicos que todo producto debe implementar,
 * como su nombre, descripción y precio.
 */
public interface Producto{

    /**
     * Regresa el nombre del producto.
     *
     * @return el nombre del producto.
     */
    String getNombre();

    /**
     * Regresa la descripción del producto.
     *
     * @return la descripción del producto.
     */
    String getDescripcion();

    /**
     * Regresa el precio del producto.
     *
     * @return el precio del producto.
     */
    double getPrecio();
}