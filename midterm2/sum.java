//sum.java
class sum{
  public static void main( String[] args) {
      int n = 12; 
	 System.out.println(add(n));
} 
static int add(int n){
      if(n>0){
         return n+add(n-1);
      }
	else{
        return 0;
      }
   }
}
