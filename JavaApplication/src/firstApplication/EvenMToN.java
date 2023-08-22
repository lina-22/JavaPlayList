package firstApplication;

import java.util.Scanner;

public class EvenMToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,n;

        System.out.println("Enter a initial number:" );
        m=input.nextInt();

        System.out.println("Enter the last number:");
        n= input.nextInt();

        int sum=0;


        for (int i=m; i<=n; i++){
            //System.out.println("Even number from m to n:"+i);
            if(i%2==0){
         sum = sum + i;
                System.out.println(i);
        }
        }
        System.out.println("The sum is:"+sum);
    }

}
