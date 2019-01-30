// Problem7.java
import java.util.Scanner;
import java.io.*;
class Problem7{
 public static void main(String[] args){
 Scanner sc;
 if (args.length<1){
	 System.out.println("File not big enough");
	 throw FileNotFoundException;
 }
 try{
	 in = new Scanner(new File(args[0]));
 } catch (FileNotFoundException f){
	 System.out.println("File not found");
 }
 double sum,nums;
 while(in.hasNext()){
	 sum += sc.nextDouble();
	 nums++;
	 }
	 System.out.println("The average value in the file testis " + sum/nums);
}