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
     * Indica que el robot aún no tiene la orden lista para entregar. 
     * Debe esperar.
     */
    @Override public void llamar(){
        System.out.println("Robotcin ya tiene tu orden lista. Debes recojerla.");
    }

    /**
     * Indica que no se puede ordenar una pizza pues
     * el robot está ocupado preparando la orden
     * y no puede atender nuevas llamadas.
     */
    @Override
    public void ordenarPizza(Pizza pizza){
        System.out.println("Robotcin está ocupado, no puede tomar órdenes.");
    }

    /**
     * Indica que no se puede ordenar una helado pues
     * el robot está ocupado preparando la orden
     * y no puede atender nuevas llamadas.
     */
    @Override
    public void ordenarHelado(Helado helado){
        System.out.println("Robotcin está ocupado, no puede tomar órdenes.");
    }

    
    /**
     * Indica que la orden ya fue confirmada y está lista para entregarse,
     * por lo que no se puede confirmar nuevamente.
     */
    @Override public void confirmar(){
        System.out.println("Robotcin está ocupado, no puede tomar órdenes.");
    }

    /**
     * Indica que no es posible cancelar la orden, ya que esta ya
     * fue preparada.
     */
    @Override public void cancelar(){
        System.out.println("No se puede cancelar después de haber confirmado.");
    }

     /**
     * Indica que ya se termino de preparar la orden.
     */
    @Override
    public void prepararOrden(){
        System.out.println("La orden ya fue preparada, solicite la entrega.");
    }

    /**
     * Indica que su orden ya se le será entregada.
     */
    @Override public void entregar(){
        System.out.println("¡Listo! Aquí tienes tu orden.... ¡Disfruta!");
        System.out.println("Orden entregada, Robotcin va a echarse un coyotito.");
        Mensajes.mostrarTicket(robot.getPizza(), robot.getHelado());
        robot.setPizza(null);
        robot.setHelado(null);
        robot.actualizarEstado(robot.getDormido());
    }

}
