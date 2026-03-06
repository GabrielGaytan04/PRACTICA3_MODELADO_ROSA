public class DecoradorGusanitos extends DecoradorHelado{
    
    public DecoradorGusanitos(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", gusanitos"; 
    }
}
