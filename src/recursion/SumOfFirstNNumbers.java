package recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(10));
    }

    private static int sumOfFirstNNumbers(int n) {
        if (n==1){
            return 1;
        } else {
            return n + sumOfFirstNNumbers(n-1);
        }
    }
}
