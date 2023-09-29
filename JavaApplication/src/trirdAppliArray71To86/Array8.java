package trirdAppliArray71To86;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int [] number = {10,-3,18,5,25};
        Arrays.sort(number);


        System.out.println("***************");
        for (int i = 0; i <5 ; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();

        System.out.println("Decending");
        for (int i = 4; i >=0 ; i--) {
            System.out.print(" "+number[i]);
        }
    }
}
