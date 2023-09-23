/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Single extends Lanzamiento {

    
    
    private Cancion canc;

    public Single(Cancion canc, String titulo, String fecha) {
        super(titulo, fecha);
        this.canc = canc;
    }

    public Single(String titulo, String fecha) {
        super(titulo, fecha);
    }
    
    
    
    

    public Cancion getCanc() {
        return canc;
    }

    public void setCanc(Cancion canc) {
        this.canc = canc;
    }

    @Override
    public String toString() {
        return "Single: "+super.getTitulo();
    }
    
    
    
    
    
    
}
