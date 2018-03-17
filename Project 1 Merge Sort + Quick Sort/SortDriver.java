//Comp 482  Project 2
//Test Cases for Grading Project 2

import java.util.*;

public class SortDriver
{
   public static void printSlice(int[] x, int i, int j)
   {
      for(int k = i; k <=j; k++)
         System.out.print(x[k] + " ");
      System.out.println();
   }
   
   public static void printPartition(int[] x, int i, int j, int el)
   {
      //el is the pivot index
      System.out.print("[ ");
      for(int k = 0; k < el; k++)
         System.out.print( x[k] + " " );
      System.out.print("]   " + x[el]+ "    [ ");
      for(int k = el +1; k < x.length; k++)
         System.out.print(x[k] +"  ");
      System.out.println("]");    
   
   }
   
   
   public static void main (String[] args)
   {
      int[] a = { 3,5,2,7,8,9,4,1,8, 6};
     
      int[] b = { 2,5,7,9, 1,3,4,6,8,8 };
  
     
      System.out.print("TEST A  Testing mergeSort\t\t");   
      Sorts.mergeSort(a);
      printSlice(a,0, a.length -1);
         
      System.out.print("\nTEST B  Testing merge\t\t");
      Sorts.merge(b, 0, 3 ,9);
      printSlice(b,0, 9);
       
              
      int[] a2 = { 3,5,2,7,-8,9,4,1,8, 6};
      int[] b2  = {2,6,3,7,1,5,4};
      //int[] b2  = {3,5,2,7,8, 9,4,1,8,6};  //Alternative test
      int[] c2 = { 3,5,2,7,8,9,4,1,8,6};
      
      System.out.print("\nTEST C  Testing quickSort\t\t");   
      Sorts.quickSort(a2);
      printSlice(a2,0, a2.length -1);
         
      System.out.print("\nTEST D  Testing  partition\t\t");
      int el = Sorts.partition(b2, 0, b2.length -1);
      printPartition(b2, 0, b2.length, el);
      System.out.println( "Partition returned index: " + el 
         +"  pivot value: " + b2[el]);
            
      System.out.print("\nTEST E  Testing quickSort on a slice\t\t");
      Sorts.quickSort(c2, 3,6);
      printSlice(c2,3,6);
   
   
   }

}
/*--------------------
 ----jGRASP exec: java SortDriver
TEST A  Testing mergeSort		1 2 3 4 5 6 7 8 8 9 

TEST B  Testing merge		1 2 3 4 5 6 7 8 8 9 

TEST C  Testing quickSort		-8 1 2 3 4 5 6 7 8 9 

TEST D  Testing  partition		[ 2 1 3 ]   4    [ 6  5  7  ]
Partition returned index: 3  pivot value: 4

TEST E  Testing quickSort on a slice		4 7 8 9 

 ----jGRASP: operation complete.
*/