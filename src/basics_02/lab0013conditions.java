package src.basics_02;

import java.util.Scanner;

public class lab0013conditions {
    public static void main(String[] args) {
//// if else
        // if else if
        // Grade Calculator

        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();
        if (Score >= 90 && Score <= 100) {
            System.out.println("You Scored 'A'");
        } else if (Score >= 80 && Score <= 89) {
            System.out.println("You Scored 'B'");
        } else if (Score >= 70 && Score <= 79) {
            System.out.println("You Scored 'C'");
        } else if (Score >= 60 && Score <= 69) {
            System.out.println("You Scored 'D'");
        } else {
            System.out.println("You have Failed the Exam");
        }

    }
}
