package src.basics_02;

public class lab0011ternary {
    public static void main(String[] args) {

// ternary operaters
//        int a2= true? 10:20;
//        int a1= 20>30? 10:20;
//
//        System.out.println(a2);
//        System.out.println("");
//        System.out.println(a1);

        int a= 34;
        int b= 22;
        int c=12;
        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println("The Greatest of the three is"+ " " + max );

              //Syntax for the ternary is varible = condition?result:result;

        int w=44;
        int g=00;
        boolean ans = w>g? true: false;

        System.out.println(ans);



    }
}
