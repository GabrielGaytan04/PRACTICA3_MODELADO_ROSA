import java.util.ArrayList;
import java.util.List;

/**
 * Representa al robot que atiende las órdenes de los clientes.
 *
 * Esta clase funciona como el "Contexto" dentro del patrón de diseño State.
 * Mantiene una referencia al estado actual del robot y delega las acciones
 * del cliente al objeto estado correspondiente.
 *
 * El robot puede encontrarse en distintos estados como:
 * dormido, tomando orden, preparando la orden o esperando para entregarla.
 */
public class Robot{
    /** Estado actual del robot. */
    private EstadoRobot estado;

    /** Estado en el que el robot está dormido. */
    private EstadoRobot dormido;

    /** Estado en el que el robot está tomando una orden. */
    private EstadoRobot tomandoOrden;

    /** Estado en el que el robot está preparando la orden. */
    private EstadoRobot preparando;

    /** Estado en el que el robot espera para entregar la orden. */
    private EstadoRobot esperando;

    /** Lista de productos que conforman la orden actual. */
    private List<Producto> orden = new ArrayList<>();

    /**r
     * Agrega un producto a la orden actual.
     *
     * @param p el producto que se desea agregar.
     */
    public void agregarProducto(Producto producto){
        orden.add(producto);
    }

    /**
     * Regresa la lista de productos de la orden actual.
     *
     * @return la lista de productos ordenados.
     */
    public List<Producto> getOrden(){
        return orden;
    }

    /**
     * Cancela la orden actual eliminando todos los productos.
     */
    public void cancelarOrden(){
        orden.clear();
    }

     /**
     * Construye un nuevo robot e inicializa todos sus estados.
     * El robot comienza en el estado Dormido.
     */
    public Robot(){
        this.dormido = new EstadoDormido(this);
        this.tomandoOrden = new EstadoTomandoOrden(this);
        this.preparando = new EstadoPreparando(this);
        this.esperando = new EstadoEsperando(this);
        this.estado = dormido; 
    }

    /**
     * Actualiza el estado actual del robot.
     *
     * @param nuevoEstado el nuevo estado del robot.
     */
    public void actualizarEstado(EstadoRobot nuevoEstado){
        estado = nuevoEstado;
    }

    // getters

    /**
     * Regresa el estado Dormido del robot.
     *
     * @return el estado Dormido.
     */ 
    public EstadoRobot getDormido(){
        return dormido;
    }

    /**
     * Regresa el estado en el que el robot está tomando una orden.
     *
     * @return el estado TomandoOrden.
     */
    public EstadoRobot getTomandoOrden(){
        return tomandoOrden;
    }

    /**
     * Regresa el estado en el que el robot está preparando la orden.
     *
     * @return el estado Preparando.
     */
    public EstadoRobot getPreparando(){
        return preparando;
    }

    /**
     * Regresa el estado en el que el robot está esperando para entregar la orden.
     *
     * @return el estado Esperando.
     */
    public EstadoRobot getEsperando(){
        return esperando;
    }

    // para el cliente

    /**
     * Permite al cliente llamar al robot.
     * La acción real depende del estado actual.
     */
    public void iniciarLlamada(){
        estado.llamar();
    }

    /**
     * Permite al cliente pedir un producto.
     * La acción depende del estado actual del robot.
     *
     * @param p el producto que se desea ordenar.
     */
    public void pedir(Producto producto){
        estado.ordenar(producto);
    }

    /**
     * Permite al cliente cancelar la orden actual.
     * La acción depende del estado actual del robot.
     */
    public void cancelar(){
        estado.cancelar();
    }

    /**
     * Permite al cliente confirmar la orden actual.
     * La acción depende del estado actual del robot.
     */
    public void confirmar(){
        estado.confirmar();
    }

    /**
     * Permite entregarle su ordenal cliente.
     * La acción depende del estado actual del robot.
     */
    public void entregar(){
        esperando.entregar();
    }

}