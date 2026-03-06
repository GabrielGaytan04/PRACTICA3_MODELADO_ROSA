public class PizzaMexicana extends Pizza{
    
    public PizzaMexicana(String tipoMasa){
        super("2", "Pizza Mexicana", "Pizza con chorizo y chile", 0, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
        
    }

    @Override
    protected void colocarProteina() {
        
    }
}
