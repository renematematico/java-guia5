/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[]=new int[100];
        
        for (int i = 0; i < vector.length ; i++) {
            vector[i]=100-i;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");        
    }
    
}
