/**
 * Interfaz que representa un helado.
 *
 * Extiende la interfaz {@code Producto}, ya que un helado es un tipo
 * de producto que puede ser ordenado por el cliente. Las clases que
 * implementen esta interfaz deben proporcionar información sobre
 * el nombre, descripción y precio del helado.
 */
public interface Helado extends Producto {

    /**
     * Regresa el nombre del helado.
     *
     * @return el nombre del helado.
     */
    String getNombre();

    /**
     * Regresa el precio del helado.
     *
     * @return el precio del helado.
     */
    double getPrecio();

    /**
     * Regresa la descripción del helado.
     *
     * @return la descripción del helado.
     */
    String getDescripcion();
}