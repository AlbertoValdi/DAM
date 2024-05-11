package Reto_9;

import java.util.Random;

public class Equipo {

    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelCentro;
    private int numeroGoles = 0;



    public Equipo (String nombre) { // Constructor con parámetro nombre.

        Random rnd = new Random();
        int aleatorioAtaque = rnd.nextInt(101);
        int aleatorioDefensa = rnd.nextInt(101);
        int aleatorioCentro = rnd.nextInt(101);

        this.nombre = nombre;
        this.nivelAtaque = aleatorioAtaque;
        this.nivelDefensa = aleatorioDefensa;
        this.nivelCentro = aleatorioCentro;
        this.numeroGoles = numeroGoles;
    }

    public Equipo (String nombre, int nivelAtaque, int nivelDefensa, int nivelCentro,int numeroGoles) { // Constructor con parámetros.

        this.nombre = nombre;
        this.nivelAtaque =nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.numeroGoles = numeroGoles;

    }

    public boolean atacar(){
        boolean ataque;
        /*Si elimino el casteo de (int) en la fórmula, los equipos tienen alguna opción de marcar.
        en caso contrario nunca pasa el resultado de 0-0
        */
        double operacion =(Math.random()*2)+((this.nivelCentro*(Math.random()*2))/2);

        if( operacion > 70){
            ataque = true;
        }else{
            ataque = false;
        }
        return ataque;
    }

    public void mostrarDatos (){
        System.out.println("Los datos del Equipo son los siguientes: ");
        System.out.println("\nNombre del equipo: "+this.nombre+
                "\nNivel de Ataque: "+this.nivelAtaque+
                "\nNivel de Defensa: "+this.nivelDefensa+
                "\nNivel de Centro: "+this.nivelCentro+
                "\n Numero de Goles: "+this.numeroGoles);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public int getNivelAtaque(){
        return nivelAtaque;
    }

    public void setNivelAtaque (int nivelAtaque){
        this.nivelAtaque = nivelAtaque;
    }
    public int getNivelDefensa(){
        return nivelDefensa;
    }

    public void setNivelDefensa (int nivelDefensa){
        this.nivelDefensa = nivelDefensa;
    }
    public int getNivelCentro(){
        return nivelCentro;
    }

    public void setNivelCentro (int nivelCentro){
        this.nivelCentro = nivelCentro;
    }
    public int getNumeroGoles(){
        return numeroGoles;
    }
    public void setNumeroGoles (int numeroGoles){
        this.numeroGoles = numeroGoles;
    }

}
