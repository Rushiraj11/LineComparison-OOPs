package com.linecomaprisonOOPs;
import java.util.Scanner;
public class LineComparison {
    int x1, x2, x3, x4; // instance variables
    int y1, y2, y3, y4;
    double line1;
    double line2;
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        LineComparison lineMethod = new LineComparison();//created object to call method welcomemessage as it is not static
        lineMethod.welcomemessage();
        double line1Length = lineMethod.lengthOfLine1();
        double line2Length = lineMethod.lengthOfLine2();
        if (line1Length == line2Length) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    private void welcomemessage() {
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
        System.out.println("Length of the line: " + line1);
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
        line2 = Math.sqrt(Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2);
        System.out.println("Length of the line: " + line1);
        return line2;
    }

}
