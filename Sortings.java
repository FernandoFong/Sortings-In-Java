import java.util.Queue;

public class Sortings {

    private static <T extends Comparable<T>> void swap(T [] arr, int i, int j) {
	if(i > j) {
	    swap(arr, j, i);
	    return;
	}
	if(i < 0 || j >= arr.length) {
	    return;
	}
	T aux = arr[i];
	arr[i] = arr[j];
	arr[j] = aux;
    }

    private static void swap(int [] arr, int i, int j) {
	if(i > j) {
	    swap(arr, j, i);
	    return;
	}
	if(i < 0 || j >= arr.length) {
	    return;
	}
	int aux = arr[i];
	arr[i] = arr[j];
	arr[j] = aux;
    }

    public static <T extends Comparable<T>> void quickSort(T [] arr) {
	
    }

    public static <T extends Comparable<T>> void mergeSort(T [] arr) {
	
    }

    public static <T extends Comparable<T>> void bubbleSort(T [] arr) {
	boolean swapped = false;
	do {
	    for(int i = 0; i < arr.length-1; i++) {
		if(arr[i].compareTo(arr[i+1]) > 0) {
		    swap(arr, i, i+1);
		    swapped = true;
		}
	    }
	} while(swapped);
    }

    public static <T extends Comparable<T>> void shellSort(T [] arr) {
	for(int i = 0; i < arr.length; i++)
	    for(int j = 0; j < arr.length; j++)
		if(arr[i].compareTo(arr[j]) > 0)
		    swap(arr, i, j);
    }

    
    public static <T extends Comparable<T>> void insertionSort(T [] arr) {
	/**
	 * Marcar el primer elemento como ordenado.
	 * Desde el segundo elemento hasta el final, 
	 */
    }
    
    public static <T extends Comparable<T>> void selectionSort(T [] arr) {

    }

    public static void countingSort(int [] arr) {

    }

    public static void radixSort(int [] arr) {

    }
}
