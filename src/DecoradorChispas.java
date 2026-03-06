public class DecoradorChispas extends DecoradorHelado{
    
    public DecoradorChispas(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", chispas"; 
    }
}
