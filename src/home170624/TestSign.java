package home170624;

import homettd.MathUtils;
import homettd.Asserts;

public class TestSign {

    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(MathUtils.sign(5), 1) );
        System.out.println(Asserts.assertNotEquals(MathUtils.sign(5), -1) );

        System.out.println(Asserts.assertEquals(MathUtils.sign(-5), -1) );
        System.out.println(Asserts.assertNotEquals(MathUtils.sign(-5), 1) );


        System.out.println(Asserts.assertEquals(MathUtils.sign(0), 0) );
        System.out.println(Asserts.assertNotEquals(MathUtils.sign(0), 1) );


        System.out.println(Asserts.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1) );
        System.out.println(Asserts.assertNotEquals(MathUtils.sign(Integer.MAX_VALUE), -1) );


    }
}
