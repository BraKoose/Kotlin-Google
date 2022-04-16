package com.rsk.ExamPrep;

public class TypeCasting {
     public static void main(String[] args) {
         //Widennin Casting
         int myInt = 10;
         double myDouble = myInt; //automatic casting

         System.out.println(myInt);
         System.out.println(myDouble);

         double doubleKoose = 9.78d;
         int newNumber = (int) doubleKoose;
         System.out.println(doubleKoose);
         System.out.println(newNumber);
    }
}
