/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMasukkan angka yang akan di-sort (pisahkan dengan spasi): ");
        String input = scanner.nextLine();
        String[] inputString = input.split(" ");
        int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();

        System.out.println("Bubble Sort:");
        bubbleSort(array.clone());

        System.out.println("\nQuick Sort:");
        quickSort(array.clone(), 0, array.length - 1);

        System.out.println("\nInsertion Sort:");
        insertionSort(array.clone());

        System.out.println("\nSelection Sort:");
        selectionSort(array.clone());

        System.out.println("\nMerge Sort:");
        mergeSort(array.clone(), 0, array.length - 1);

        scanner.close();
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    printArray(arr);
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            printArray(arr);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                printArray(arr);
            }
        }
        swap(arr, i + 1, high);
        printArray(arr);
        return i + 1;
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }
            arr[j + 1] = key;
            printArray(arr);
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, minIdx, i);
            printArray(arr);
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            printArray(arr);
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            printArray(arr);
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            printArray(arr);
        }
    }

    // Utility method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility method to print the array
    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}