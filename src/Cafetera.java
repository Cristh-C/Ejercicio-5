public class Cafetera {

    //ATRIBUTOS DE LA CLASE
    private int capacidadMaxima;
    private int cantidadActual;

    //MÉTODOS

    //CONSTRUCTOR
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima = 1000;
        this.cantidadActual = cantidadActual=0;
    }

    //GETTERS & SETTERS
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }



    //Este método funciona para llenar la cafetera a la capacidad máxima.
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
        System.out.println("Se ha llenado la cafetera a " + cantidadActual + " cc.\n");
    }


    /** Este método funciona para servir una taza de la cantidad actual de la cafetera
     *  Si la cantidad actual de la cafetera es menor a la cantidad que se quiere servir, servirá lo que falte
     *  en la cafetera, es decir, la cantidad actual.
     */

    public void servirTaza(int cantidadAServir){
        if (cantidadAServir<cantidadActual){
            cantidadActual = cantidadActual - cantidadAServir;
            System.out.println("Se ha servido " + cantidadAServir + " cc de café en la taza\n");
        } else {
            cantidadActual =  cantidadAServir;
            System.out.println("Se ha servido sólo " + cantidadActual + " de café, no había más.\n");
            cantidadActual = cantidadActual - cantidadAServir;
        }
    }

    //Este método vacía la cafetera, el estado actual lo convierte a 0.
    public void vaciarCafetera(){
        cantidadActual = 0;
        System.out.println("Se ha vaciado la cafetera.\n");
    }

    //Este método agrega la cantidad deseada a la cafetera, si la cantidad total sobrepasa la capacidad máxima, se iguala
    //a dicha capacidad (1000cc).
    public void agregarCafe(int cantidadParaAgregar){
        cantidadActual = cantidadActual + cantidadParaAgregar;
        if (cantidadActual>capacidadMaxima){
            cantidadActual=capacidadMaxima;
            System.out.println("No se han agregado la cantidad de café digitada debido a que alcanzó el límite, quedó a su capacidad máxima de 1000 cc.\n");
        } else {
            System.out.println("Se han agregado " + cantidadParaAgregar + " de café en la cafetera\n");
        }
    }


}


