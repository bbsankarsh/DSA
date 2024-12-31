package basic.math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Divisors {
    public static void main(String[] args) {
        System.out.println(divisors(36));
        System.out.println(sumOfAllDivisors(36));
    }

    private static List<Integer> divisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n%i == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    private static int sumOfAllDivisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n%i == 0)
                .sum();
    }
}
