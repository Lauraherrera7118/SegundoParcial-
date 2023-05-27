
package MetodoOrdenamiento;

import menuarreglo.Arreglo;

public class Insercion {
    public static void metodoInsercion(int arreglo[]){
        int j, aux;

        for (int p = 1; p < arreglo.length; p++) {
            aux = arreglo[p];
            j = p - 1;
            while ((j >= 0) && (aux < arreglo[j])) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
            Arreglo.impresion(arreglo);
        }
    }
}
