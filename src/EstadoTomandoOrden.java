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
        System.out.println("Ya llamaste a Robotcin.");
    }

     /**
     * Agrega un producto a la orden actual.
     * 
     * El robot permanece en el estado de tomar orden mientras
     * se sigan agregando productos.
     * 
     * @param p el producto que se desea agregar a la orden.
     */
    @Override public void ordenar(Producto producto){
        robot.actualizarEstado(robot.getTomandoOrden());
        robot.agregarProducto(producto);
        System.out.println("Robotcin ya está tomando tu orden" + "\n" 
        + "Has añadido: " + producto.getNombre() + " a tu orden.");
    }

    /**
     * Confirma la orden actual y cambia el estado del robot
     * al estado de preparación del producto.
     */
    @Override public void confirmar(){
        robot.actualizarEstado(robot.getPreparando());
    }
    
    /**
     * Indica que no es posible cancelar la orden en este momento,
     * ya que primero debe terminarse de agregar productos.
     */
    @Override public void cancelar(){
        System.out.println("No hay ninguna orden que cancelar. Primero debes terminar de ordenar.");
    }
    
    /**
     * Indica que no hay ninguna orden lista para entregar,
     * ya que el pedido aún se está realizando.
     */
    @Override public void entregar(){
        System.out.println("No hay ninguna orden que entregar. Primero debes terminar de ordenar.");
    }


}
