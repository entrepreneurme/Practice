package CollectionFramework;

import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
//        List<Integer> list = (List<Integer>) Arrays.asList(a);
        LinkedList linkedList = new LinkedList<>();
//        linkedList.addAll(a);
        Collections.addAll(linkedList,a);
        System.out.println(linkedList);
    }
}
