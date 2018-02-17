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
}
