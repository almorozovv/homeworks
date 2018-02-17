package home170624;

import homettd.SimpleUnit;

public class TestSign {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(5), 1) );
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(5), -1) );

        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(-5), -1) );
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-5), 1) );


        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(0), 0) );
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(0), 1) );


        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1) );
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(Integer.MAX_VALUE), -1) );
    }
}
