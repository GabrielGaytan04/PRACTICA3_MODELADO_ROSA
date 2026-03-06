public abstract class DecoradorHelado implements Helado{
    
    protected Helado helado;

    public DecoradorHelado(Helado helado) {
        this.helado = helado;
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio(); 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion(); 
    }
}
