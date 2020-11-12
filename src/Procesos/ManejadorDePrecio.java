/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author Jorge
 */
public class ManejadorDePrecio {
    static double aumento = 0.50;
    final static double IVA = 0.12;
    
    public static double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*IVA))+(postre.getAderezos().size()*aumento);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }
}
