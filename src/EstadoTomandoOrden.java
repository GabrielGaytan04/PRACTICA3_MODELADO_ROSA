/**
 * Representa el estado en el que el robot está tomando la orden del cliente.
 * 
 * En este estado el robot puede recibir productos para agregarlos a la orden
 * y luego confirmar la orden para pasar al estado de preparación.
 * 
 * Implementa el comportamiento correspondiente al patrón de diseño State.
 */
public class EstadoTomandoOrden implements EstadoRobot{
    /** Referencia al robot cuyo estado se está representando. */
    private Robot robot;

    /**
     * Construye un nuevo estado de toma de orden para el robot dado.
     * 
     * @param robot el robot al que pertenece este estado.
     */
    public EstadoTomandoOrden(Robot robot) {
        this.robot = robot;
    }

    /**
     * Indica que el robot ya ha sido llamado y está listo
     * para tomar la orden.
     */
    @Override public void llamar(){
        System.out.println("Ya llamaste a Robotcin. Está listo para tomar tu orden.");
    }

    @Override
    public void ordenarPizza(Pizza pizza){
        robot.setPizza(pizza);
        System.out.println("Pizza agregada a la orden: " + pizza.getNombre());
    }

    @Override
    public void ordenarHelado(Helado helado){
        robot.setHelado(helado);
        System.out.println("Helado agregado a la orden: " + helado.getDescripcion());
    }

    /**
     * Confirma la orden actual y cambia el estado del robot
     * al estado de preparación del producto.
     */
    @Override public void confirmar(){
        System.out.println("Orden confirmada, preparando...");
        robot.actualizarEstado(robot.getPreparando());
        robot.prepararOrden();
    }
    
    /**
     * Indica que no es posible cancelar la orden en este momento,
     * ya que primero debe terminarse de agregar productos.
     */
    @Override public void cancelar(){
        System.out.println("Orden cancelada, Robotcin ya se fue a su camita.");
        robot.setPizza(null);
        robot.setHelado(null);
        robot.actualizarEstado(robot.getDormido());
    }
    
    @Override
    public void prepararOrden(){
        System.out.println("Debe confirmar la orden primero.");
    }

    /**
     * Indica que no hay ninguna orden lista para entregar,
     * ya que el pedido aún se está realizando.
     */
    @Override public void entregar(){
        System.out.println("No hay ninguna orden que entregar. Primero debes terminar de ordenar.");
    }


}
