public class PizzaHawaiana extends Pizza{
    
    public PizzaHawaiana(String tipoMasa){
        super("1", "Pizza Hawaiana", "Pizza con piña y jamón", 0, false, tipoMasa);
    }

    @Override
    protected void colocarQueso() {
        
    }

    @Override
    protected void colocarProteina() {
        
    }
}
