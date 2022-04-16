package com.rsk.ExamPrep;

public class TypeCasting {
     public static void main(String[] args) {
         //Widennin Casting
         int myInt = 10;
         double myDouble = myInt; //automatic casting

         System.out.println(myInt);
         System.out.println(myDouble);

         //narrow
         double doubleKoose = 9.78d;
         int newNumber = (int) doubleKoose;
         System.out.println(doubleKoose);
         System.out.println(newNumber);

         String txt = "The zeal is learn and \t prove thy self and God only.";
         System.out.println(txt);

         //Maths casted to int
         int pop = (int) Math.sqrt(64);
         System.out.println(pop);


         int x = 5;

         String name;
         name = "Koose";
         int time = 22;

         if(time < 10) {
             System.out.println("Good Morning");
         }
         else if (time < 16){
             System.out.println("Good Day");
             }
         else {
             System.out.println("Good Evening" + name);
         }
    }
}
