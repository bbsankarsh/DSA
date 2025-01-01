package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n = {89, 45, 33, 90, 12};
        printArray(descSort(n));
    }

    private static int[] descSort(int[] n) {
        int length = n.length;
        int newLength = length;
        for (int i = 0; i < length-1; i++) {
            int smallest = n[i];
            for (int j = 0; j < newLength; j++) {
                if (n[i] < smallest) {
                    smallest = n[i];
                    break;
                }
            }
            int temp = smallest;
            n[i] = n[0];
            n[0] = temp;
            newLength--;
        }
        return n;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
