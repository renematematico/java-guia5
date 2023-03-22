
import java.util.Random;
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
public class Ejercicio2 {
/*Realizar un algoritmo que llene un vector de tamaño N 
    con valores aleatorios y le pida al usuario un número 
    a buscar en el vector. El programa mostrará dónde se 
    encuentra el numero y si se encuentra repetido*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        Scanner leer=new Scanner (System.in);
        //Importamos la clase "Random"
        Random llenar = new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int vector[]=new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i]=llenar.nextInt(100);//Llena con números del 0 al 99
        }
        
        System.out.println("Ingrese el número que desee buscar en el vector");
        int num=leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            if(vector[i]==num){
                System.out.println("El número "+num+" se encuentra en la posición "+i);
                cont=cont+1;
            }
    }
        if (cont!=0){
        System.out.println("Se lo encontró "+cont+" veces.");
        }else{System.out.println("El número "+num+" no se encontró dentro del vector.");}
    
}
}
