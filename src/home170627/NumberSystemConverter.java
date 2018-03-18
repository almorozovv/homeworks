package home170627;

public class NumberSystemConverter {

    public static String toBinaryString(int x) {

        if (x == 0) {
            return "0";
        }

        StringBuilder tempResult = new StringBuilder();
        while (x != 0) {
            tempResult.append(x % 2);
            x = x / 2;
        }

        char[] charResult = tempResult.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = charResult.length - 1; i >= 0; i--) {
            result.append(charResult[i]);
        }
        return result.toString();
    }

    public static String toOctalString(int x) {
        if (x == 0) {
            return "0";
        }

        StringBuilder tempResult = new StringBuilder();
        while (x != 0) {
            tempResult.append(x % 8);
            x = x / 8;
        }

        char[] charResult = tempResult.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = charResult.length - 1; i >= 0; i--) {
            result.append(charResult[i]);
        }
        return result.toString();
    }

    public static String toHexString(int DecNumber) {
        if (DecNumber == 0) {
            return "0";
        }

        StringBuilder tempResult = new StringBuilder();
        while (DecNumber != 0) {
            int tempNumber = DecNumber % 16;
            if (tempNumber >= 10 && tempNumber <= 15) {
                tempNumber += 55;
                tempResult.append((char) tempNumber);
            } else {
                tempResult.append(tempNumber);
            }
            DecNumber = DecNumber / 16;
        }

        char[] charResult = tempResult.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = charResult.length - 1; i >= 0; i--) {
            result.append(charResult[i]);
        }
        return result.toString();
    }
}
