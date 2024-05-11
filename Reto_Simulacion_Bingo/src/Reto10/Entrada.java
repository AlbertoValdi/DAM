package Reto10;

public class Entrada {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("Alberto", "12345678K", 0);

        do {

            j1.comprobarNumero(numeroAleatorio());
            j1.recargarSaldo(40);
            j1.comprarCartones(5);
            j1.mostrarDatos();

        } while (!j1.isGanador());
        System.out.println("\n¡¡Ha aparecido el cartón premiado!!");
    }


    public static int numeroAleatorio() {
        return (int) (Math.random() * 50) + 1;
    }
}



