
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
       int matriz [][],filas,columnas,n;
       n=3;
              
       System.out.println("- - - MATRIZ MÁGICA - - -");
        System.out.println("");
        matriz=new int[n][n];
        filas=n;
        columnas=n;

//Rellenamos la matriz
        rellenarMatriz(matriz,filas,columnas);

//Mostramos la matriz
        mostrarMatriz(matriz);

//Hacemos la prueba de MATRIZ MÁGICA
matrizMagica(matriz,filas,columnas);

}

///////////// RELLENAR MATRIZ //////////////
public static void rellenarMatriz(int m[][],int f,int c){
    Scanner leer=new Scanner (System.in);
        
    System.out.println("Ingresar números del 1 al 9 \n para rellenar la matriz");
    for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
            do {
                System.out.println("Elemento de la fila ["+(i+1)+"] columna ["+(j+1)+"]");
                m[i][j]=leer.nextInt();
            } while (m[i][j]<0 && m[i][j]>9);              
        }
    }
}
    
//////////// MOSTRAR MATRIZ /////////////
public static void mostrarMatriz(int m[][]){
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }    
    }
    
//////////// MATRIZ MÁGICA /////////////
public static void matrizMagica(int m[][],int f, int c){
int num=0,sc=0,sf=0,ssd=0;
boolean prueba=true,pruebaSuma=false;

//Sumamos los elementos de la diagonal principal y lo guardamos en "num"
    for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
            if(i==j){
            num=num+m[i][j];
            }
        }
    } System.out.println("Suma de diagonal Principal "+num);

    for (int i = 0; i < f; i++) {
        sf=0;
        //Suma los elementos de toda la fila
        for (int j = 0; j < c; j++) {
            sf=sf+m[i][j];
        }
//Si la suma de cada fila coincide con "num" mantiene verdadero a prueba.
        if(sf==num){
        prueba=true;
        }else{// Si alguna fila no suma lo mismo que "num" hace falsa la variable prueba.
        prueba=false;}
    } System.out.println("Suma de filas = "+sf);
    
    if(prueba){//Si la variable prueba es verdadera, sale del bucle anterior entra en este condicional.
        for (int i = 0; i < f; i++) {
            sc=0;
            for (int j = 0; j < c; j++) {
                sc=sc+m[j][i];
            }}}
//Si la suma de cada columna coincide con "num" mantiene verdadero a prueba.
        if(sc==num){
        prueba=true;
        }else{// Si alguna columna no suma lo mismo que "num" hace falsa la variable prueba.
        prueba=false;}
        System.out.println("Suma de columnas = "+sc);
        
//Si la prueba de las columnas se mantiene verdadera pasamos a este condicional.
if(prueba){
    for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
            if((i+j)==c-1){
            ssd=ssd+m[i][j];
            }
        }
        if(ssd==num){
        prueba=true;
        }else{
        prueba=false; //Si la suma de la diagonal no coincide con la principal sale del bucle
        }
    }
}System.out.println("Suma de segunda diagonal = "+ssd);

if(prueba){
    System.out.println("=============================");
    System.out.println("La matriz ingresada ES MAGICA");
    System.out.println("=============================");
}else{
    System.out.println("================================");
    System.out.println("La matriz ingresada NO ES MAGICA");
    System.out.println("================================");
}
        


}
}
    


