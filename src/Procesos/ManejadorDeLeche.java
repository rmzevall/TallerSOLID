/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    
    public void cambiarTipoLeche(LecheEntera leche, Postre postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
        System.out.println(postre.getClass());
        System.out.println(Pastel.class);
        if(postre.getClass() == Pastel.class){
           System.out.println("No se puede usar leche deslactosada en los pasteles, se pondra leche descremada");
           LecheDescremada le = new LecheDescremada();
           le.usarPostre(postre);
        }else{
            leche.usarPostre(postre);
        }
    }
    
}
