package recursion;

public class FirstNNumbers {

    public static void main(String[] args) {
        printFirstNNumbers(5);
    }

    private static void printFirstNNumbers(int n) {
        if (n > 0) {
            printFirstNNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}