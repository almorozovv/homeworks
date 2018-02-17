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
}
