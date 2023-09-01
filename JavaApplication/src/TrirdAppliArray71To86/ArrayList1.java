package TrirdAppliArray71To86;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size "+number.size());
        //adding elemnts
        number.add(5);
        number.add(10);
        number.add(10);
        number.add(10);
        number.add(4,8);

        System.out.println(number);
        System.out.println("printing by iterator");
        System.out.println("Iterator");
        Iterator itr =number.iterator();
        while (itr.hasNext()){
            System.out.println("" + itr.next());
        }
        //System.out.println(number);
        System.out.println("Foreach");
        for (int x: number
             ) {
            System.out.println(" "+ x);
        }
        System.out.println("size "+number.size());

        number.remove(0);
        System.out.println("After removing o index");
        System.out.println(number);

        boolean check = number.isEmpty();
        System.out.println("ArrayList empty :"+check);

        boolean pos = number.contains(8);
        System.out.println("8 is in the list "+pos);
    }
}
