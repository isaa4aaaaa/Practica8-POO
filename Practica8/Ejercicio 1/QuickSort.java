package mx.unam.fi.poo.g1.p8;

/**
 * Clase QuickSort
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class QuickSort implements Ordenamiento {

    /**
     * Método sobrescrito ordenar con el cual se realizan las llamadas recursivas de Quick Sort.
     * @param arr -> Arreglo o sub-arreglo.
     * @param low -> Índice más a la izquiera del arreglo.
     * @param high -> Índice más a la derecha del arreglo.
     */
    @Override
    public void ordenar(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            ordenar(arr, low, pi-1);
            ordenar(arr, pi+1, high);
        }   
    }

    /**
     * Método con el cual se realiza la partición del arrego en sub-arreglos y se calcula el pivote.
     * @param arr -> Arreglo o sub-arreglo.
     * @param low -> Índice más a la izquiera del arreglo.
     * @param high -> Índice más a la derecha del arreglo.
     * @return i+1 -> Nuevo pivote.
     */
    public int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
}


