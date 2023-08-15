package firstApplication;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, farn;
        System.out.println("Celcious = ");
        cels = input.nextDouble();
        farn = 1.8*cels+32;
        System.out.println("Farenheit :"+farn);

        /******************************************/
        Scanner input1 = new Scanner(System.in);
        double far, cel;
        System.out.println("Give a farenheight value :");
        far = input1.nextDouble();
        cel= 0.55*far-32;
        System.out.println("Celcious value: " +cel);



    }
}
