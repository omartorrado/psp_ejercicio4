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
public class HiloPares extends Thread {
    
    int suma=0;
    

    @Override
    public void run() {
        for (int i = 2; i <= 1000; i+=2) {
            suma+=i;
            
            
        }System.out.println("Suma de los numeros pares: "+suma);

    }
}
