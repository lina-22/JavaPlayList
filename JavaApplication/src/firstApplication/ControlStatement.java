package firstApplication;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        System.out.println("Hello Control Statement");
        System.out.println("give a number:");
        Scanner input = new Scanner(System.in);

        int num;

        num = input.nextInt();

        System.out.println("This number given by customer :" +num);

        if(num<=1){
            System.out.println("Negative Number");
        }else if(num>1){
            System.out.println("Positive number");
        }else{
            System.out.println("Nothing inputed");
        }
    }
}
