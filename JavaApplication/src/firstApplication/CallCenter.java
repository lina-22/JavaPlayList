package firstApplication;

import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        System.out.println("Call Center");

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number 1 until 4");

        //input.nextInt();
        int option = input.nextInt();

        switch(option){
            case 1 :
                System.out.println("Selected language is Bengali");
                break;
            case 2 :
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.out.println("Selected language is Urdu");
                break;
            case 4:
                System.out.println("Selected language is English");
                break;

        }
    }
}
