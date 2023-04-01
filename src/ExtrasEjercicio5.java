
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
public class ExtrasEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///////CREAMOS VARIABLES Y MATRICES

        int matriz[][], f, c;

        Scanner leer = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Ingresar la cantidad de filas");
        f = leer.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Ingresar la cantidad de columnas");
        c = leer.nextInt();

        matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("----------------------");
        System.out.println("La matriz generada es:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
