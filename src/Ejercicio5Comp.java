
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
public class Ejercicio5Comp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA;
        int[][] matrizB;
        boolean esAntisimetrica = false;
        int i, j;
        
        System.out.println("Ingrese el numero de filas de la matriz (i)");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz (j)");
        int num2 = sc.nextInt();

        matrizA = new int[num1][num2];
        matrizB = new int[num1][num2];
        
        
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizA[i][j] = sc.nextInt();
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        for (j = 0; j < matrizB.length; j++) {
            for (i = 0; i < matrizB.length; i++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        System.out.println("Matriz Original");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        System.out.println("Matriz Transpuesta");
        
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB.length; j++) {
                System.out.print("[" + matrizB[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == -matrizB[j][i]) {
                    esAntisimetrica = true;
                    break;
                }
            }

        }

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }

    }
    
}
