
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
public class GuiaTeoriaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String equipo[]=new String[10];
         Scanner leer=new Scanner(System.in);
         System.out.println("Ingresar los nombres de tus compañeros.");
     
         for (int i = 0; i < 10; i++) {
             equipo[i]=leer.nextLine();            
        }
         
         for (int i = 0; i < 10; i++) {
             System.out.print("["+equipo[i]+"]");
        }
         System.out.println("");
         generarVector();
         
         
         
    }
    
    ////////////// -GENERANDO VECTOR Y DEVOLVIENDO //////////////
    public static int[] generarVector(){
    int [] vector = new int[6];
        for (int i = 0; i < 6; i++) {
            vector[i]=i*2;
        }
        
        return vector;
    
    }
}
