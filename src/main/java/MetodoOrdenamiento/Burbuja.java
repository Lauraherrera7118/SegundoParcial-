
package MetodoOrdenamiento;

import menuarreglo.Arreglo;

public class Burbuja {
    public static void metodoBurbuja(int arreglo[]){
        for(int i=0; i<arreglo.length-1; i++){
            for(int j=0; j<arreglo.length-i-1; j++){
                if(arreglo[j]>arreglo[j+1]){
                    int menor= arreglo[j+1];
                    arreglo[j+1]=arreglo[j];
                    arreglo[j]=menor;
                }
            }
            Arreglo.impresion(arreglo);
        }
        
    }
}
