public class HeladoFresa implements Helado{
    
    private String sabor;
    private double precio;

    public HeladoFresa(){
        this.sabor = "chocolate";
        this.precio = 0;
    }

    @Override
    public double getPrecio() { 
        return precio; 
    }

    @Override
    public String getDescripcion() { 
        return sabor; 
    }
}
