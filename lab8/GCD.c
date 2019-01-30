// GCD.c
// Billy Kwong
// bqkwong
// lab8
// Finds the GCD of two integers, C program

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

//CheckInput4.c with some tweaks
int main(){
   int i, n;
   int x[2];
   char str[100];

   // get two positive integers from the user
   for(i=0; i<2; i++){
	  //Try again if number enter is 0 
      if(i == 0){
		  printf("Enter a positive integer: ");
		  }
	  //Program works after entering a number 1 or higher
	  if(i == 1){
		  printf("Enter another positive integer: ");
		  }
	  
	  n = scanf(" %s", str); // read one token from stdin
      
      while( 1 ){ // seemingly infinite loop
		
         while( !isInteger(str) ){ // if its not a integer
            printf("Please enter a positive integer: "); // ask again
            n = scanf(" %s", str);             // get another string
         }
         // at this point str is a string that should be convertable to integer

         sscanf(str, "%d", &x[i]);  
         if( x[i]>0 ){               // if it's positive
            break;                   // get out of the while loop
         }
         printf("Please enter a positive integer: "); // otherwise ask again
         n = scanf(" %s", str);                      // and get another
      }
      // break lands here
   }
   printf("The GCD of %d and %d is %d\n", x[0], x[1], getGcd(x[0], x[1]));

   return 0;
}

// isInteger()
// Returns 1 (true) if string s[] can be interpreted as an int, and
// returns 0 (false) otherwise.
int isInteger(char s[]){
   int i, n;
   
   if( s==NULL ) 
      return 0;
   n = strlen(s);
   if( n==0 ) 
      return 0;
   if( s[0]!='-' && s[0]!='+' && !isdigit(s[0]) )
      return 0;
   for(i=1; i<n; i++){
      if( !isdigit(s[i]) ) 
         return 0;
   }
   return 1;
}

//GCD function
int getGcd(int x,int y){
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