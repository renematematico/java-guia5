/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Ejercicio4 {
    /*Realizar un programa que rellene un matriz de 4 x 4 de valores 
    aleatorios y muestre la traspuesta de la matriz. La matriz 
    traspuesta de una matriz A se denota por B y se obtiene 
    cambiando sus filas por columnas (o viceversa).*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Creamos e iniciamos la matriz.
        int matrizA[][]=new int[4][4];
        int matrizB[][]=new int[4][4];
        
//Llenamos la matriz con valores aleatorios.        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j]=(int) (Math.random()*10);
            }            
        }
//Imprimimos la matriz         
        for (int i = 0; i < 4; i++) {             
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matrizA[i][j]+"]");
            }            
        System.out.println("");            
        }
        
//Asignamos los valores a la matriz traspuesta
 for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
            }            
        }
 
        System.out.println("------------------");
        System.out.println("La matriz traspuesta es:");
        System.out.println("");
//Imprimimos la matriz         
        for (int i = 0; i < 4; i++) {             
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matrizB[i][j]+"]");
            }            
        System.out.println("");            
        }   
    }
    
}
