public class DecoradorFresitas extends DecoradorHelado{
    
    public DecoradorFresitas(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", fresitas"; 
    }
}
