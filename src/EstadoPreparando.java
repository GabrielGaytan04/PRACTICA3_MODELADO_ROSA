/**
 * Representa el estado en el que el robot está preparando la orden del cliente.
 *
 * En este estado la orden ya fue confirmada y el robot se encuentra
 * trabajando en su preparación. Por lo tanto, no es posible agregar
 * nuevos productos ni modificar la orden.
 *
 * Implementa el comportamiento correspondiente al patrón de diseño State.
 */
public class EstadoPreparando implements EstadoRobot{
    /** Referencia al robot cuyo estado se está representando. */
    private Robot robot;

    /**
     * Construye un nuevo estado de preparación para el robot dado.
     *
     * @param robot el robot al que pertenece este estado.
     */
    public EstadoPreparando(Robot robot) {
        this.robot = robot;
    }

    /**
     * Indica que el robot está ocupado preparando la orden
     * y no puede atender nuevas llamadas.
     */
    @Override public void llamar(){
        System.out.println("Robotcin está ocupado preparando tu orden. Paciencia, no son enchiladas.");
    }

    /**
     * Indica que no es posible agregar más productos mientras
     * la orden está siendo preparada.
     *
     * @param p el producto que se desea ordenar.
     */
    @Override public void ordenar(Producto producto){
        System.out.println("Robotcin está ocupado preparando tu orden. Debes esperar para pedir otra cosa.");
    }

    /**
     * Indica que la orden ya fue confirmada y se encuentra
     * en proceso de preparación.
     */
    @Override public void confirmar(){
        System.out.println("Robotcin está ocupado preparando tu orden. Debes esperar a que termine para pedir otra cosa.");
    }

    /**
     * Cancela la orden actual mientras está siendo preparada.
     * La orden se elimina del robot.
     */
    @Override public void cancelar(){
        System.out.println("Lástima que hayas cancelado.");
        robot.cancelarOrden();
        robot.actualizarEstado(robot.getDormido());
    }
    
    /**
     * Indica que la orden aún se encuentra en preparación
     * y todavía no está lista para entregarse.
     */
    @Override public void entregar(){
        System.out.println("Ya falta poco, Robotcin está preparando la orden.");
        robot.actualizarEstado(robot.getEsperando());
    }

}
