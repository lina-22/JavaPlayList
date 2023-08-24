package secondAppliFiftyOneToHundrad;

import java.util.Scanner;

public class Palindrome {
    //after reverse a number if it is the remain same then it is call Palindrome number ex:121

    public static void main(String[] args) {
        System.out.println("Palindrome");

        Scanner input = new Scanner(System.in);

        int num, sum=0, temp, r;

        System.out.println("Enter any number :");
        num = input.nextInt();

        temp = num;
        while(temp!=0){
            r = temp %10;
            sum = sum *10+r;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println("Palindrom number");
        }else{
        System.out.println("not a  palindrom number");}
    }
}
