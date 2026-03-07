/**
 * Representa el estado en el que el robot está esperando a que el cliente
 * recoja su orden.
 *
 * En este estado la orden ya fue preparada y está lista para entregarse,
 * por lo que no se pueden agregar más productos ni modificar la orden.
 *
 * Implementa el comportamiento correspondiente al patrón de diseño State.
 */
public class EstadoEsperando implements EstadoRobot{
    /** Referencia al robot cuyo estado se está representando. */
    private Robot robot;

    /**
     * Construye un nuevo estado de espera para el robot dado.
     *
     * @param robot el robot al que pertenece este estado.
     */
    public EstadoEsperando(Robot robot) {
        this.robot = robot;
    }

    /**
     * Indica que el robot ya tiene la orden lista para entregar.
     */
    @Override public void llamar(){
        System.out.println("Robotcin ya tiene tu orden lista para entregar.");
    }

    /**
     * Indica que no es posible agregar más productos, ya que la orden
     * está lista para entregarse.
     *
     * @param p el producto que se desea ordenar.
     */
    @Override public void ordenar(Producto p){
        System.out.println("Robotcin ya tiene tu orden lista para entregar. "
        + "Si quieres otra cosa debes esperar a que termine totalmente.");
    }
    
    /**
     * Indica que la orden ya fue confirmada y está lista para entregarse,
     * por lo que no se puede confirmar nuevamente.
     */
    @Override public void confirmar(){
        System.out.println("Robotcin ya tiene tu orden lista para entregar. "
        + "Si quieres otra cosa debes esperar a que termine totalmente.");
    }

    /**
     * Indica que no es posible cancelar la orden, ya que esta ya
     * fue preparada.
     */
    @Override public void cancelar(){
        System.out.println("No hay ninguna orden que cancelar. Robotcin ya tiene lista tu orden.");
        robot.cancelarOrden();
        robot.actualizarEstado(robot.getDormido());
    }
    
    /**
     * Entrega la orden al cliente. Después de la entrega se limpia
     * la orden actual y el robot vuelve al estado Dormido.
     */
    @Override public void entregar(){
        robot.cancelarOrden();
        robot.actualizarEstado(robot.getDormido()); // para limpiar
    }

}
