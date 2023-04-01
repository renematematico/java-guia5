
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cuadrado[][] = new int[3][3];
        int diagP = 0,diagS=0, cont = 0, fila, columna = 0;
        boolean magico = false;

//Ingresamos los valores a la matriz
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.println("Ingrese número del 1 al 9 para la fila [" + i + "] columna [" + j + "]");
                cuadrado[i][j] = leer.nextInt();
            }
        }

//Mostramos la matriz
        mostrarMatriz(cuadrado);

//Realizamos la suma de la diagonal principal
        diagP = diagPrincipal(cuadrado);
//        for (int i = 0; i < cuadrado.length; i++) {
//            for (int j = 0; j < cuadrado.length; j++) {
//                if (i == j) {
//                    diagP = diagP + cuadrado[i][j];
//                }
//            }
//        }

        System.out.println("La suma de la diagonal principal " + diagP);
//Compruebo si la suma de cada fila coincide con la diagonal
        cont = 0;
        do {
            fila = sumaFilas(cuadrado, cont);
            cont += 1;
            if (fila == diagP) {
                magico = true;
            } else {
                magico = false;
            }
        } while (magico == true && cont < 3);

        System.out.println("La suma de las filas es " + fila);

        //Compruebo si las sumas de las columnas coinciden
        cont = 0;

        if (magico) {
            do {
                columna = sumaColumna(cuadrado, cont);
                cont += 1;

                if (columna == diagP) {
                    magico = true;
                } else {
                    magico = false;
                }

            } while (magico && cont < 3);

        }

        System.out.println("La suma de las columnas es " + columna);

        if (magico){
        diagS=diagSecun(cuadrado);
        }
        
        System.out.println("La suma de la diagonal secundaria es " + diagS);
        
        if(diagS==diagP){
            System.out.println("¡¡¡LA MATRIZ ES MÁGICA!!!");
        }else{
            System.out.println("¡¡¡La matriz NO ES MÁGICA!!!");}
    }

    ////////////SUMA FILAS/////////////
    public static int sumaFilas(int m[][], int i) {
        int sumarFila = 0;
        for (int j = 0; j < m.length; j++) {
            sumarFila = sumarFila + m[i][j];
        }
        return sumarFila;
    }

    ////////////SUMA COLUMNAS/////////////
    public static int sumaColumna(int m[][], int j) {
        int sumarColumna = 0;
        for (int i = 0; i < m.length; i++) {
            sumarColumna = sumarColumna + m[i][j];

        }
        return sumarColumna;
    }

    ////////////MOSTRAR MATRIZ/////////////
    public static void mostrarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }

    }

    ////////////DIAGONAL PRINCIPAL////////////
    public static int diagPrincipal(int m[][]) {
        int diagPrin = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    diagPrin = diagPrin + m[i][j];
                }
            }
        }
        return diagPrin;
    }
    
    ////////////DIAGONAL SECUNDARIA////////////
    public static int diagSecun(int m[][]){
        int diagSec=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(i+j==2){
                diagSec=diagSec+m[i][j];
                }
            }
        }
        
        return diagSec;
    }
}
