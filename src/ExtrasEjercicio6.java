
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
public class ExtrasEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /////////MATRICES Y VARIABLES
        String matriz[][] = new String[20][20];
        String palabra1, palabra2, palabra3, palabra4, palabra5;
        int cont[] = new int[1];
        cont[0] = 1;
        Scanner leer = new Scanner(System.in);

        ////////INGRESAMOS LAS PALABRAS USANDO UN SUBPROGRAMA QUE LAS VERIFICA
        ////////LUEGO LAS CONVERTIMOS TODAS A MAYÚSCULAS
        System.out.println("Ingresar 5 palabras para la sopa de letras");
        palabra1 = ingresarPalabra(cont).toUpperCase();
        palabra2 = ingresarPalabra(cont).toUpperCase();
        palabra3 = ingresarPalabra(cont).toUpperCase();
        palabra4 = ingresarPalabra(cont).toUpperCase();
        palabra5 = ingresarPalabra(cont).toUpperCase();

        /////////MOSTRAMOS LAS PALABRAS INGRESADAS
        System.out.println("Las palabras ingresadas son:");
        System.out.println(palabra1 + ", " + palabra2 + ", " + palabra3 + ", " + palabra4 + ", " + palabra5);

        ////////INICIAMOS MATRIZ
        matriz = iniciarMatriz(matriz);

        ////GRABAMOS LAS PALABRAS EN LA MATRIZ
        grabarPalabra(palabra1, matriz);
        grabarPalabra(palabra2, matriz);
        grabarPalabra(palabra3, matriz);
        grabarPalabra(palabra4, matriz);
        grabarPalabra(palabra5, matriz);

        ////////RELLENAMOS MATRIZ
        matriz = rellenarMatriz(matriz);

        //////MOSTRAMOS LA MATRIZ
        imprimirMatriz(matriz);

    }

    /**
     * SUBPROGRAMA INGRESAR PALABRA Hace la prueba si la palabra ingresada
     * cumple con las condiciones pedidas, en caso de no hacerlo vuelve a
     * pedirla sin modificar el contador. Se utiliza un arreglo de dimensión 1
     * para poder llevar información al main.
     *
     * @param c
     * @return = Palabra ingresada que cumple las condiciones
     */
    public static String ingresarPalabra(int c[]) {
        String palabra = "";
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("-----------------------------------");
            System.out.println("Ingresar palabra Nº" + c[0]);
            System.out.println("Debe tener como mínimo 3 caracteres");
            System.out.println("y como máximo 5 caracteres.");
            palabra = leer.next();
            if (palabra.length() >= 3 && palabra.length() <= 5) {
                c[0]++;
            }
        } while (palabra.length() < 3 || palabra.length() > 5);

        return palabra;
    }

    /**
     * INICIAMOS LA MATRIZ CON VALORES ESPECÍFICOS
     *
     * @param m
     * @return
     */
    public static String[][] iniciarMatriz(String m[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                m[i][j] = "";
                // m[i][j] = Integer.toString((int) (Math.random() * 10));
            }
        }
        return m;
    }

    /**
     * GRABAMOS LAS PALABRAS DENTRO DE LA MATRIZ
     *
     * @param p
     * @param m
     */
    public static void grabarPalabra(String p, String m[][]) {
        int f, c;
        f = (int) (Math.random() * 20);
        c = (int) (Math.random() * 15);
        if (m[f][0] == "") {
            for (int j = 0; j < p.length(); j++) {
                m[f][c + j] = p.substring(j, j + 1);
            }
        }
    }

    /**
     * RELLENAMOS LA MATRIZ CON NÚMEROS ALEATORIOS
     *
     * @param m
     * @return
     */
    public static String[][] rellenarMatriz(String m[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (m[i][j] == "") {
                    m[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
        return m;
    }

    /**
     * MOSTRAMOS LA MATRIZ GENERADA
     *
     * @param m
     */
    public static void imprimirMatriz(String m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }

}
