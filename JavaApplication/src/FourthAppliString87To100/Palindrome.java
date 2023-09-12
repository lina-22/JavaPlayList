package FourthAppliString87To100;

public class Palindrome {
    public static void main(String[] args) {
        String s1 ="Madam";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if(s1.equals(s2)){
            System.out.println("Plaindrom");
        }else{
            System.out.println("Not plaindrome");
        }



    }
}
