
public class RecursionMathLib1 extends MathLib {
	
	@Override
	public int gcd(int x, int y) {
		if(y==0) {
			return x; 
		}
		if(x>=y && x!=0) {
			return gcd(y, x % y);
		}
		return 0;
	}

	
	public int Fibonacci (int x) {
		if( x == 0) {
			return 0;
		} 
		if( x == 1) {
			return 1; 
		} 
		if (x > 1) {
			return Fibonacci(x - 1) + Fibonacci(x - 2);
		} 
		return 0; 
	}
     public int hanoi (int n ) {
    	 if (n == 1) {
    		 return 1;
    	 } 
    	 if (n > 1) {
    		 return 2 * hanoi (n - 1)+ 1;
    	 }
    	 return n; 
     }
}
