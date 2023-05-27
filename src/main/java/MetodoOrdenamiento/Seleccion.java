
package MetodoOrdenamiento;

import menuarreglo.Arreglo;

public class Seleccion {
    public static void metodoSeleccion(int arreglo[]){
        int menor, tmp, pos = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            menor = arreglo[i];
            pos = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
            Arreglo.impresion(arreglo);
        }
    }
}
