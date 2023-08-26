package secondAppli51To70;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Amstrong");

        Scanner input = new Scanner(System.in);

        int num, temp, r, sum=0;

        System.out.println("Enter any number");


       num = input.nextInt();

       temp=num;

       while(temp!=0){
           r = temp%10;
           sum = sum+r*r*r;
           temp=temp/10;
       }

 if(num==num){
     System.out.println("Amstrong number");
 }else{
     System.out.println("not a amstrong number");
 }


    }
}
