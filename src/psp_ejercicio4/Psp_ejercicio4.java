/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio4;

/**
 *
 * @author otorradomiguez
 */
public class Psp_ejercicio4 {
    public static HiloPares p = new HiloPares();
    public static HiloImpares i = new HiloImpares();
    public static HiloAcabadosDosTres dosTres = new HiloAcabadosDosTres();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        p.start();
        i.start();
        dosTres.start();
    }
    
}
