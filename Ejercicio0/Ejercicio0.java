package mx.unam.fi.poo.g1.p8;

public class Ejercicio0{
    public static void main(String[] args) {
        int[] arr = {
            4, 2, 0, 3, 1, 6, 8
        };

        int[] arr1 = {
            6, 7, 3, 8, 4, 1, 5
        };

        System.out.println("Arreglo original:");
        imprime(arr);
        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        System.out.println("Arreglo ordenado con Bubble Sort.");
        imprime(arr);

        System.out.println("Arreglo original:");
        imprime(arr1);
        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr1);
        System.out.println("Arreglo ordenado con Selecion Sort.");
        imprime(arr1);
    }

    public static void imprime(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


