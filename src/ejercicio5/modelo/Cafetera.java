package ejercicio5.modelo;

/**
 * Clase que modela el objeto {@link Cafetera}.
 */
public class Cafetera {

    /** Cantidad actual de la cafetera. */
    private int cantidadActual;
    /** Capacidad m�xima de la cafetera. */
    private int capacidadMaxima;

    /**
     * Constructor de la clase.
     *
     * @param capacidadMaxima Capacidad m�xima de la cafetera.
     * @param cantidadActual Cantidad actual de la cafetera.
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima = 1000;
        this.cantidadActual = cantidadActual = 0;
    }

    /**
     * Este método agrega la cantidad deseada a la cafetera, si la cantidad total sobrepasa la capacidad máxima, se iguala a
     * dicha capacidad (1000cc).
     * 
     * @param cantidadParaAgregar Cantidad de caf� a agregrar.
     */
    public void agregarCafe(int cantidadParaAgregar) {
        this.cantidadActual = this.cantidadActual + cantidadParaAgregar;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
            System.out.println(
                "No se han agregado la cantidad de café digitada debido a que alcanzó el límite, quedó a su capacidad máxima de 1000 cc.\n");
        }
        else {
            System.out.println("Se han agregado " + cantidadParaAgregar + " de café en la cafetera\n");
        }
    }

    /**
     * Obtiene la cantidad actual de la cafetera.
     * 
     * @return la cantidad actual de la cafetera.
     */
    public int getCantidadActual() {
        return this.cantidadActual;
    }

    /**
     * Obtiene la capacidad maxima de la cafetera.
     * 
     * @return la capacidad maxima de la cafetera.
     */
    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    /**
     * Este método llena la cafetera a la capacidad máxima.
     * 
     * @return Cadena de {@link String} con estado de la ejecuci�n.
     */
    public String llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        return ("Se ha llenado la cafetera a " + this.cantidadActual + " cc.\n");
    }

    /**
     * Este método sirve una taza de la cantidad actual de la cafetera.<br>
     * Si la cantidad actual de la cafetera es menor a la cantidad que se quiere servir, servirá la cantidad actual en la
     * cafetera.
     * 
     * @param cantidadAServir Cantidad a servir en la taza.
     */
    public void servirTaza(int cantidadAServir) {
        if (cantidadAServir < this.cantidadActual) {
            this.cantidadActual = this.cantidadActual - cantidadAServir;
            System.out.println("Se ha servido " + cantidadAServir + " cc de café en la taza\n");
        }
        else {
            this.cantidadActual = cantidadAServir;
            System.out.println("Se ha servido sólo " + this.cantidadActual + " de café, no había más.\n");
            this.cantidadActual = this.cantidadActual - cantidadAServir;
        }
    }

    /**
     * Establece la cantidad actual de la cafetera.
     * 
     * @param cantidadActual la cantidad actual de la cafetera a establecer.
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     * Establece la capacidad m�xima de la cafetera.
     * 
     * @param capacidadMaxima la capacidad m�xima de la cafetera a establecer.
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * M�todo que vacía la cafetera, el estado actual lo convierte a 0.
     */
    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Se ha vaciado la cafetera.\n");
    }

}
