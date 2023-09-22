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
public class ListaRep implements Serializable{
    
    
    private String nombre;
    private int likes;
    private ArrayList <Cancion> canciones;

    public ListaRep(String nombre, int likes, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.likes = likes;
        this.canciones = canciones;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "ListaRep: "+nombre;
    }
    
    
    
    
    
}
