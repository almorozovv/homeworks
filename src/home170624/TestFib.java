package home170624;

import homettd.MathUtils;
import homettd.SimpleUnit;

public class TestFib {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(5), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(144), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(233), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(610), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(987), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(17711), true));


        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(7), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(51), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(44), false));

        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(Integer.MIN_VALUE), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(Integer.MIN_VALUE), true));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(1), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(-434), true));
    }
}
