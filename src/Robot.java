import java.util.ArrayList;
import java.util.List;

public class Robot{
    private EstadoRobot estado;
    private EstadoRobot dormido;
    private EstadoRobot tomandoOrden;
    private EstadoRobot preparando;
    private EstadoRobot esperando;

    // Lista de producto
    private List<Producto> orden = new ArrayList<>();

    public void agregarProducto(Producto p){
        orden.add(p);
    }

    public List<Producto> getOrden(){
        return orden;
    }

    public void cancelarOrden(){
        orden.clear();
    }

    public Robot(){
        this.dormido = new EstadoDormido(this);
        this.tomandoOrden = new EstadoTomandoOrden(this);
        this.preparando = new EstadoPreparando(this);
        this.esperando = new EstadoEsperando(this);
        this.estado = dormido; 
    }

    // getters 
    public EstadoRobot getDormido(){
        return dormido;
    }

    public EstadoRobot getTomandoOrden(){
        return tomandoOrden;
    }

    public EstadoRobot getPreparando(){
        return preparando;
    }

    public EstadoRobot getEsperando(){
        return esperando;
    }

    // para el cliente
    public void iniciarLlamada(){
        estado.llamar();
    }

    public void pedir(Producto p){
        estado.ordenar(p);
    }

    public void cancelar(){
        estado.cancelar();
    }

    public void confirmar(){
        estado.confirmar();
    }

}