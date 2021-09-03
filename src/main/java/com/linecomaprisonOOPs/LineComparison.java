package com.linecomaprisonOOPs;
import java.util.Scanner;
public class LineComparison {
    int x1, x2, x3, x4;//  instance variables
    int y1, y2, y3, y4;
    double line1;
    double line2;
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        welcomeMessage();
        LineComparison lineMethod = new LineComparison();//created object to call method as it is not static
        lineMethod.equalsTo();
        lineMethod.compareLines();
    }

    public static void welcomeMessage() {

        System.out.println("Welcome to Line Comparison");
    }

    public double lengthOfLine1() {
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1 ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 ");
        y2 = sc.nextInt();
        line1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
        System.out.println("Length of the line1: " + line1);
        return line1;
    }

    public double lengthOfLine2() {
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x3 ");
        x3 = sc.nextInt();
        System.out.println("Enter x4 ");
        x4 = sc.nextInt();
        System.out.println("Enter y3 ");
        y3 = sc.nextInt();
        System.out.println("Enter y4 ");
        y4 = sc.nextInt();
        line2 = Math.sqrt(Math.pow((x4 - x3),2)) + Math.pow((y4 - y3),2);
        System.out.println("Length of the line2: " + line2);
        return line2;
    }

    double line1Length = lengthOfLine1();
    double line2Length = lengthOfLine2();
    public void equalsTo() {
        if (line1Length == line2Length) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Compare Lines");
        }
    }

    public void compareLines() {
        if (line1Length == line2Length) {
            System.out.println("Lines are Equal");
        } else if(line1Length > line2Length) {
                System.out.println("Line1 is greater than Line2 ");
            } else {
                System.out.println("lines2 is greater than line1");
            }
        }
    }

