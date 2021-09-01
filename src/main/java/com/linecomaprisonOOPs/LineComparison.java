package com.linecomaprisonOOPs;

public class LineComparison {

    public static void main(String[] args) {
        LineComparison lineMethod = new LineComparison();//created object to call method welcomemessage as it is not static
        lineMethod.welcomemessage();
    }
     private void welcomemessage(){
         System.out.println("Welcome to Line Comparison");

     }
}
