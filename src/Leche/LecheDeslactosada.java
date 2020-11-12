/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarPostre(Postre postre){
        // Lanzar error No se puede usar en pastel
        if(postre.getClass() == Pastel.class){
            throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
        }
        System.out.println("Usando leche deslactosada");
    }
        
}
