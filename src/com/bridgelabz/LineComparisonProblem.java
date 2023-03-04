package com.bridgelabz;

import java.util.Scanner;
public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("**** Welcome to Line Comparison Computation Program ****");

        double firstLine;
        double secondLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        int x1 = scanner.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = scanner.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = scanner.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = scanner.nextInt();

        firstLine = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Length of a First Line : "+firstLine);
        System.out.println();

        System.out.println("Enter the value of x3 : ");
        int x3 = scanner.nextInt();
        System.out.println("Enter the value of y3 : ");
        int y3 = scanner.nextInt();
        System.out.println("Enter the value of x4 : ");
        int x4 = scanner.nextInt();
        System.out.println("Enter the value of y4 : ");
        int y4 = scanner.nextInt();

        secondLine = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("Length of a Second Line : "+secondLine);
        System.out.println();
        System.out.println("*****************************************");

        String line1 = String.valueOf(firstLine);
        String line2 = String.valueOf(secondLine);

        if (line1.equals(line2)){
            System.out.println("The Length of Two Lines are EQUAL");
        }else
            System.out.println("The Length of Two Lines are not EQUAL");

        if (line1.compareTo(line2) == 0){
            System.out.println("The Line1 is Equal to Line2");
        } else if (line1.compareTo(line2) > 0) {
            System.out.println("The Line1 is Greater than the Line2");
        }else
            System.out.println("The Line1 is Less than the Line2");
    }
}
