package cw;
//********************************************************************
//  Multiples.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a for loop.
//********************************************************************

import java.util.Scanner;

public class Multiples
{
   //-----------------------------------------------------------------
   //  Prints multiples of a user-specified number up to a user-
   //  specified limit.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int PER_LINE = 5;
      int value = 0;
      int limit = 0;
      int mult = 0;
      int count = 0;
      
      Scanner keyboard = new Scanner(System.in);

      System.out.print ("Enter a positive value: ");
      value = keyboard.nextInt();

      System.out.print ("Enter an upper limit: ");
      value = keyboard.nextInt();

      System.out.println ();
      System.out.println ("The multiples of " + value + " between " +
                       value + " and " + limit + " (inclusive) are:");

      for (mult = value; mult <= limit; mult += value)
      {
         System.out.print (mult + "\t");

         // Print a specific number of values per line of output
         count++;
         if (count % PER_LINE == 0)
         {
            System.out.println();
         }//end if
      }//End loop
   }//End Main Method
}//End class
