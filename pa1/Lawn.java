//Lawn.java
//Billy Kwong
//1541400
//pa1
//This program will have the user enter the dimensions of a lot and house in feet and the mowing rate in square feet per second. Program will print out the area of the lawn in square feet and the mowing time.

import java.util.Scanner;
class Lawn{
	public static void main(String[] args){
		//Variables used in program
		double lengthLot, widthLot, lengthHouse, widthHouse, lawnArea, rate, seconds;
		int hour, min, sec;

		Scanner sc = new Scanner(System.in);
		//User enters length and width of the lot
		System.out.print("Enter the length and width of the lot, in feet: ");
		widthLot = sc.nextDouble();
		lengthLot = sc.nextDouble();
		//User enters length and width of the house
		System.out.print("Enter the length and width of the house, in feet: ");
		widthHouse = sc.nextDouble();
		lengthHouse = sc.nextDouble();
		//Calculates the area of the lawn based on user input
		lawnArea = (widthLot*lengthLot) - (widthHouse*lengthHouse);
		System.out.println("The lawn area is " + lawnArea + " square feet.");
		//User enters the mowing rate of the lawn
		System.out.print("Enter the mowing rate, in square feet per second: ");
		rate = sc.nextDouble();
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
