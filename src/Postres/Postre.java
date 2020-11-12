/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;   
    }
    public void anadirAderezoPostre(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezoPostre(Aderezo aderezo){
        aderezos.remove(aderezo);
    }



}
