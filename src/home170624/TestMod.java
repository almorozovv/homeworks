package home170624;

import homettd.MathUtils;
import homettd.Asserts;

public class TestMod {
    public static void main(String[] args) {

        System.out.println(Asserts.assertEquals(MathUtils.mod(10, 5), 0));
        System.out.println(Asserts.assertNotEquals(MathUtils.mod(10, 5), 1));

        System.out.println(Asserts.assertEquals(MathUtils.mod(10, 3), 1));
        System.out.println(Asserts.assertNotEquals(MathUtils.mod(10, 7), 0));

        System.out.println(Asserts.assertEquals(MathUtils.mod(Integer.MAX_VALUE, 1), 0));

        System.out.println(Asserts.assertNotEquals(MathUtils.mod(Integer.MIN_VALUE, 24321), 0));

        System.out.println(Asserts.assertEquals(MathUtils.mod(78, 33), 12));


    }
}
