/**
 * Representa el estado en el que el robot le entrega al cliente su orden. 
 * La diferencia entre EstadoEsperando y este estado es que en el primero 
 * el robot dice "estoy trabajando en ello" y en el segundo dice "ya lo tengo 
 * en la mano, ven por él". 
 *
 * En este estado la orden ya fue preparada y está lista para entregarse, el
 * cliente solo debe pasar por él, por lo que (al igual que en EstadoEsperando)
 * no se pueden agregar más productos ni modificar la orden.
 *
 * Implementa el comportamiento correspondiente al patrón de diseño State.
 */
public class EstadoListo implements EstadoRobot{
    /** Referencia al robot cuyo estado se está representando. */
    private Robot robot;

    /**
     * Construye un nuevo estado de espera para el robot dado.
     *
     * @param robot el robot al que pertenece este estado.
     */
    public EstadoListo(Robot robot) {
        this.robot = robot;
    }

    /**
     * Indica que el robot ya tiene la orden lista para entregar.
     */
    @Override public void llamar(){
        System.out.println("Robotcin ya tiene tu orden lista para entregar Aquí esta:");
    }

    /**
     * Indica que no es posible agregar más productos, ya que la orden
     * ya se está entregando.
     *
     * @param p el producto que se desea ordenar.
     */
    @Override public void ordenar(Producto p){
        System.out.println("Si quieres otra cosa debes volver a llamarme.");
    }
    
    /**
     * Indica que la orden ya fue entregada, por lo que no se 
     * puede confirmar nuevamente.
     */
    @Override public void confirmar(){
        System.out.println("Si quieres otra cosa debes volver a llamarme.");
    }

    /**
     * Indica que no es posible cancelar la orden, ya que esta ya
     * fue preparada.
     */
    @Override public void cancelar(){
        System.out.println("No hay ninguna orden que cancelar. Robotcin ya está entregándote tu orden.");
    }
    
    /**
     * Entrega la orden al cliente. Después de la entrega se limpia
     * la orden actual y el robot vuelve al estado Dormido.
     */
    @Override public void entregar(){
        System.out.println("Robotcin ya tiene lista tu orden.");
        robot.cancelarOrden();
        robot.actualizarEstado(robot.getDormido()); // para limpiar
    }

}
