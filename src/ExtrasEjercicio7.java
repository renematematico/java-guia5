
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
public class ExtrasEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////////VARIABLES Y VECTORES
        int vector[], n;
        Scanner leer = new Scanner(System.in);

        ///////MENSAJE PARA EL USUARIO
        System.out.println("Ingresar la dimensión del vector");
        n = leer.nextInt();

        vector = new int[n];

        vector = rellenarVector(vector);

        mostrarVector(vector);

    }

    ///////////RELLENAR VECTOR
    public static int[] rellenarVector(int v[]) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < v.length; i++) {
            
            v[i] = c;
            
            a = b;
            b = c;
            c = a + b;
        }

        return v;
    }

    public static void mostrarVector(int v[]) {
        System.out.print("El vector es V= { ");
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
        System.out.print(" }");
        System.out.println("");
    }

}
