package src.basics_02;

public class lab0012ternaryexample {

    public static void main(String[] args) {
        int a= 34;
        int b=44;
        int c= 33;

        int min= a<b?((a<c)?a:c):((b<c)?b:c);
        System.out.println(min);
    }
}
