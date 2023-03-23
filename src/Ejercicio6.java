
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
        int diagP=0,cont=0,fila,columna;
        boolean magico=false;
        
//Ingresamos los valorea a la matriz
for (int i = 0; i < cuadrado.length; i++) {
    for (int j = 0; j < cuadrado.length; j++) {
        System.out.println("Ingrese número del 1 al 9 para la fila ["+i+"] columna ["+j+"]");
        cuadrado[i][j]=leer.nextInt();
        }
        }
//Realizamos la suma de la diagonal principal
for (int i = 0; i < cuadrado.length; i++) {
    for (int j = 0; j < cuadrado.length; j++) {
        if(i==j){
        diagP=diagP+cuadrado[i][j];
        }
    }           
}
cont=0;
do {
    
    fila = sumaFilas(cuadrado,cont);
    cont+=1;
    if(fila==diagP){
        magico=true;
    }else{
        magico=false;
    }
    } while (magico==true && cont<3);

cont=0;
while(magico==true && cont<3){    
columna = sumaColumnas(cuadrado,cont);
    cont+=1;
    if(fila==diagP){
        magico=true;
    }else{
        magico=false;
    }
    }
while(magico==true){
if((cuadrado[0][2]+cuadrado[1][1]+cuadrado[2][0])==diagP){
    magico=true;
}else{
magico=false;}
}
     

}
    
    ////////////SUMA FILAS/////////////
    public static int sumaFilas(int m[][],int i){
    int sumarFila=0;
        for (int j = 0; j < m.length; j++) {
            sumarFila= sumarFila + m[i][j];
            
        }
        return sumarFila;
    }
    
    ////////////SUMA COLUMNAS/////////////
    public static int sumaColumnas(int m[][],int j){
    int sumarColumna=0;
        for (int i = 0; i < m.length; i++) {
            sumarColumna= sumarColumna + m[i][j];            
        }
        return sumarColumna;
    }
}