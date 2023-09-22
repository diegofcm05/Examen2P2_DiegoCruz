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
public class Artista extends Usuario implements Serializable{
    
    private String nom_art;
    private ArrayList <Cancion> can_subidas = new ArrayList();

    public Artista(String nom_art, String uname, String passw, int edad) {
        super(uname, passw, edad);
        this.nom_art = nom_art;
    }

    public String getNom_art() {
        return nom_art;
    }

    public void setNom_art(String nom_art) {
        this.nom_art = nom_art;
    }

    @Override
    public String toString() {
        return "Artista: "+nom_art;
    }
    
    
    
    
    
    
    
}
