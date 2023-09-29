package fourthAppliString87To100;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Lina haq";
        String s2 = new String("Lina haq");
        String s3 = s2.replace('i', 'o');
        System.out.println(s3);

        if(s1==s2){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }

        System.out.println("**********************************");
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }

        String [] names = {"lina", "kk", "lllm"};
        for (String x:names
             ) {
            System.out.println(x);

        }
    }
}
