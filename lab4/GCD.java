//GCD.java
//Billy Kwong and Taylor Lim
//bqkwong, tjlim
//pa3
//Prompts user for two positive integers, then prints out the greatest common divisor of the two numbers. 

import java.util.Scanner;

class GCD{
	//Declaration of variables
	public static int x, y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaration of variables
		int i, counter = 1;
		
		//Loop that gets two positive user integers and assigns it to the variables.
		for(i=0;i<2;i++){
			if(i==0){
			System.out.print("Enter a positive integer: ");
			while(true){
				while(!sc.hasNextInt()){
		 		sc.next();
				System.out.print("Please enter a positive integer: ");			
				}
				x = sc.nextInt();
				if ( x>0 ){
				//places a count when a positive integer is entered.
				counter++;
				break;
				}
				System.out.print("Please enter a positive integer: ");	
	}
	}

			else {System.out.print("Enter another positive integer: ");
			while(true){
				while(!sc.hasNextInt()){
				sc.next();
				System.out.print("Please enter a positive integer: ");
				}
				y = sc.nextInt();
				if ( y>0 ){
				//places a count when a positive integer is entered.
				counter++;
				break;
				}
				System.out.print("Please enter a positive integer: ");
				}
		 }
			//Prints out GCD only if two positive integers are entered.
			if ( counter > 2) {
			System.out.println("The GCD of " + x + " and " + y + " is " +  getGcd(x,y));
			}
}
}
		//GCD function
		public static int getGcd(int x,int y){
   		 int gcd = 1;

    		if(x>y) {
        		for(int i = 1; i <= y; i++) {
           			 if(x%i==0 && y%i ==0) {
                		gcd = i;
            }
        }
    }
    else
    {
        for(int z = 1; z <= x; z++)
        {
            if(x%z==0 && y% z==0)
            {
                gcd = z;
            }
        }
    }   
    return gcd;
	
}
}
