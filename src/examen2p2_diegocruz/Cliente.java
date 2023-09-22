/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dfcm9
 */
public class Cliente extends Usuario implements Serializable{
    
    private ArrayList <Cancion> favcanc = new ArrayList();
    private ArrayList <ListaRep> listascreadas = new ArrayList();
    private ArrayList <ListaRep> listasmegusta = new ArrayList();

    public Cliente(String uname, String passw, int edad) {
        super(uname, passw, edad);
    }

    public ArrayList<Cancion> getFavcanc() {
        return favcanc;
    }

    public void setFavcanc(ArrayList<Cancion> favcanc) {
        this.favcanc = favcanc;
    }

    public ArrayList<ListaRep> getListascreadas() {
        return listascreadas;
    }

    public void setListascreadas(ArrayList<ListaRep> listascreadas) {
        this.listascreadas = listascreadas;
    }

    public ArrayList<ListaRep> getListasmegusta() {
        return listasmegusta;
    }

    public void setListasmegusta(ArrayList<ListaRep> listasmegusta) {
        this.listasmegusta = listasmegusta;
    }

    @Override
    public String toString() {
        return "Cliente: "+super.getUname();
    }
    
    
    
    
    
}
