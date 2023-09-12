package FourthAppliString87To100;

public class WrapperDemo {
    public static void main(String[] args) {
        //autoboxing primitive->object

        int x =30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        Integer z = x; //Interger.valueOf(x)
        System.out.println("z ="+z);

//        //object->primitive data type
//        Double d = new Double (10.25);
//        System.out.println("d = "+d);

//        double e = d.doubleValue();
//        System.out.println(e);

//        double f = d; //d.doubleValue(); unboxing
//        System.out.println(f);
    }
}
