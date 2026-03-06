public abstract class Pizza implements Producto{
    private final String idProducto;
    private final String nombre;
    private final String descripcion;
    private final double precio;
    private final boolean esVegetariana;
    private final String tipoMasa;

    public Pizza(String idProducto, String nombre, String descripcion, double precio, boolean esVegetariana,String tipoMasa){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.esVegetariana = esVegetariana;
        this.tipoMasa = tipoMasa;
    } 

    public void prepararPizza(){
        prepararMasa();
        aplanarMasa();
        colocarSalsa();
        colocarQueso();
        colocarEspecias();
        colocarProteina();
        meterAlHorno();
        esperar();
        sacarDelHorno();
        empaquetar();
    }

    protected void prepararMasa(){

    }

    protected void aplanarMasa(){

    }

    protected void colocarSalsa(){

    }

    protected abstract void colocarQueso();

    protected void colocarEspecias(){

    }

    protected abstract void colocarProteina();
    

    protected void meterAlHorno(){

    }

    protected void esperar(){

    }

    protected void sacarDelHorno(){

    }

    protected void empaquetar(){

    }

    public String getIdProducto(){
        return idProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public boolean getEsVegetariana(){
        return esVegetariana;
    }

    public String getTipoMasa(){
        return tipoMasa;
    }
}
