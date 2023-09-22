/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegocruz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author dfcm9
 */
public class AdminListaRep {
    
    private ArrayList <ListaRep> listasrep = new ArrayList();
    private File archivo = null;

    public AdminListaRep(String path) {
        archivo = new File(path);
    }

    public ArrayList<ListaRep> getListasrep() {
        return listasrep;
    }

    public void setListasrep(ArrayList<ListaRep> listasreo) {
        this.listasrep = listasreo;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setListaRep(ListaRep x){
        listasrep.add(x);
    }

    public void cargarArchivo() {
        try {            
            listasrep= new ArrayList();
            ListaRep temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ListaRep) objeto.readObject()) != null) {
                        listasrep.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ListaRep t : listasrep) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    @Override
    public String toString() {
        return listasrep.toString();
    }
    
}
