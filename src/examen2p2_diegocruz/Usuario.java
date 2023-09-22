/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Usuario {
    
    
    
    private String uname, passw;
    private int edad;

    public Usuario() {
    }
    
    

    public Usuario(String uname, String passw, int edad) {
        this.uname = uname;
        this.passw = passw;
        this.edad = edad;
    }
    
    

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "uname=" + uname + ", passw=" + passw + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
