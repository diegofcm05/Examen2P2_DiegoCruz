/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

import java.util.ArrayList;

/**
 *
 * @author dfcm9
 */
public class Album extends Lanzamiento{
    
    private ArrayList <Cancion> canciones = new ArrayList();
    private int cantidad;

    public Album(String titulo, String fecha, int likes) {
        super(titulo, fecha, likes);
    }

    public Album() {
        super();
    }
    
    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
    
    
}
