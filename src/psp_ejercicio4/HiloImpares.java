/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class HiloImpares extends Thread {
    
    int suma=0;
    
    @Override
    public void run() {
        for (int i = 1; i < 1000; i+=2) {
            suma+=i;
            System.out.println("Impares: "+suma);
            
        }
    }
}
