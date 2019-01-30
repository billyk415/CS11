//Lawn.java
//Billy Kwong
//1541400
//lab3
//This program will retrieve input from Lawn-in and send output to Lawn-out. Errors in the program will be sent to Lawn-errs.

import java.util.Scanner;
class Lawn{
	public static void main(String[] args){
		//Variables used in program
		int lengthLot, widthLot, lengthHouse, widthHouse, lawnArea, rate, seconds;
		int hour, min, sec;

		Scanner sc = new Scanner(System.in);
		
		widthLot = sc.nextInt();
		lengthLot = sc.nextInt();
		
		widthHouse = sc.nextInt();
		lengthHouse = sc.nextInt();
		//Calculates the area of the lawn based on user input
		lawnArea = (widthLot*lengthLot) - (widthHouse*lengthHouse);
		System.out.println("The lawn area is " + lawnArea + " square feet.");
		
		rate = sc.nextInt();
		//Determines how many seconds to completely mow the lawn
		seconds = lawnArea/rate;
		//Convert total seconds into how many hours, minutes, and seconds
		sec = (int) Math.round(seconds); 
		min = sec/60;
		sec %=60;
		hour = min/60;
		min %=60;
		//Prints out how long it will take to mow the lawn completely
		System.out.println("The mowing time is " + hour + " hour"+(hour==1? " ":"s ") +min+ " minute"+(min==1? " ":"s ")  +sec+ " second"+(sec==1? ".":"s."));
	}
}
