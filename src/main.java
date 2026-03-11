
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
            opcion = scanner.nextInt();
            

            switch (opcion) {
                case 1:
					Mensajes.limpiarPantalla();
                    robot.llamar();
                    break;

                case 2:
					Mensajes.limpiarPantalla();
					if (robot.getEstado() != robot.getTomandoOrden()) {
        				System.out.println("Debes llamar al robot primero.");
       					break;
  				  	}
                    Mensajes.menuProductos();
                    int selectorProducto = scanner.nextInt();

                    if (selectorProducto == 1 || selectorProducto == 3) {
						Mensajes.limpiarPantalla();
						Mensajes.selectorVegetariana();
                        int selectorVegetariana = scanner.nextInt();
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
                    break;

                case 3:
					Mensajes.limpiarPantalla();
                    robot.confirmar();
                    break;

                case 4:
					Mensajes.limpiarPantalla();
                    robot.cancelar();
                    break;

                case 5:
					Mensajes.limpiarPantalla();
					Mensajes.mostrarTicket(robot.getPizza(), robot.getHelado());
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
     * Maneja la selección de pizza por parte del cliente.
     * @param scanner Scanner para leer la entrada del cliente.
     * @param selectorVegetariana Indica si el cliente quiere pizza vegetariana.
     * @return Pizza seleccionada por el cliente.
     */
    private static Pizza seleccionarPizza(Scanner scanner, int selectorVegetariana) {
		Mensajes.limpiarPantalla();
		Mensajes.menuMasas();
        int opcionMasa = scanner.nextInt();
        Mensajes.limpiarPantalla();
        String tipoMasa;

        switch (opcionMasa) {
            case 1: tipoMasa = "napolitana"; break;
            case 2: tipoMasa = "romana"; break;
            case 3: tipoMasa = "americana"; break;
            default:
                System.out.println("Opción no válida.");
                return null;
        }

        if (selectorVegetariana == 1) {
			Mensajes.limpiarPantalla();
			Mensajes.menuPizzasVegetarianas();
            int opcionPizza = scanner.nextInt();
            Mensajes.limpiarPantalla();
            switch (opcionPizza) {
                case 1: return new PizzaSoya(tipoMasa);
                case 2: return new PizzaFrijoles(tipoMasa);
                default:
                    System.out.println("Opción no válida.");
                    return null;
            }
        } else {
            Mensajes.limpiarPantalla();
			Mensajes.menuPizzas();
            int opcionPizza = scanner.nextInt();
            Mensajes.limpiarPantalla();
            switch (opcionPizza) {
                case 1: return new PizzaPeperoni(tipoMasa);
                case 2: return new PizzaMexicana(tipoMasa);
                case 3: return new PizzaSardinas(tipoMasa);
                default:
                    System.out.println("Opción no válida.");
                    return null;
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
        int opcionSabor = scanner.nextInt();
        Mensajes.limpiarPantalla();
        Helado helado;

        switch (opcionSabor) {
            case 1: helado = new HeladoFresa(); break;
            case 2: helado = new HeladoVainilla(); break;
            case 3: helado = new HeladoChocolate(); break;
            default:
                System.out.println("Opción no válida.");
                return null;
        }

        int[] contadorToppings = new int[8];
        int opcionTopping;

        do {
			Mensajes.limpiarPantalla();
			Mensajes.menuToppings();
            opcionTopping = scanner.nextInt();
            Mensajes.limpiarPantalla();

            if (opcionTopping == 0) break;

            int indice = opcionTopping - 1;

            if (indice < 0 || indice > 7) {
                System.out.println("Opción no válida.");
                continue;
            }

            if (contadorToppings[indice] >= 3) {
                System.out.println("Ya agregaste 3 de este ingrediente, elige otro.");
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


    