package com.mycompany.act4_albino_1;

import java.util.Scanner;

public class ACT4_Albino_1 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter string: ");
      String myString = in.nextLine();
      System.out.print("Enter number: ");
      int myNumber = in.nextInt();
      System.out.print("Enter double: ");
      double myDouble = in.nextDouble();
      System.out.print("Enter float: ");
      float myFloat = in.nextFloat();
      System.out.print("Enter character: ");
      char myCharacter = in.next().charAt(0);
      System.out.print("Enter boolean: ");
      boolean myBoolean = in.nextBoolean();
      
      System.out.println("The summary of your inputs are the following: ");
      System.out.println("The value for string is " + myString);
      System.out.println("The value for integer is " + myNumber);
      System.out.println("The value for double is " + myDouble);
      System.out.println("The value for float is " + myFloat);
      System.out.println("The value for char is " + myCharacter);
      System.out.println("The value for boolean is " + myBoolean);
    }
}
