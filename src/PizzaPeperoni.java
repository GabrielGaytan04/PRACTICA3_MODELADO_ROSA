public class PizzaPeperoni extends Pizza{
    
    public PizzaPeperoni(String tipoMasa){
        super("3", "Pizza Peperoni", "Pizza con peperoni, pos si vdd", 0, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
        
    }

    @Override
    protected void colocarProteina() {
        
    }
}
