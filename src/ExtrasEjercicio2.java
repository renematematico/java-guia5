
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
public class ExtrasEjercicio2 {

    /*Escriba un programa que averigüe si dos vectores de N 
    enteros son iguales (la comparación deberá detenerse en 
    cuanto se detecte alguna diferencia entre los elementos).
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///////DEFINIMOS VARIABLES
        Scanner leer = new Scanner(System.in);
        int n;
        boolean iguales = true;

        ///////MENSAJE AL USUARIO
        System.out.println("Ingresar el tamaño del vectorA");
        n = leer.nextInt();
        int vectorA[] = new int[n];
        int vectorB[] = new int[n];

        ///////MENSAJE AL USUARIO
        System.out.println("Ingresar los números para llenar el vectorA.");
        for (int i = 0; i < n; i++) {
            vectorA[i] = leer.nextInt();
        }
        ///////MENSAJE AL USUARIO
        System.out.println("Ingresar los números para llenar el vectorB.");
        for (int i = 0; i < n; i++) {
            vectorB[i] = leer.nextInt();
        }

        ///////COMPARAMOS VECTORES
        for (int i = 0; i < n; i++) {
            if (vectorA[i] == vectorB[i]) {
                iguales = true;
            } else {
                iguales = false;

                break;
            }
        }

        ///////MENSAJE AL USUARIO
        if (iguales == true) {
            System.out.println("========================");
            System.out.println("Los vectores SON IGUALES");
            System.out.println("========================");
        } else {
            System.out.println("===========================");
            System.out.println("Los vectores NO son iguales");
            System.out.println("===========================");
        }
        
///////MOSTRAMOS LOS VECTORES AL USUARIO
        System.out.println("Los valores del vectorA son: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("");
        System.out.println("Los valores del vectorB son: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("");
    }

}
