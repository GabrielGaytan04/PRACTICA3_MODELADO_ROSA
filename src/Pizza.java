/**
 * Clase abstracta que se encarga de generar una pizza
 * implementa  a la interfaz Producto.
 **/

public abstract class Pizza{

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
    private final double precioBase;
    private final String tipoMasa;

   /**
    * CONSTRUCTOR PARAMETRIZADO
    * Conviene ser capaces de generar una pizza como nosotros pidamos, por lo cual,
    * recibira como parametros el mismo numero de atributos que definimos.
    **/

    public Pizza(String idProducto, String nombre, String descripcion, double precioBase,String tipoMasa){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
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
	System.out.println("\nNecesitamos algo de agua y harina..." + "\nYa tenemos los ingredientes, hora de mezclaros!");
    }

    /**
     * APLANAR MASA
     **/
    protected void aplanarMasa(){
	System.out.println("\nToca aplanar nuestra masa..." + "\n *Canta vale mas un buen amor mientras trabaja*");

    }

   /**
    * COLOCAR SALSA
    **/
    protected void colocarSalsa(){

	System.out.println("\nColocamos la salsa de tomate...");

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
	System.out.println("Algunas hierbas a la italiana nunca estan de mas....");

    }

   /**
    * COLOCAR PROTEINA 
    * Metodo abstracto del cual se encargaran de implementar las clases que hereden.
    **/
    protected abstract void colocarProteina();

    /**
     * METER AL HORNO
     **/
    protected void meterAlHorno(){
	System.out.println("No importa si metemos la pizza a un horno sucio?" + "\nNah...La pizza se mete al horno.");

    }

    /**
     * ESPERAR
     **/
    protected void esperar(){

       /**
        * Este es el unico metodo en el que convendria un poco mas de contenido.  
        * Imprimir un par de veces el mensaje no es tan costoso.Podriamos parar el programa  
        * usando sleep, pero involucaria mas escritura que dificultaria la lectura del codigo
        **/
	System.out.println("\nY ahora la parte mas desesperante, ESPERAR. :(");
	for(int i = 0; i <10; i++){
            System.out.println("Esperando....");
        }

    }

   /**
    * SACAR DEL HORNO 
    **/
    protected void sacarDelHorno(){

	System.out.println("\nPerfecto! La pizza esta a la temperatura ideal. Ya podemos sacarla.");

    }

   /**
    * EMPAQUETAR
    **/
    protected void empaquetar(){
	
	System.out.println("\nUna pizza ha nacido y ahora debe ser empaquetada.");

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

    public double getPrecioBase(){
        return precioBase;
    }

   /**
    * Devuelve el tipo de masa que definimos
    **/

    public String getTipoMasa(){
        return tipoMasa;
    }

    /**
    * Devuelve un booleano 
    **/

    public boolean esVegetariana(){
        return false;
    }


    public double getPrecio() {
    return precioBase + getCostoMasa();
}

    private double getCostoMasa() {
        switch (tipoMasa) {
            case "napolitana": return 100.0;
            case "romana": return 175.0;
            case "americana": return 220.0;
            default: return 0.0;
    }
}
}
