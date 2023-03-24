
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Ejercicio3 {
    /*Recorrer un vector de N enteros contabilizando cuántos números son 
    de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //////////////VARIABLES///////////////
        int vector[],n,unaC=0,dosC=0,tresC=0;
        Scanner leer=new Scanner (System.in);        
        
        /////////////ALGORITMO//////////////
        System.out.println("Ingresar la dimensión del vector.");
        n=leer.nextInt();
        
        //Asignamos la dimensión al vector
        vector=new int[n];
        
        //Asignamos los valores al vector.
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*1000);
            if(vector[i]<10){
            unaC+=1; //Contamos los números de una cifra
            }else if(vector[i]<100){
            dosC+=1;//Contamos los números de dos cifras
            }else if(vector[i]<999){
            tresC+=1;//Contamos los números de tres cifras
            }
        }
//Mostramos la cantidad de números de cada tipo.                       
        System.out.println("Los números de una cifra son: "+unaC);
        System.out.println("Los números de dos cifras son: "+dosC);
        System.out.println("Los números de tres cifras son: "+tresC);
        System.out.println("");
//Controlamos que se hayan obtenido la cantidad de números esperados.        
        System.out.println("En total se sortearon "+ (unaC+dosC+tresC)+" números.");
    }
    
}
