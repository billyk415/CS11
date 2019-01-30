// Rational.java
class Rational{
 int numerator; int denominator; // Fields
 Rational(int n, int d){ // Constructor
 if(d==0) throw new RuntimeException("zero denominator");
 numerator = n; denominator = d;
 }
 Rational plus(Rational Q){
	int n = this.numerator * Q.denominator + this.denominator * Q.numerator;
	int d = this.denominator * this.numerator;
	return new Rational(n,d);
 }
 Rational times(Rational Q){
	int n = this.numerator * Q.numerator;
	int d = this.denominator * Q.denominator;
	return new Rational(n,d);
 }
 public String toString(){
	if (denominator == 1) {
		return this.numerator + " ";
 }
	else{
		return this.numerator + "/" + this.denominator;
	}
 }
 public boolean equals(Object x){
	boolean eq = false;
	Rational r;
	
	if (x instanceof Rational) {
		r = (Rational)x;
		eq = (this.numerator*r.denominator==this.denominator*r.numerator);
	}
	return eq;
 }
} // end of class Rational