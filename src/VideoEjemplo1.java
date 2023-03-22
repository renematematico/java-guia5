
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
public class VideoEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Creamos un vector en 2 lineas
        int[] vector;
        vector = new int[2];
        
    //podemos crear un vector en una sola linea
        int[] producto = new int[3];
        
    /*Creamos, declaramos e iniciamos una matriz con valores predeterminados.*/
        int[][] matriz = {{4,8,6},{2,1,7}};
        
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        Scanner leer=new Scanner(System.in);
        
        //int = 0 porque los subíndices de los arreglos en Java inician en 0
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"}=");
            //acceder al valor i del vector;
            vector[i]=leer.nextInt();
        }
    }
    
}
