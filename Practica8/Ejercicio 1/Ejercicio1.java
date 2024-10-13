package mx.unam.fi.poo.g1.p8;

import java.util.Random;

/**
 * Clase principal de Ejercicio1
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Ejercicio1{

    /**
     * Método principal en el que se definen los objetos, arreglos y se mandan a llamar los ordenamientos.
     * @param args -> Arreglo del parámetro definido por defecto.
     */
    public static void main(String[] args) {

        Ordenamiento quick = new QuickSort();
        Ordenamiento merge = new MergeSort();

        int[] arr1 = new int[10]; 
        int[] arr2 = new int[10];

        llenarArreglo(arr1);
        llenarArreglo(arr2);

        System.out.println("Arreglos originales: ");
        System.out.print("Arreglo a: ");
        imprimirArreglo(arr1);
        System.out.print("Arreglo b: ");
        imprimirArreglo(arr2);

        System.out.println("Algoritmo QuickSort en arreglo a: ");
        quick.ordenar(arr1, 0, arr1.length-1);
        imprimirArreglo(arr1);

        System.out.println("Algoritmo MergeSort en arreglo b: ");
        merge.ordenar(arr2, 0, arr2.length-1);
        imprimirArreglo(arr2);

    }

    /**
     * Método para llenar aleatoriamente el arreglo con números entre 0 y 99
     * @param arr -> Arreglo a llenar.
     */
    public static void llenarArreglo(int[] arr){
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt(99)+1;
        }
        
    }

    /**
     * Método para realizar la impresión del arreglo.
     * @param arr -> Arreglo a imprimir.
     */
    public static void imprimirArreglo(int[] arr){
        for (int i : arr) {
            System.out.print("["+i+"] ");
        }
        System.out.println("");
    }
}

