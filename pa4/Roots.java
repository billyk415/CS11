// Roots.java
// Billy Kwong and Taylor Lim
// bqkwong, tjlim
// pa4
// Program will determine the real roots of a polynomial that lie within a specified range.

import java.util.*;
import java.util.Scanner;

public class Roots{

    public static void main( String[] args ) {
	//Declaration of variables
	Scanner sc = new Scanner(System.in);
	int degree;
	double tolerance, threshold, resolution, leftEnd, rightEnd;
	resolution =0.01;
	tolerance = 0.000000000001;
	threshold = 0.00001;
	
	
	//User enters degree
	System.out.print("Enter the degree: ");
	degree = sc.nextInt();
      
	double[] polynomial = new double[degree+1];
    
	//User enters values of coefficients
	System.out.print("Enter "+(degree+1)+" coefficients: ");
	for(int i=0; i<(degree+1); i++) {
	    polynomial[i] = sc.nextDouble();
	}
	
	//User enters endpoints
	System.out.print("Enter the left and right endpoints: ");
	leftEnd = sc.nextDouble();
	rightEnd = sc.nextDouble();
	System.out.println(" ");

	//Call to functions
	double[] newPolynomial;
	diff(polynomial);
	newPolynomial = diff(polynomial);
	partition(polynomial, leftEnd, rightEnd, resolution, tolerance);
    }

	//poly function
    static double poly(double[] C, double x) {
	double sum = 0;

	for(int i=0; i<C.length; i++) {
	    sum += C[i]*Math.pow(x,i);
	} 
	return sum;
    }

	//diff function
    static double[] diff(double[] C) {
	double[] f = new double[C.length-1];

	for(int i=0; i<(f.length); i++) {
	    f[i] = C[i+1]*(i+1);
	}
	return f;
    }

	//findRoot function
    static double findRoot(double[] C, double a, double b, double tolerance) {
	double threshold = .00001;
	double k = (a + b)/2.0;
	
	if(Math.abs(poly(C,a)) < threshold) {
	    return a;
	}
	if(Math.abs(poly(C,a)) < threshold) {
	    return b;
	}
	while( b - a > tolerance) {
	    k = (a + b) / 2.0;

	    if(oddRoot(C, a, k)) {
		b = k;
	    }
	    if(oddRoot(C, k, b)) {
		a = k;
	    }
	} 
	return k;
    }
	
	//Determines sign of roots
	public static boolean oddRoot(double[] C, double a, double b) {
	if(poly(C,a)>0 && poly(C,b)<0) {
	    return true;
	}
	if(poly(C,a)<0 && poly(C,b)>0) {
	    return true;
	}
	if(Math.abs(poly(C,a)) == 0) {
	    return true;
	}
	else {
	    return false;
	}
    }

	//Determines odd and even roots, and prints out the roots
    public static void partition(double[] C, double a, double b, double resolution, double tolerance) {
	double threshold=0.00001;
	double leftEnd = a;
	double rightEnd = a + resolution;
	boolean anyRoots = false;
	double x;
	double[] derivative;
	
	diff(C);
	derivative = diff(C);

	while(rightEnd < b) {
	    if(oddRoot(C, leftEnd, rightEnd)) {
		double z = findRoot(C, leftEnd, rightEnd, tolerance);
                System.out.printf("Odd root found at: %.10f%n", z);
                leftEnd += resolution;
                rightEnd += resolution;
				anyRoots = true;
	    }
	    else if (oddRoot(derivative, leftEnd, rightEnd)) {
		x = findRoot(derivative, leftEnd, rightEnd, tolerance);        
		if(Math.abs(poly(C, x)) < threshold) {
		    System.out.print("Even root found at: ");
		    System.out.printf("%.10f%n", x);
		    leftEnd += resolution;
		    rightEnd += resolution;
			anyRoots = true;
		    continue;
		}
		leftEnd += resolution;
		rightEnd += resolution;
		continue; 
	    }
	    leftEnd += resolution;
	    rightEnd += resolution;    
	}
	
	//If there is not any roots, print this
	if(!anyRoots) {
	    System.out.println("No roots were found in the specified range. ");
	}
    }
}

