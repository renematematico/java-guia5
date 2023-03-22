/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class GuiaTeoriaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Creamos un arreglo "Vector"
//Arreglo vector de dimensión 5 que solamente guarda enteros
        int arregloV[] = new int[5];
        
//Creamos un arreglo "Matriz". Tenemos [filas] y [columnas]
//Este arreglo Matríz tiene dimensión 5 filas y 4 columnas
//Solamente puede guardar cadenas de texto.
        String arregloM[][] = new String[5][4];
        
        //Asignaremos un valor al vector "arregloV[]"
        arregloV[0]=5;
        
        //Asignaremos un valor al vector "arregloM[][]"
        arregloM[0][0]="Cristian";
        
        ////////////////////////////////
//Asignación de valores a un Vector
        int vector[]=new int[5];        
        for (int i = 0; i < 5; i++) {
            vector[i]=i+3;            
        }
        
//Muestreo de vector
        for (int i = 0; i < 5; i++) {         
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");        
        System.out.println("");        
        

//Asignación de valores a una Matriz
        int matriz[][]=new int[3][3];        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=6;
            }
        }
//Muestreo de matriz
for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
    System.out.println("");        
}
    }
    
}
