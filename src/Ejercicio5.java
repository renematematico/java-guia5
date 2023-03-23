
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Creamos e iniciamos las variables.
int n;
int matrizA[][];
int matrizB[][];
Scanner leer=new Scanner (System.in);

//Ingresamos la dimensión de la matriz
System.out.println("Ingresar la dimensión de la matriz");
n=leer.nextInt();

//Asignamos la dimensión a las matrices
matrizA=new int[n][n];
matrizB=new int[n][n];

//Ingresamos los valores de la matrizA
System.out.println("Ingresar los valores de la matriz");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    matrizA[i][j]=leer.nextInt();
    }
}

//Llenamos la matrizB como traspuesta de A y le cambio los signos
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matrizB[i][j]=-matrizA[j][i];
    }           
}
        System.out.println("Matriz A");
mostrarMatriz(matrizA,n);
        System.out.println("");
        System.out.println("Matriz B");
mostrarMatriz(matrizB,n);
}   

public static void mostrarMatriz(int v[][],int n){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("["+v[i][j]+"]");
        }
        System.out.println("");
    }
}
}
