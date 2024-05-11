package Reto_9;

public class Entrada {

    public static void main (String [] args){

        Equipo equipoLocal = new Equipo("Yayo Vallecano");
        Equipo equipoVisitante = new Equipo("Real Suciedad");

        Partido jornada1= new Partido (equipoLocal, equipoVisitante);


        jornada1.iniciarPartido();
        jornada1.mostrarResultado();


    }
}
