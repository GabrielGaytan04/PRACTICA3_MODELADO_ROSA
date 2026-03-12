import java.util.Scanner;
/**
 * Clase principal que maneja la interacción del cliente con el robot
 * de la pizzería "El Pequeño Cesarín".
 */
public class Main {

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        int opcion;

        Mensajes.saludo();

        do {
            Mensajes.menuOpciones();
            opcion = leerEntero(scanner, 0, 5);

            switch (opcion) {
                case 1:
                    Mensajes.limpiarPantalla();
                    robot.llamar();
                    break;

                case 2:
                    Mensajes.limpiarPantalla();
                    if (robot.getEstado() == robot.getDormido()) {
                        System.out.println("Debes llamar al robot primero.");
                         break;
                    }
                    if (robot.getEstado() == robot.getPreparando()) {
                         System.out.println("Robotcin está ocupado preparando tu orden.");
                         break;
                    }
                    if (robot.getEstado() == robot.getEsperando()) {
                         System.out.println("Ya tienes una orden lista para recoger.");
                         break;
                    }
                    if (robot.getPizza() != null || robot.getHelado() != null) {
                        System.out.println("Ya tienes productos en tu orden, confirma o cancela antes de ordenar de nuevo.");
                        break;
                    }
                    Mensajes.menuProductos();
                    int selectorProducto = leerEntero(scanner, 1, 3);

                    if (selectorProducto == 1 || selectorProducto == 3) {
                        Mensajes.limpiarPantalla();
                        Mensajes.selectorVegetariana();
                        int selectorVegetariana = leerEntero(scanner, 1, 2);
                        Mensajes.limpiarPantalla();
                        Pizza pizza = seleccionarPizza(scanner, selectorVegetariana);
                        if (pizza != null) {
                            robot.ordenarPizza(pizza);
                        }
                    }

                    if (selectorProducto == 2 || selectorProducto == 3) {
                        Helado helado = seleccionarHelado(scanner);
                        if (helado != null) {
                            robot.ordenarHelado(helado);
                        }
                    }
                    System.out.println("\nProductos agregados a tu orden. Selecciona 'Confirmar orden' para continuar.");
                    break;

                case 3:
                    Mensajes.limpiarPantalla();
                    if (robot.getEstado() != robot.getTomandoOrden()) {
                        System.out.println("No hay ninguna orden que confirmar.");
                        break;
                    }
                    if (robot.getPizza() == null && robot.getHelado() == null) {
                        System.out.println("No puedes confirmar una orden vacía, debes ordenar algo primero.");
                        break;
                    }
                    robot.confirmar();
                    break;

                case 4:
                    Mensajes.limpiarPantalla();
                    if (robot.getPizza() == null && robot.getHelado() == null) {
                        System.out.println("No hay ningún producto ordenado para cancelar.");
                        break;
                    }
                    if (robot.getEstado() != robot.getTomandoOrden()) {
                        System.out.println("No es posible cancelar.");
                        break;
                    }
                    robot.cancelar();
                    break;

                case 5:
                    Mensajes.limpiarPantalla();
                    if (robot.getEstado() != robot.getEsperando()) {
                        System.out.println("No hay ninguna orden lista para entregar.");
                        break;
                    }
                    robot.entregar();
                    break;

                case 0:
                    break;

                default:
                    Mensajes.limpiarPantalla();
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        Mensajes.limpiarPantalla();
        Mensajes.despedida();
        scanner.close();
    }

    /**
     * Lee un entero del scanner de forma segura dentro de un rango válido.
     * Si la entrada no es válida, muestra un mensaje y vuelve a pedir.
     * @param scanner Scanner para leer la entrada.
     * @param min Valor mínimo aceptado.
     * @param max Valor máximo aceptado.
     * @return el entero leído dentro del rango válido.
     */
    private static int leerEntero(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int valor = scanner.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Opción no válida, ingresa un número entre " + min + " y " + max + ".");
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Opción no válida, ingresa un número.");
            }
        }
    }

    /**
     * Maneja la selección de pizza por parte del cliente.
     * @param scanner Scanner para leer la entrada del cliente.
     * @param selectorVegetariana Indica si el cliente quiere pizza vegetariana.
     * @return Pizza seleccionada por el cliente.
     */
    private static Pizza seleccionarPizza(Scanner scanner, int selectorVegetariana) {
        Mensajes.limpiarPantalla();
        Mensajes.menuMasas();
        int opcionMasa = leerEntero(scanner, 1, 3);
        Mensajes.limpiarPantalla();
        String tipoMasa;

        switch (opcionMasa) {
            case 1: tipoMasa = "napolitana"; break;
            case 2: tipoMasa = "romana"; break;
            case 3: tipoMasa = "americana"; break;
            default: return null;
        }

        if (selectorVegetariana == 1) {
            Mensajes.limpiarPantalla();
            Mensajes.menuPizzasVegetarianas();
            int opcionPizza = leerEntero(scanner, 1, 2);
            Mensajes.limpiarPantalla();
            switch (opcionPizza) {
                case 1: return new PizzaSoya(tipoMasa);
                case 2: return new PizzaFrijoles(tipoMasa);
                default: return null;
            }
        } else {
            Mensajes.limpiarPantalla();
            Mensajes.menuPizzas();
            int opcionPizza = leerEntero(scanner, 1, 3);
            Mensajes.limpiarPantalla();
            switch (opcionPizza) {
                case 1: return new PizzaPeperoni(tipoMasa);
                case 2: return new PizzaMexicana(tipoMasa);
                case 3: return new PizzaSardinas(tipoMasa);
                default: return null;
            }
        }
    }

    /**
     * Maneja la selección de helado y toppings por parte del cliente.
     * @param scanner Scanner para leer la entrada del cliente.
     * @return Helado seleccionado y decorado por el cliente.
     */
    private static Helado seleccionarHelado(Scanner scanner) {
        Mensajes.limpiarPantalla();
        Mensajes.menuSaboresHelado();
        int opcionSabor = leerEntero(scanner, 1, 3);
        Mensajes.limpiarPantalla();
        Helado helado;

        switch (opcionSabor) {
            case 1: helado = new HeladoFresa(); break;
            case 2: helado = new HeladoVainilla(); break;
            case 3: helado = new HeladoChocolate(); break;
            default: return null;
        }

        int[] contadorToppings = new int[8];
        int opcionTopping;

        do {
            Mensajes.limpiarPantalla();
            Mensajes.menuToppings(contadorToppings);
            opcionTopping = leerEntero(scanner, 0, 8);

            if (opcionTopping == 0) break;

            int indice = opcionTopping - 1;

            if (contadorToppings[indice] >= 3) {
                continue;
            }

            contadorToppings[indice]++;

            switch (opcionTopping) {
                case 1: helado = new DecoradorGusanitos(helado); break;
                case 2: helado = new DecoradorPanditas(helado); break;
                case 3: helado = new DecoradorAritos(helado); break;
                case 4: helado = new DecoradorChispas(helado); break;
                case 5: helado = new DecoradorMalvaviscos(helado); break;
                case 6: helado = new DecoradorFresitas(helado); break;
                case 7: helado = new DecoradorManguitos(helado); break;
                case 8: helado = new DecoradorKiwis(helado); break;
            }

        } while (opcionTopping != 0);

        return helado;
    }
}
