
package menuarreglo;

import java.util.Random;

public class Arreglo {
    
    public static int[] llenado(int tamaño){
        Random random= new Random();
        int arreglo[]= new int[tamaño];
        for(int i=0; i<tamaño; i++){
            arreglo[i]=random.nextInt(100);
        }
        return arreglo;
    }
    
    public static void impresion(int arreglo[]){
        for(int i=0; i<arreglo.length; i++){
            System.out.print("\t"+arreglo[i]+" ");
        }
        System.out.println("");
    }
}

