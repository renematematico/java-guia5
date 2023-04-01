
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
public class ExtrasEjercicio3 {
    /*
    Crear una función rellene un vector con números aleatorios,
    pasándole un arreglo por parámetro. Después haremos otra 
    función o procedimiento que imprima el vector.
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /////////VARIABLES
        int n, vector[];
        Scanner leer=new Scanner(System.in);        
        
        //INGRESAMOS LA DIMENSIÓN DEL VECTOR
        System.out.println("Ingrese la dimensión del vector.");
        n=leer.nextInt();
        
        /*GUARDAMOS DENTRO DEL VECTOR el 
        retorno de la función llenarVector(n)*/
        vector = llenarVector(n);
        
        mostrarVector(vector,n);
        
        
    }
    
    ///////////FUNCIÓN QUE LLENA EL VECTOR CON NÚMEROS ALEATORIOS
    public static int[] llenarVector(int n){
        int v[]= new int[n];
        
        for (int i = 0; i < n; i++) {
            v[i]=(int)(Math.random()*10);
        }                
        return v;
    }
    ///////////FUNCIÓN QUE MUESTRA EL VECTOR
    public static void mostrarVector(int v[],int n){
        System.out.println("Los elementos del vector son:");
        System.out.print("Vector = {");
        for (int i = 0; i < n; i++) {
            System.out.print("["+v[i]+"]");            
        }
        System.out.print("}");
        System.out.println("");
    }
    
}
