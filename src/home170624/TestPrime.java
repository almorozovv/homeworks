package home170624;

import homettd.SimpleUnit;

public class TestPrime {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(2), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(31), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(1), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(10), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(-60), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(0), false));

        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(Integer.MIN_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(Integer.MAX_VALUE), true));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(2), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(1), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(-40), true));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(Integer.MIN_VALUE), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(Integer.MAX_VALUE), false));

    }
}
