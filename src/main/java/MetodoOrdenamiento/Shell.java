
package MetodoOrdenamiento;

import menuarreglo.Arreglo;

public class Shell {
    public static void metodoShell(int arreglo[]){
        int aux;
        boolean cambios;
        
        for (int salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                      
                cambios = false;
                for (int i = salto; i < arreglo.length; i++){
                    if (arreglo[i - salto] > arreglo[i]){
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;              
                    }
                }
            }
            Arreglo.impresion(arreglo);
        }
    }
}
