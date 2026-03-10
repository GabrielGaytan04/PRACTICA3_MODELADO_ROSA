/**
 * Representa el estado "Dormido" del robot. En este estado el robot no 
 * puede tomar órdenes ni realizar acciones, excepto ser llamado para 
 * despertarse.
 * 
 * En el patrón de diseño State implementa el comportamiento del robot 
 * cuando se encuentra inactivo.
 */
public class EstadoDormido implements EstadoRobot{
    /** Referencia al robot cuyo estado se está representando. */
    private Robot robot;

    /**
     * Construye un nuevo estado Dormido para el robot dado.
     * 
     * @param robot el robot al que pertenece este estado.
     */
    public EstadoDormido(Robot robot){
        this.robot = robot;
    }

    /**
     * Despierta al robot y cambia su estado al estado de tomar orden.
     */
    @Override public void llamar(){
        System.out.println("Robotcin ya no está durmiendo.");
        robot.actualizarEstado(robot.getTomandoOrden());
    }
    
    /**
     * Indica que no se puede ordenar mientras el robot está dormido.
     * 
     * @param p el producto que se desea ordenar.
     */
    @Override public void ordenar(Producto producto){
        System.out.println("ZZZ... Robotcin está durmiendo. Primero debes llamarlo");
        robot.actualizarEstado(robot.getDormido());
    }

    /**
     * Indica que no hay ninguna orden que confirmar mientras el robot 
     * está dormido.
     */
    @Override public void confirmar(){
        System.out.println("No hay ninguna orden que confirmar. Robotcin está durmiendo.");
    }

    /**
     * Indica que no hay ninguna orden que cancelar mientras
     * el robot está dormido.
     */
    @Override public void cancelar(){
        System.out.println("No hay ninguna orden que cancelar. Robotcin está durmiendo. Para pedir algo primero debes llamarlo");
    }
    
    /**
     * Indica que no hay ninguna orden que entregar mientras
     * el robot está dormido.
     */
    @Override public void entregar(){
        System.out.println("No hay ninguna orden que entregar. Robotcin está durmiendo.");
    }
}
