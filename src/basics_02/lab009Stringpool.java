package src.basics_02;

public class lab009Stringpool {
    public static void main(String[] args) {
        String s1="omkar";
        //it store in String pool//
        String s2=new String("omkar");
             s2="omkar";


        boolean d=s1==s2;
        System.out.println(d);
        System.out.println(" ");
        boolean e=s1.equals(s2);
        System.out.println(e);
    }
}
