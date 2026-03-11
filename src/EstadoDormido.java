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
        System.out.println("Robotcin ya anda al tiro, tras ser llamado.");
        robot.actualizarEstado(robot.getTomandoOrden());
    }

    @Override
    public void ordenarPizza(Pizza pizza){
        System.out.println("Robotcin está planchando oreja, debe llamarlo primero.");
    }

    @Override
    public void ordenarHelado(Helado helado){
        System.out.println("Robotcin está haciendo la mimición, debe llamarlo primero.");
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
    
    @Override
    public void prepararOrden(){
        System.out.println("Robotcin se está echando una pestañita, debe llamarlo primero.");
    }

    /**
     * Indica que no hay ninguna orden que entregar mientras
     * el robot está dormido.
     */
    @Override public void entregar(){
        System.out.println("No hay ninguna orden que entregar. Robotcin está durmiendo.");
    }
}
