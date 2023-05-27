
package MetodoOrdenamiento;

import menuarreglo.Arreglo;

public class Quicksort {
    public static void metodoQuicksort(int arreglo[], int izq, int der) {

        int pivote = arreglo[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (arreglo[i] <= pivote && i < j) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }

        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;

        if (izq < j - 1) {
            Quicksort.metodoQuicksort(arreglo, izq, j - 1);
        }
        if (j + 1 < der) {
            Quicksort.metodoQuicksort(arreglo, j + 1, der);
        }
        Arreglo.impresion(arreglo);
    }
    
}
