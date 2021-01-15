import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la cafetera virtual. \n¿Qué desea hacer?");

        Cafetera cafetera1 = new Cafetera(1000,0);
        int opcion;

        //Este do-while es para mantener el programa abierto luego de cada opción que no incluya cerrarla.
        do {
            menu();
            opcion = sc.nextInt();
            opcionMenu(opcion, cafetera1);
        }while (opcion!=6);
    }

    //Método menú, aquí sólo se muestran las opciones a elegir.
    public static void menu(){
        System.out.println("#1. Llenar la cafetera." +
                "\n#2. Servir una taza." +
                "\n#3. Vaciar la cafetera." +
                "\n#4. Agregar café a la cafetera." +
                "\n#5. U cualquier otro número para salir");
    }

    //Método donde invoca los métodos de la clase Cafetera, donde se realizan los procesos internos.
    public static void opcionMenu(int opcion, Cafetera cafetera1){
        Scanner sc = new Scanner(System.in);

        if (opcion==1){
            cafetera1.llenarCafetera();
        } if (opcion==2){
            System.out.println("¿Cuanto café deseas servir?");
            int cantidadAServir = sc.nextInt();
            cafetera1.servirTaza(cantidadAServir);
        } if (opcion==3){
            cafetera1.vaciarCafetera();
        } if (opcion==4){
            System.out.println("¿Cuánto café deseas ingresar a la cafetera?");
            int cantidadParaAgregar = sc.nextInt();
            cafetera1.agregarCafe(cantidadParaAgregar);
        } if (opcion==5){
            System.out.println("Gracias, vuelve pronto!");
            System.exit(0);
        }
    }
}
