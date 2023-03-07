package com.bridgelabz;

import java.util.Scanner;
public class LineComparisonProblem {

    public static double firstLine;
    public static double secondLine;
    public static int x1,y1,x2,y2,x3,y3,x4,y4;
    String line1 = String.valueOf(firstLine);
    String line2 = String.valueOf(secondLine);

    public static int lengthOfLine1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        x1 = scanner.nextInt();
        System.out.println("Enter the value of y1 : ");
        y1 = scanner.nextInt();
        System.out.println("Enter the value of x2 : ");
        x2 = scanner.nextInt();
        System.out.println("Enter the value of y2 : ");
        y2 = scanner.nextInt();
        firstLine = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Length of a First Line : "+firstLine);
        return (int) firstLine;
    }
    public static int lengthOfLine2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x3 : ");
        x3 = scanner.nextInt();
        System.out.println("Enter the value of y3 : ");
        y3 = scanner.nextInt();
        System.out.println("Enter the value of x4 : ");
        x4 = scanner.nextInt();
        System.out.println("Enter the value of y4 : ");
        y4 = scanner.nextInt();

        secondLine = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("Length of a Second Line : "+secondLine);
        return (int) secondLine;
    }
    public void equalityMethod(){
        if (line1.equals(line2)){
            System.out.println("The Length of Two Lines are EQUAL");
        }else
            System.out.println("The Length of Two Lines are not EQUAL");
    }
    public void comparisonTo(){
        if (line1.compareTo(line2) == 0){
            System.out.println("The Line1 is Equal to Line2");
        } else if (line1.compareTo(line2) > 0) {
            System.out.println("The Line1 is Greater than the Line2");
        }else
            System.out.println("The Line1 is Less than the Line2");
    }
    public static void main(String[] args) {
        System.out.println("**** Welcome to Line Comparison Computation Program ****");

        lengthOfLine1();
        System.out.println();
        lengthOfLine2();
        System.out.println("*****************************************");
        LineComparisonProblem obj = new LineComparisonProblem();
        obj.equalityMethod();
        obj.comparisonTo();
    }
}