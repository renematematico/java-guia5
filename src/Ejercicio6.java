
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
        Scanner leer=new Scanner (System.in);
        int cuadrado [][]=new int[3][3];
        int diagP=0;
        boolean magico=true;
        
//Ingresamos los valorea a la matriz
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                do {
                    System.out.println("Ingrese número del 1 al 9 para la fila ["+i+"] columna ["+j+"]");
                    cuadrado[i][j]=leer.nextInt();
                    if(cuadrado[i][j]<1 || cuadrado[i][j]>9){
                        System.out.println("El número no es válido. Ingresar nuevamente.");
                    }
                } while (cuadrado[i][j]<1 || cuadrado[i][j]>9);
                
            }
        }
//Realizamos la suma dentro de diagonal
for (int i = 0; i < cuadrado.length; i++) {
    for (int j = 0; j < cuadrado.length; j++) {
        if(i==j){
        diagP=diagP+cuadrado[i][j];
        }
    }           
}
System.out.println("El valor de la diagonal es "+diagP);

//Comparamos las filas 1

}   
    public static int sumaFilas(int cuadrado[][],int i){
    int sumarFila=0;
        for (int j = 0; j < cuadrado.length; j++) {
            sumarFila= sumarFila + cuadrado[i][j];
            
        }
        return sumarFila;
    }
}