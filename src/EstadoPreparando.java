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

    @Override
    public void ordenarPizza(Pizza pizza){
        System.out.println("Robotcin está ocupado, no puede tomar órdenes.");
    }

    @Override
    public void ordenarHelado(Helado helado){
        System.out.println("Robotcin está ocupado, no puede tomar órdenes.");
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
        System.out.println("Híjole mano, no puedes cancelar cuando la orden ya fue confirmada.");
    }
    
    @Override
    public void prepararOrden(){
        if (robot.getPizza() != null) {
            robot.getPizza().prepararPizza();
        }
        if (robot.getHelado() != null) {
            System.out.println("Preparando helado: " + robot.getHelado().getDescripcion());
        }
        System.out.println("Orden preparada, esperando entrega...");
        robot.actualizarEstado(robot.getEsperando());
    }

    /**
     * Indica que la orden aún se encuentra en preparación
     * y todavía no está lista para entregarse.
     */
    @Override public void entregar(){
        System.out.println("Ya falta poco, Robotcin está preparando la orden.");
    }

}
