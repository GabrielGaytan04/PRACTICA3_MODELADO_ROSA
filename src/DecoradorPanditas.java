public class DecoradorPanditas extends DecoradorHelado{
    
    public DecoradorPanditas(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", panditas"; 
    }
}
