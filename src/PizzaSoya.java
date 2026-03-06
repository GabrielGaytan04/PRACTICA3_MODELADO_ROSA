public class PizzaSoya extends Pizza{
    
    public PizzaSoya(String tipoMasa){
        super("5", "Pizza Soya", "Pizza con soya texturizada", 0, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
        
    }

    @Override
    protected void colocarProteina() {
        
    }
}
