package secondAppliFiftyOneToHundrad;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");

        System.out.println("*************************");
        System.out.println("Which fibonacci number you want to see? ");
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();



        int first =0;
        int second = 1;



        System.out.print(first + " "+second);

        for (int i =3; i<=m; i++){
            int fibo = first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println();

    }
}
