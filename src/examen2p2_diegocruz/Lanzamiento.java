/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Lanzamiento {
    
    private String titulo;
    private String fecha;
    private int likes;

    public Lanzamiento() {
    }

    
    
    public Lanzamiento(String titulo, String fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento: "+titulo;
    }
    
    
    
    
    
    
    
    
}
