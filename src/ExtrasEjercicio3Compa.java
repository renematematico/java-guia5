
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
public class ExtrasEjercicio3Compa {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = input.nextInt();
        int[] vector = llenarVector(tamaño);
        mostrarVector(vector, tamaño);
    }
    
    public static int[] llenarVector(int tamaño) {
        
        int[] vector = new int[tamaño];
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            vector[i] = rand.nextInt(100);
        }
        return vector;
    }
    
     public static void mostrarVector(int [] vector, int tamaño) {
        
      for (int i = 0; i < tamaño; i++) {
           System.out.print(" [" + vector [i] + "]");
        }
         System.out.println(" ");
     }
}

