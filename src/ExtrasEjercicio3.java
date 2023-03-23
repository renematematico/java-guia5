
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
        
        //Creamos la variable n que guarda la dimensión del vector
        int n;
        Scanner leer=new Scanner(System.in);        
        
        System.out.println("Ingrese la dimensión del vector.");
        n=leer.nextInt();
        
        /*Creamos un vector y dentro de el guardamos el 
        retorno de la función llenarVector(n)*/
        int vector[] = llenarVector(n);
        
        mostrarVector(vector,n);
        
        
    }
    
    public static int[] llenarVector(int n){
        int v[]= new int[n];
        
        for (int i = 0; i < n; i++) {
            v[i]=(int)(Math.random()*10);
        }                
        return v;
    }
    
    public static void mostrarVector(int v[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+v[i]+"]");            
        }
        System.out.println("");
    }
    
}
