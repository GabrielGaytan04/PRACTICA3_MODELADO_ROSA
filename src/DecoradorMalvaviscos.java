public class DecoradorMalvaviscos extends DecoradorHelado{
    
    public DecoradorMalvaviscos(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", malvaviscos"; 
    }
}
