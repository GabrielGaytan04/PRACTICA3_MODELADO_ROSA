public class DecoradorKiwis extends DecoradorHelado{
    
    public DecoradorKiwis(Helado helado) {
        super(helado);
    }

    @Override
    public double getPrecio() { 
        return helado.getPrecio() + 0; 
    }

    @Override
    public String getDescripcion() { 
        return helado.getDescripcion() + ", kiwis"; 
    }
}
