/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Cancion {
    
    private String titulo;
    private double duracion;
    private String reflanz;

    public Cancion(String titulo, double duracion, String reflanz) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.reflanz = reflanz;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getReflanz() {
        return reflanz;
    }

    public void setReflanz(String reflanz) {
        this.reflanz = reflanz;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
    
    
    
    
    
    
}
