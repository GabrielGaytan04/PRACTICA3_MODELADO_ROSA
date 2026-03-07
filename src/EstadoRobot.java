/**
 * Interfaz que define las operaciones que puede realizar un robot
 * dependiendo de su estado actual.
 *
 * Forma parte del patrón de diseño State, donde cada implementación
 * de esta interfaz representa un estado distinto del robot
 * (como: dormido, tomando orden, preparando o esperando).
 *
 * Cada estado decide cómo responder a las acciones del usuario.
 */
public interface EstadoRobot {

    /**
     * Llama al robot para que atienda al cliente.
     * El comportamiento depende del estado actual del robot.
     */
    void llamar();

    /**
     * Agrega un producto a la orden del cliente.
     * El comportamiento depende del estado actual del robot.
     *
     * @param producto el producto que se desea agregar a la orden.
     */
    void ordenar(Producto producto);

    /**
     * Confirma la orden actual del cliente.
     * El comportamiento depende del estado actual del robot.
     */
    void confirmar();

    /**
     * Cancela la orden actual del cliente.
     * El comportamiento depende del estado actual del robot.
     */
    void cancelar();

    /**
     * Entrega la orden al cliente.
     * En algunos estados esta operación no está disponible.
     */
    void entregar();
}