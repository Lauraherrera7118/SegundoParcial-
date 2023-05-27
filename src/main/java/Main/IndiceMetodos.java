package Main;

import MetodoOrdenamiento.Burbuja;
import MetodoOrdenamiento.Insercion;
import MetodoOrdenamiento.Quicksort;
import MetodoOrdenamiento.Seleccion;
import MetodoOrdenamiento.Shell;
import MetodosBusqueda.BusquedaBinaria;
import MetodosBusqueda.BusquedaSecuencial;
import java.util.Scanner;
import menuarreglo.Arreglo;

public class IndiceMetodos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 1;

        System.out.println(" -------- Bienvenido");

        while (menu == 1) {
            System.out.println("¿De que tamaño desea el arreglo?");
            int tamaño = scan.nextInt();
            int arreglo[] = Arreglo.llenado(tamaño);
            Arreglo.impresion(arreglo);
            System.out.println("¿Desea buscar u ordenar el arreglo?");
            System.out.println("Ingrese 1 para buscar y 2 para ordenar o 3 para salir");
            int entrada = scan.nextInt();
            switch (entrada) {
                case 1:
                    System.out.println("¿Que número desea buscar");
                    int buscado = scan.nextInt();

                    System.out.println("¿Que método desea utilizar?");
                    System.out.println("1 -- Búsqueda binaria");
                    System.out.println("2 -- Búsqueda secuencial");
                    int eleccion = scan.nextInt();

                    switch (eleccion) {
                        case 1:

                            int posicion = BusquedaBinaria.busquedaBinaria(arreglo, buscado);
                            if (posicion != -1) {
                                System.out.println("Encontrado en: " + posicion);
                            } else {
                                System.out.println("El dato no se encuentra en el arreglo");
                            }
                            break;

                        case 2:
                            int pos = BusquedaSecuencial.busquedaSecuencial(arreglo, buscado);
                            if (pos != -1) {
                                System.out.println("Encontrado en: " + pos);
                            } else {
                                System.out.println("El dato no se encuentra en el arreglo");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("¿Qué método desea usar?");
                    System.out.println("1 -- Burbuja");
                    System.out.println("2 -- Selección");
                    System.out.println("3 -- Inserción");
                    System.out.println("4 -- Shell");
                    System.out.println("5 -- Quicksort");
                    int met = scan.nextInt();

                    switch (met) {
                        case 1:
                            Burbuja.metodoBurbuja(arreglo);
                            break;

                        case 2:
                            Seleccion.metodoSeleccion(arreglo);
                            break;

                        case 3:
                            Insercion.metodoInsercion(arreglo);
                            break;

                        case 4:
                            Shell.metodoShell(arreglo);
                            break;

                        case 5:
                            int izq = 0,
                             der = arreglo.length - 1;
                            Quicksort.metodoQuicksort(arreglo, izq, der);
                            break;
                    }

            }
            System.out.println("¿Desea volver al menu principal?");
            System.out.println("1. Si         Otro. Salir");
            menu = scan.nextInt();
        }
    }
}
