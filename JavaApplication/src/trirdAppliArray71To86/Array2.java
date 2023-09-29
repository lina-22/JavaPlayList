package trirdAppliArray71To86;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[]number = new double[5];

        double sum =0;
        System.out.println("Plz Enter five numbers :");

        //number[0] = input.nextDouble();
        //number[1] = input.nextDouble();
        //number[2] = input.nextDouble();
        //number[3] = input.nextDouble();
        //number[4] = input.nextDouble();

        for (int i=0; i<number.length; i++){
            number[i] = input.nextDouble();
        }
        for (int i=0; i<number.length; i++){
           sum = sum+number[i];
        }
      // sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("The sum is "+sum);
        System.out.println("The avarage is : "+sum/5);

        double max = number[0];
        for (int i = 1; i <5 ; i++) {
            if(max<number[i]){
                max = number[i];
            }
        }
        System.out.println("Maximum equal : "+max);

        double min = number[0];
        for (int i = 1; i >5 ; i++) {
            if(min>number[i]){
                min = number[i];
            }
        }
        System.out.println("Maximum equal : "+min);
    }
}
