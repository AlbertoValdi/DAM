package Reto10;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    Scanner scn = new Scanner(System.in);

    private String nombre;

    private String dni;
    Carton carton = new Carton();
    private ArrayList <Carton> listaCartones = new ArrayList<Carton>();
    private int saldo;
    private boolean ganador;

    public Jugador(String nombre, String dni, int saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
    }

    public void recargarSaldo (int cantidad){
        if(cantidad>0){
            saldo+=cantidad;
        }
    }

    public static void verCartones(ArrayList<Carton> c) {
        int i;
        for (i = 0; i < c.size(); i++){
            System.out.println("\nCartón nº: "+( i +1 ));
            System.out.println(c.get(i).verNumeros());
        }
    }

    public void mostrarDatos() {
        System.out.println("\nNombre del jugador: " + nombre +
                "\nSaldo: "+ saldo);
                Jugador.verCartones(listaCartones);
    }

    public void comprobarNumero(int numero) {
        for(int i = 0; i<listaCartones.size(); i++) {
            Carton carton = listaCartones.get(i);
            carton.comprobarNumero(numero);
                if (carton.getAciertos() == 10) {
                ganador = true;
                System.out.println("¡¡Cartón premiado, ha acertado todos!!");
                }
        }
    }

    public void comprarCartones(int cantidad){
        if (saldo-cantidad >=0){
            saldo-= cantidad;
            for(int i=0; i<cantidad;i++){
                listaCartones.add(new Carton());
            }
            System.out.println("Recarga satisfactoria.");

        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public boolean isGanador(){
        return ganador;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Carton> getCartones() {
        return listaCartones;
    }

    public void setCartones(ArrayList<Carton> listaCartones) {
        this.listaCartones = listaCartones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}
