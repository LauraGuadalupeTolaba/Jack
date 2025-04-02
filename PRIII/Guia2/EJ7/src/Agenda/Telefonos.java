package Agenda;

import java.util.ArrayList;

public class Telefonos {

    private int nroFijo;
    private ArrayList<Integer> celulares = new ArrayList<Integer>();

    public Telefonos() {
    }

    public int getNroFijo() {
        return nroFijo;
    }

    public void setNroFijo(int nroFijo) {
        this.nroFijo = nroFijo;
    }

    public ArrayList<Integer> getCelulares() {
        return celulares;
    }

    public void agregaCelular(Integer celular){
        celulares.add(celular);
    }

    @Override
    public String toString() {
        return " Telefonos \n" + "NroFijo =" + nroFijo + "\t celulares=" + celulares ;}
}
