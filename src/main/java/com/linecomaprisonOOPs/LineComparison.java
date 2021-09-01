package com.linecomaprisonOOPs;
import java.util.Scanner;
public class LineComparison {
    int x1;
    int x2;
    int y1;
    int y2;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LineComparison lineMethod = new LineComparison();//created object to call method welcomemessage as it is not static
        lineMethod.welcomemessage();
        lineMethod.lengthOfLine();
    }
     private void welcomemessage(){
         System.out.println("Welcome to Line Comparison");

     }
    public void lengthOfLine(){
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 ");
        int y2 = sc.nextInt();
        System.out.println("Length of the line:"+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1),2)));
    }
}
