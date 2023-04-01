
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
public class ExtrasEjercicio1 {
/*Realizar un algoritmo que calcule la suma de todos los elementos 
    de un vector de tamaño N, con los valores ingresados por el usuario.
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///////////VARIABLES
        Scanner leer=new Scanner(System.in);
        int n,suma=0;
               
        ///////////MENSAJE AL USUARIO
        System.out.println("Ingresar el tamaño del vector");
        n= leer.nextInt();
        
        ///////////ASIGNAMOS LA DIMENSIÓN DEL VECTOR
        int vector[]= new int[n];
        
        ///////////MENSAJE AL USUARIO
        System.out.println("Ingresar los números para llenar el vector.");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar el elemento Nº"+(n-i));
            vector[i]= leer.nextInt();
            suma+=vector[i];
        }
        
        ///////////MOSTRAMOS EL VECTOR AL USUARIO
        System.out.println("Los valores del vector son: ");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        ///////////MOSTRAMOS LA SUMA AL USUARIO
        System.out.println("");
        System.out.println("La suma de los elementos es "+suma);
    }
    
}
