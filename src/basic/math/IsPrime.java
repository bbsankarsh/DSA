package basic.math;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    private static boolean isPrime(int n) {
        int count = 0;
        if (n==1) return false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == 3) {
                    return false;
                }
            }
        }
        return true;
    }
}
