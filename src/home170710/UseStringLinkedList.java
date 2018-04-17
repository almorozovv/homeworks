package home170710;

import java.util.LinkedList;

public class UseStringLinkedList {

    public static void main(String[] args) {

        StringLinkedList list = new StringLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");


        System.out.println(list);
//        System.out.println(list.remove(0));

//        System.out.println(list.remove("two"));
//
//        System.out.println(list);
//
//        list = new StringLinkedList();
//
//        System.out.println(list.remove("two"));
//
//        list.add("One");
//        System.out.println(list.remove("two"));
//        System.out.println(list.remove("One"));
//
        System.out.println(list.remove(2));
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
    }

}
