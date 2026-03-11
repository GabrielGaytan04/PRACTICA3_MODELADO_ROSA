
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

     /** Pizza de la orden actual. */
    private Pizza pizza;

    /** Helado de la orden actual. */
    private Helado helado;

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

    public EstadoRobot getEstado() {
        return estado;
    }

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


    /**
     * Obtiene la pizza de la orden actual.
     * @return pizza
     */
    public Pizza getPizza() { 
        return pizza; 
    }

    /**
     * Establece la pizza de la orden actual.
     * @param pizza Pizza a establecer.
     */
    public void setPizza(Pizza pizza) { 
        this.pizza = pizza; 
    }

    /**
     * Obtiene el helado de la orden actual.
     * @return helado
     */
    public Helado getHelado() { 
        return helado; 
    }

    /**
     * Establece el helado de la orden actual.
     * @param helado Helado a establecer.
     */
    public void setHelado(Helado helado) { 
        this.helado = helado; 
    }

    /**
     * Permite al cliente llamar al robot.
     * La acción real depende del estado actual.
     */
    public void llamar(){
        estado.llamar();
    }

    /**
     * Ordena una pizza.
     * @param pizza Pizza a ordenar.
     */
    public void ordenarPizza(Pizza pizza) { 
        estado.ordenarPizza(pizza); 
    }

    /**
     * Ordena un helado.
     * @param helado Helado a ordenar.
     */
    public void ordenarHelado(Helado helado) { 
        estado.ordenarHelado(helado); 
    }

    /**
     * Permite al cliente cancelar la orden actual.
     */
    public void cancelar(){
        estado.cancelar();
    }

    /**
     * Permite al cliente confirmar la orden actual.
     */
    public void confirmar(){
        estado.confirmar();
    }

    /** Prepara la orden. */
    public void prepararOrden() { 
        estado.prepararOrden(); 
    }

    /**
     * Permite entregarle su ordenal cliente.
     */
    public void entregar(){
        estado.entregar();
    }

}