//Queens.java
//Billy Kwong
//bqkwong
//pa5
//solves n-Queens problem
//try catch block from stack overflow

import java.lang.*;
class Queens {

  public static void main(String[] args) {
    int numSol = 0;
    boolean printSol = false;
    int input = 1;
    int permutations = 1;

    // series of if statements that checks for invalid input
    if(args.length>2 || args.length<1) {badInput();}
    if(args.length==2) {
      if(args[0].equals("-v")) {printSol=true;}
      else {badInput();}
      input = parseInt(args[1]);
    }
    if(args.length==1) input = parseInt(args[0]);

//figures out the number of permutations
    int[] queens = new int[input];
    for(int i=input; i>0; i--) {
    	permutations = permutations*i;
    }
    for(int i=0; i<input; i++) {
    	queens[i]=i+1;
    }

//checks the permutations for solutions, prints if verbose output
    for(int i=0; i<permutations; i++) {
      if(isSolution(queens)) {
        if(printSol==true) {
          System.out.print("(");
          for(int j=0; j<queens.length-1; j++) {
        	  System.out.print(queens[j]+", ");
          }
          System.out.println(queens[queens.length-1]+")");
        }
        numSol=numSol+1;
      }
      nextPermutation(queens);
    }

//prints the number of solutions. Exception cases for 1 or no solutions
    String printSols = "fill";

    if(numSol>1 || numSol==0) printSols = " solutions";
    if(numSol==1) printSols = " solution";
    System.out.println(input+"-Queens has "+numSol+printSols);

  }

//function finds next permutation via lexicographic order
  static void nextPermutation(int[] A) {
    int pivot=-1;
    int successor=0;
    int temp=0;
    int[] tempA;
//scan the array from right to left and find pivot
    for(int i=A.length-2; i>=0; i--) {
      if(A[i]<A[i+1]) {
        pivot = i;
        break;
      }
    }

//if left end was reached without finding a pivot
    if(pivot==-1) {
      tempA = new int[A.length];
      for(int i=0; i<A.length; i++) tempA[i]=A[(A.length-1)-i];
      for(int i=0; i<A.length; i++) A[i]=tempA[i];
      return;
    }

//scan the array from right to left again and find the successor
    for(int i=A.length-1; i>=0; i--) {
      if(A[i]>A[pivot]) {
        successor=i;
        break;
      }
    }

//swap the pivot with the successor
    temp=A[pivot];
    A[pivot]=A[successor];
    A[successor]=temp;

//reverse the array portion that is to the right of the pivot
  tempA = new int[A.length-(pivot+1)];
  for(int i=0; i<tempA.length; i++) tempA[i]=A[(A.length-1)-i];
  for(int i=0; i<tempA.length; i++) A[(A.length-1)-i]=tempA[(tempA.length-1)-i];
  return;
  }

//given a string, parses to Integer. Ends the program if illegal. 
  static int parseInt(String a) {
    int result=0;
    try {
      result = Integer.parseInt(a);
    }
    catch(Exception NumberFormatException) {
      badInput();
    }
    return result;
  }
  
//function checks if the given situation is a n-Queens solution
//j-i=horizontal distance, abs(A[i]-A[j])=vertical distance
  static boolean isSolution(int[] A) {
    int dist=0;
    boolean result=true;
    for(int i=0; i<A.length; i++) {
      for(int j=0; j<A.length; j++) {
        if(j>i) {
          dist=j-i;
          if(Math.abs(A[i]-A[j])==dist) { 
            result=false;
            break;
          }
        }
      }
    }
    return result;
  }


//prints a message regarding usage and ends the program
  static void badInput() {
    System.out.println("Usage: Queens [-v] number\nOption: -v  verbose output, print all solutions");
    System.exit(0);
  }

}