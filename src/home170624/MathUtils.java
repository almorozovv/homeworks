package home170624;

public class MathUtils {
    public static int sign(int i) {
        int result = 0;
        if (i > 0) {
            result = 1;
        }
        if (i < 0) {
            result = -1;
        }
        return result;
    }

    public static int mod(int i, int j) {
        int result = 0;
        int divResult = i / j;
        int multResult = j * divResult;

        if (i == multResult) {
            result = 0;
        }
        if (i != multResult) {
            result = i - (j * divResult);
        }
        return result;
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if (n < 2)
            result = false;
        for (int a = 2; a <= n / 2; a++) {
            if (n % a == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isFibonacci(int i) {
        int n;
        int first_fib = 0;
        int second_fib = 1;
        boolean result = false;

        for ( int j = 0; j <= i; j++) {
            n = first_fib + second_fib;
            first_fib = second_fib;
            second_fib = n;
            if (n == i) {
                result = true;
            }
        } return result;
    }
}
