public class DecoradorManguitos extends DecoradorHelado{
    
    public DecoradorManguitos(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", manguitos"; 
    }
}
