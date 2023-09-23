/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author dfcm9
 */
public class ThreadCanc extends Thread{
    
    private int duracion;
    private JProgressBar pisci;
    private boolean avanzar;
    private boolean vive;

    public ThreadCanc(JProgressBar pisci, int duracion) {
        this.duracion = duracion;
        this.pisci = pisci;
        avanzar = true;
        vive = true;
        this.pisci.setMaximum(duracion);
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            
            pisci.setValue(pisci.getValue()+1);
            if (pisci.getValue()==duracion){
                JOptionPane.showMessageDialog(null, "La cancion termino.");
                vive = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
    
}
