package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {89, 45, 33, 90, 12};
        descSort(arr);
        ascSort(arr);
        printArray(arr);
    }

    private static void descSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private static void ascSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
