package Reto10;

import java.util.ArrayList;

public class Carton {



    ArrayList<Integer> listaNumeros = new ArrayList<>();

    private int aciertos = 0;

    public Carton(){
        for (int i=0; i<10; i++){
            int aleatorio;
            do{
                aleatorio =(int)(Math.random()*50)+1;
            }while(listaNumeros.contains(aleatorio));
            listaNumeros.add(aleatorio);
        }
    }

    public void comprobarNumero(int n){ //se recorre el ArrayList y compara el int que guarda
        for(int i=0; i<listaNumeros.size(); i++){
            if (n == listaNumeros.get(i)) {
                aciertos++;
            }
        }
    }

    public String verNumeros(){ //OJO POR SI NO SE MUESTRAN CORRECTAMENTE
        return "Los números del cartón son: "+listaNumeros;
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

}

