package mx.unam.fi.poo.g1.p8;

/**
 * Clase MergeSort
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class MergeSort implements Ordenamiento{

    /**
     * Método sobrescrito ordenar en el que se realiza la recursividad.
     * @param arr
     * @param left
     * @param right
     */
    @Override
    public void ordenar(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            ordenar(arr, left, mid);
            ordenar(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /**
     * Método en el cual se separa el arreglo en sub-arreglos y eventuamente se vuelven a unir.
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    public void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

}

