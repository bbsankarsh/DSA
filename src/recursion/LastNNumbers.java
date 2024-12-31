package recursion;

public class LastNNumbers {
    public static void main(String[] args) {
        lastNNumbers(10);
    }

    private static void lastNNumbers(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            lastNNumbers(n-1);
        }
    }
}
