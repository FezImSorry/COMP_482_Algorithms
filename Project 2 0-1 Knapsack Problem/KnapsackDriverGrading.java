//Project 2  Comp 482
//Used for grading Project 2

import java.util.*;

public class KnapsackDriverGrading
{

   public static void main( String[] args)
   {
       
     
    /**********************Data for Testcases A,B,C*********************************/
      
      int n2 = 15;
      int[] weights2 = {-1,10,7,4,9,14,  5,9,9,27,13,   7,19,29,42,16   };
      int W2 = 39;
      int[] benefits2 = {-1, 20,40,30,55,24,  10,15,27,13,29, 14,55,3,12,10};
      
   /******************************************************************************/
      
      System.out.println("\nTestCase A:  Brute Force Solution");  
      Knapsack kp1 = new Knapsack(W2, weights2, benefits2);  
      kp1.BruteForceSolution();
      
  /***************************************************************/    
    
      System.out.println("\nTestCase B:  Dynamic Programming Solution");
      Knapsack kp2 = new Knapsack(W2,weights2, benefits2);
      kp2.DynamicProgrammingSolution(false);
      
  /***********************************************************/          
       
      System.out.println("\nTestCase C:  Greedy Approximate Solution");
      Knapsack kp3 = new Knapsack(W2, weights2, benefits2); 
      kp3.GreedyApproximateSolution();
   
   
     /***********************Data for Testcase D and E*********************************/
      int n5 = 6;
      int[] weights5 = {-1, 7,3,9,6,2,6 }; 
      int W5 = 8;
      int[] benefits5 = {-1, 4,5,4,5,4,5};
     
                
      System.out.println("\nTestCase D:  Dynamic Programming Solution");
      Knapsack kp4 = new Knapsack(W5,weights5, benefits5);
      kp4.DynamicProgrammingSolution(true);
       
      System.out.println("\nTestCase E:  Brute Force Solution");     
      Knapsack kp6 = new Knapsack(W5, weights5, benefits5);  
      kp6.BruteForceSolution();
 
    
   /************************************************/
   System.out.println("\nTest F: Generate Subset");
   int n = 6;
   int k = 17;
   int[] nextSubset = kp4.generateSubset(k,n);
   System.out.println( "n = " + n + "\tk= " + k + 
              "\tsubset generated = " + Arrays.toString(nextSubset));
                
   }
}
/*************Solutions **********************


TestCase A:  Brute Force Solution
Optimal Set= { 2,3,4,12 }	weight sum = 39	benefit sum = 180

TestCase B:  Dynamic Programming Solution
Optimal Set= { 2,3,4,12 }	weight sum = 39	benefit sum = 180

TestCase C:  Greedy Approximate Solution
Optimal Set= { 1,2,3,4,8 }	weight sum = 39	benefit sum = 172

TestCase D:  Dynamic Programming Solution
Optimal Set= { 2,5 }	weight sum = 5	benefit sum = 9

OPT Matrix
0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	4	4	
0	0	0	5	5	5	5	5	5	
0	0	0	5	5	5	5	5	5	
0	0	0	5	5	5	5	5	5	
0	0	4	5	5	9	9	9	9	
0	0	4	5	5	9	9	9	9	


TestCase E:  Brute Force Solution
Optimal Set= { 5,6 }	weight sum = 8	benefit sum = 9
Optimal Set= { 4,5 }	weight sum = 8	benefit sum = 9
Optimal Set= { 2,5 }	weight sum = 5	benefit sum = 9

Test F: Generate Subset
n = 6	k= 17	subset generated = [0, 1, 0, 0, 0, 1]

*/

