package secondAppliFiftyOneToHundrad;

import java.util.Scanner;

public class Multiplication2 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Initial number :");
        int m = input.nextInt();
        System.out.println("Enter the Final number :");
        int n = input.nextInt();

        for (int i=m;  i<=n;i++ ){
            for (int j=1; j<=10;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println("\n\n");
        }
    }

}
