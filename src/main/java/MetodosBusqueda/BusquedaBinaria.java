
package MetodosBusqueda;

public class BusquedaBinaria {
     public static int busquedaBinaria(int[] array, int buscado) {
        int izq = 0;
        int der = array.length - 1;

        while (izq <= der) {
            int mid = (izq + der) / 2;

            if (array[mid] == buscado) {
                return mid;
            } else if (array[mid] < buscado) {
                izq = mid + 1;
            } else {
                der = mid - 1;
            }
        }
        return -1;
    }
}
