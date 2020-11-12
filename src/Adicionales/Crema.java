/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Jorge
 */
public class Crema extends Aderezo{

    public Crema() {
        super("CREMA");
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
}
