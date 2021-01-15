package ejercicio5;

import java.util.Scanner;
import ejercicio5.modelo.Cafetera;

/**
 * Clase principal.
 */
public class Principal {

    /**
     * M�todo principal del proyecto.
     * 
     * @param args Arreglo de {@link String} que recibe los par�metros de ejecuci�n.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la cafetera virtual. \n¿Qué desea hacer?");
        Cafetera cafetera1 = new Cafetera(1000, 0);
        int opcion;
        //Este do-while es para mantener el programa abierto luego de cada opción que no incluya cerrarla.
        do {
            menu();
            opcion = sc.nextInt();
            System.out.println(opcionMenu(opcion, cafetera1));
        }
        while (opcion != 6);
        sc.close();
    }

    /**
     * Método menú, aquí sólo se muestran las opciones a elegir.
     */
    public static void menu() {
        System.out.println("#1. Llenar la cafetera." + "\n#2. Servir una taza." + "\n#3. Vaciar la cafetera."
            + "\n#4. Agregar café a la cafetera." + "\n#5. U cualquier otro número para salir");
    }

    /**
     * Método donde invoca los métodos de la clase Cafetera, donde se realizan los procesos internos.
     * 
     * @param opcion Opci�n a elegir del men�.
     * @param cafetera Instancia del objeto {@link Cafetera}.
     * @return Cadena de {@link String} con estado de la ejecuci�n.
     */
    public static String opcionMenu(int opcion, Cafetera cafetera) {
        Scanner sc = new Scanner(System.in);
        if (opcion == 1) {
            return (cafetera.llenarCafetera());
        }
        if (opcion == 2) {
            System.out.println("¿Cuanto café deseas servir?");
            cafetera.servirTaza(sc.nextInt());
        }
        if (opcion == 3) {
            cafetera.vaciarCafetera();
        }
        if (opcion == 4) {
            System.out.println("¿Cuánto café deseas ingresar a la cafetera?");
            cafetera.agregarCafe(sc.nextInt());
        }
        if (opcion == 5) {
            System.out.println("Gracias, vuelve pronto!");
            System.exit(0);
        }
        return null;
    }
}
