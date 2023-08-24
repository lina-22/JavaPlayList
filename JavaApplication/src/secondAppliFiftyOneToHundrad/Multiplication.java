package secondAppliFiftyOneToHundrad;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        System.out.println("Multiplication Table");

        Scanner input = new Scanner(System.in);


        //int num = 5;
        System.out.println("Enter a number");

        int num =input.nextInt();

        System.out.println("multiplication of "+num+" is :" );
        for (int i =1; i<=10; i++){
        //    System.out.println(i);
            //System.out.println("the result of multiplication is bellow:");
            System.out.println(num +"X"+ i+ "=" +num*i);
        }


    }
}
