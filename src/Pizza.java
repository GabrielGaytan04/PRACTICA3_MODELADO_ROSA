/**
 * Clase abstracta que se encarga de generar una pizza
 * implementa  a la interfaz Producto.
 **/

public abstract class Pizza implements Producto{

    /**
     * Variables de clase.
     *
     * Toda pizza contara con los siguientes atributos: numero de identificacion (idProducto), nombre,
     * descripcion, precio si es vegetariana o no, asi como su tipo de masa.
     * La mayoria de los atributos seran cadenas de texto.
     * Unicamente el precio sera un valor double,
     * Unicamente saber si la pizza es Vegetariana o no sera booleana.
     **/

    private final String idProducto;
    private final String nombre;
    private final String descripcion;
    private final double precio;
    private final boolean esVegetariana;
    private final String tipoMasa;

   /**
    * CONSTRUCTOR PARAMETRIZADO
    * Conviene ser capaces de generar una pizza como nosotros pidamos, por lo cual,
    * recibira como parametros el mismo numero de atributos que definimos.
    **/

    public Pizza(String idProducto, String nombre, String descripcion, double precio, boolean esVegetariana,String tipoMasa){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.esVegetariana = esVegetariana;
        this.tipoMasa = tipoMasa;
    }

    /**
     * PREPARACION DE PIZZA
     * No tiene retorno.
     * Su cuerpo consiste unicamente de llamadas a otros metodos de la clase.
     * Podemos entenderlo como una rutina de 10 pasos.
     **/

    public void prepararPizza(){

	/** PASO 1 : preparacion de la masa**/
        prepararMasa();

        /** PASO 2 : aplanar masa**/
        aplanarMasa();

	/** PASO 3 : colocar salsa**/
        colocarSalsa();

	/** PASO 4 : colocar queso**/
        colocarQueso();

        /** PASO 5 : colocar especias**/
        colocarEspecias();

	/** PASO 6 : colocar proteina**/
        colocarProteina();

        /** PASO 7 : meter al horno**/
        meterAlHorno();

        /** PASO 8 : esperar**/
        esperar();

        /** PASO 9 : sacar del horno**/
        sacarDelHorno();

        /** PASO 10 : empaquetar**/
        empaquetar();
    }

   /**
    * METODOS DE PREPARACION
    * En este punto del programa se encuentran todos los metodos que se encargan de registrar
    * la preparacion de una pizza.
    **/


    /**
     * PREPARAR MASA
     **/
    protected void prepararMasa(){

    }

    /**
     * APLANAR MASA
     **/
    protected void aplanarMasa(){

    }

   /**
    * COLOCAR SALSA
    **/
    protected void colocarSalsa(){

    }

   /**
    * METODO ABSTRACO: Los distinris tipos de pizza se encargaran de implementar su 
    * propia manera de colocar queso 
    **/
    protected abstract void colocarQueso();

    /**
     * COLOCAR ESPECIAS
     **/
    protected void colocarEspecias(){

    }

   /**
    * COLOCAR PROTEINA 
    **/
    protected abstract void colocarProteina();

    /**
     * METER AL HORNO
     **/
    protected void meterAlHorno(){

    }

    /**
     * ESPERAR
     **/
    protected void esperar(){

    }

   /**
    * SACAR DEL HORNO 
    **/
    protected void sacarDelHorno(){

    }

   /**
    * EMPAQUETAR
    **/
    protected void empaquetar(){

    }

	
    /**
     * METODOS DE ACCESO 
     * Esta seccion del codigo esta dedicada a recuperar aquellos datos que nos interesen 
     * de las pizzas.
     **/

   /**
    * Devuelve la identificacion del producto
    **/

    public String getIdProducto(){
        return idProducto;
    }

    /**
     * Devuelve el nombre del producto 
     **/

    public String getNombre(){
        return nombre;
    }

    /**
     * Devuelve la descripcion del producto
     **/

    public String getDescripcion(){
        return descripcion;
    }


    /**
     * Devuelve un numero de tipo double 
     **/

    public double getPrecio(){
        return precio;
    }

   /**
    * Devuelve un booleano 
    **/

    public boolean getEsVegetariana(){
        return esVegetariana;
    }

   /**
    * Devuelve el tipo de masa que definimos
    **/

    public String getTipoMasa(){
        return tipoMasa;
    }
}
