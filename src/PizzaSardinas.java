public class PizzaSardinas extends Pizza{
    
    public PizzaSardinas(String tipoMasa){
        super("4", "Pizza Sardinas", "Pizza con sardinas y queso oaxaca", 0, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
        
    }

    @Override
    protected void colocarProteina() {
        
    }
}
