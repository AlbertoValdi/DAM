package Reto_9;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private boolean terminado;

    private int parteActual;



    public Partido (Equipo equipoLocal, Equipo equipoVisitante){ //metodo constructor con los objetos de la clase equipo
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;

    }

    public void marcarGol (Equipo equipoLocal, Equipo equipoVisitante){
        if(equipoLocal.atacar()){
            if(equipoLocal.getNivelAtaque()>equipoVisitante.getNivelDefensa()){
                equipoLocal.setNumeroGoles(equipoLocal.getNumeroGoles()+1);
                System.out.println("¡Gol del equipo "+equipoLocal.getNombre()+" !");
            }
        }
    }

    public void iniciarPartido (){
        for(parteActual=1; parteActual<3; parteActual++){
            System.out.println("\nParte "+parteActual);
            for (int i =0; i<3; i++){
                marcarGol(equipoLocal, equipoVisitante);
                marcarGol(equipoVisitante, equipoLocal);
            }
        }
        this.terminado = true;
    }

    public void mostrarResultado(){
        if(this.terminado){
            System.out.println("\n El resultado final es : "+equipoLocal.getNombre()+
                    " "+equipoLocal.getNumeroGoles()+" , "+equipoVisitante.getNombre()+
                    " "+equipoVisitante.getNumeroGoles());
        } else {
            System.out.println("\nSin jugar o jugando.");
        }
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante(){
        return equipoVisitante;
    }

    public int getParteActual(){
        return parteActual;
    }

    public boolean isTerminado(){
        return this.terminado;
    }
}
