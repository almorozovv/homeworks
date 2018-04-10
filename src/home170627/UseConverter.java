package home170627;

public class UseConverter {

    public static void main(String[] args) {
        //KInteger.toBinaryString(11);
        System.out.println(NumberSystemConverter.toBinaryString(11));
        System.out.println(NumberSystemConverter.toBinaryString(52));
        System.out.println(NumberSystemConverter.toBinaryString(769));

        System.out.println(NumberSystemConverter.toOctalString(122));
        System.out.println(NumberSystemConverter.toOctalString(345));
        System.out.println(NumberSystemConverter.toOctalString(133));

        System.out.println(NumberSystemConverter.toHexString(500));
        System.out.println(NumberSystemConverter.toHexString(434));
        System.out.println(NumberSystemConverter.toHexString(984));
    }
}
