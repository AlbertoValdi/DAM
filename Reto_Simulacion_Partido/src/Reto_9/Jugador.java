package Reto_9;

public class Jugador {

    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;


    public Jugador(String nombre, String posicion, boolean estrella, int calidad) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;

        if (calidad > 90) {
            this.estrella = true;
        } else {
            this.estrella = false;
        }

    }


    public void mostrardatos() {
        System.out.println("\nLos datos del jugador son: " +
                "\nNombre: " + this.nombre +
                "\nPosición: " + this.posicion +
                "\nCalidad: " + this.calidad +
                "\nEstrella: " + this.estrella);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public int getCalidad() {
        return this.calidad;
    }

    public boolean getEstrella(){ // Quizá sobre este método.
        return this.estrella;
    }

    public boolean isEstrella(){
        return this.estrella;
    }

}
