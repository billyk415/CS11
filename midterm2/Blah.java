class Blah{
 private int foo;
 private double bar;
 Blah(int f, double b){
 foo = f;
 bar = b;
 }
 Blah(int a, int b){
 foo = a+b;
 bar = 0.0;
 }
 int getFoo(){
 return foo;
 }
 void setBar(double x){
 bar = x;
 }
 void mult(){
 bar *= foo;
 }
 public String toString(){
 return "("+foo+", "+bar+")";
 }
 public boolean equals(Object x){
 boolean eq = false;
 Blah B;
 if( x instanceof Blah ){
 B = (Blah)x;
 eq = (foo==B.foo && bar==B.bar);
 }
 return eq;
 }
}
class BlahTest{
 public static void main(String[] args){
 Blah A = new Blah(15, 3.0);
 Blah B = new Blah(7, 8);
 System.out.println(A);
 System.out.println(B);
 A.mult();
 B.setBar(45.0);
 System.out.println(A.equals(B));
 }
}
