package home170707;

import java.util.ArrayList;

public class UseStringArrayList {

    public static void main(String[] args) {

        StringArrayList array = new StringArrayList();
        StringArrayList array2 = new StringArrayList();
        ArrayList<String> array3 = new ArrayList<>();

        array.add("V");
        array.add("B");
        array.add("CA");
        array.add("V");
        array.add("B");
        array.add("C");

        array3.add("V");
        array3.add("B");
        array3.add("CA");
        array3.add("V");
        array3.add("B");
        array3.add("C");

        System.out.println(array.toString());
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        array.set(0, "FF");
        System.out.println(array.toString());
        System.out.println(array.size());
        array.size();
        System.out.println(array.isEmpty());
        System.out.println(array2.isEmpty());

        System.out.println("----------------------");
        System.out.println(array.remove("CA"));
        System.out.println(array3.remove("CA"));

        System.out.println(array.toString());
        System.out.println(array3.toString());

    }
}
