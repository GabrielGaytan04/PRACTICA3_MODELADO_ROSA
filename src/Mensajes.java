

/**
 * Clase encargada de guardar mensajes que podamos ocupar
 * en la aplicación
 */
public class Mensajes {

    /**
     * Muestra el saludo al cliente.
     */
    public static void saludo() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("BIENVENID@ AL");
        System.out.println("PEQUEÑO CESARIN!!!!");
        System.out.println("¿List@ para ordenar?");
    }

    /**
     * Muestra la despedida al cliente.
     */
    public static void despedida() {
        System.out.println("\n--------------------------------------------------------");
        System.out.println("GRACIAS POR VENIR AL...");
        System.out.println("PEQUEÑO CESARIN!!!!");
        System.out.println("¡Vuelve pronto! PIZZA PIZZA");
    }

    /**
     * Muestra el menú de opciones principales.
     */
    public static void menuOpciones() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("¿QUÉ DESEA HACER?");
        System.out.println("1. LLAMAR AL ROBOT");
        System.out.println("2. REALIZAR UNA ORDEN");
        System.out.println("3. CONFIRMAR ORDEN");
        System.out.println("4. CANCELAR ORDEN");
        System.out.println("5. RECIBIR SU ORDEN");
        System.out.println("0. SALIR");
    }

    /**
     * Muestra el menú de opciones por alimento.
     */
    public static void menuProductos() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("¿QUÉ DESEA ORDENAR HOY?");
        System.out.println("1. SOLO PIZZA");
        System.out.println("2. SOLO HELADO");
        System.out.println("3. PIZZA Y HELADO");
    }

    /**
     * Muestra el selector de preferencia vegetariana.
     */
    public static void selectorVegetariana() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("¿DESEA UNA PIZZA VEGETARIANA?");
        System.out.println("1. SÍ");
        System.out.println("2. NO");
    }

    /**
     * Muestra el menú de pizzas no vegetarianas disponibles.
     */
    public static void menuPizzas() {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("¡CONTAMOS CON LA SIGUIENTE VARIEDAD DE PIZZAS!");
        System.out.println("1. PEPPERONI");
        System.out.println("2. MEXICANA");
        System.out.println("3. SARDINAS");
    }

    /**
     * Muestra el menú de pizzas vegetarianas disponibles.
     */
    public static void menuPizzasVegetarianas() {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("¡CONTAMOS CON LAS SIGUIENTES OPCIONES VEGETARIANAS!");
        System.out.println("1. SOYA");
        System.out.println("2. FRIJOLES");
    }

    /**
     * Muestra el menú de tipos de masa disponibles.
     */
    public static void menuMasas() {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("TU PIZZA PUEDE TENER LAS SIGUIENTES MASAS:");
        System.out.println("1. NAPOLITANA");
        System.out.println("2. ROMANA");
        System.out.println("3. AMERICANA");
    }

    /**
     * Muestra el menú de sabores de helado disponibles.
     */
    public static void menuSaboresHelado() {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("¡CONTAMOS CON LOS SIGUIENTES SABORES DE HELADO!");
        System.out.println("1. FRESA");
        System.out.println("2. VAINILLA");
        System.out.println("3. CHOCOLATE");
    }

    /**
    * Muestra el menú de toppings disponibles para el helado.
    * @param contadorToppings arreglo con la cantidad de cada topping agregado.
    */
    public static void menuToppings(int[] contadorToppings) {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("SELECCIONA TUS TOPPINGS (MÁXIMO 3 DE CADA UNO)");
        System.out.println("1. GOMITAS DE GUSANO " + contadorToppings[0] + "/3");
        System.out.println("2. GOMITAS DE PANDA " + contadorToppings[1] + "/3");
        System.out.println("3. GOMITAS DE ARO " + contadorToppings[2] + "/3");
        System.out.println("4. CHISPAS DE CHOCOLATE " + contadorToppings[3] + "/3");
        System.out.println("5. MALVAVISCOS " + contadorToppings[4] + "/3");
        System.out.println("6. FRESITAS " + contadorToppings[5] + "/3");
        System.out.println("7. MANGUITOS " + contadorToppings[6] + "/3");
        System.out.println("8. KIWIS " + contadorToppings[7] + "/3");
        System.out.println("0. TERMINAR DE AGREGAR");
    }

    /**
     * Genera e imprime el ticket de la orden actual.
     * @param pizza Pizza de la orden, puede ser null.
     * @param helado Helado de la orden, puede ser null.
     */
    public static void mostrarTicket(Pizza pizza, Helado helado) {
        System.out.println("==========================================");
        System.out.println("               TICKET                    ");
        System.out.println("==========================================");
        if (pizza != null) {
            System.out.println("  Pizza: " + pizza.getNombre());
            System.out.println("  Precio: $" + pizza.getPrecio());
        }
        if (helado != null) {
            System.out.println("  Helado: " + helado.getDescripcion());
            System.out.println("  Precio: $" + helado.getPrecio());
        }
        double total = (pizza != null ? pizza.getPrecio() : 0.0) +
                       (helado != null ? helado.getPrecio() : 0.0);
        System.out.println("==========================================");
        System.out.println("  Total: $" + total);
        System.out.println("==========================================");
    }

    /**
     * Limpia la pantalla de la consola.
     */
    public static void limpiarPantalla() {
        try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}