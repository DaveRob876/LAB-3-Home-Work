
public class Driver2 {
	public static void main (String[] args) {
		iterationMathLib IterationLibrary = new iterationMathLib();
		RecursionMathLib1 RecursionLibrary = new RecursionMathLib1();
		System.out.println("----Iteration----");
		runTestCode(IterationLibrary); 
		System.out.println("----Recursion----");
		runTestCode(RecursionLibrary); 
		
		
		
		
	}
   
	public static void runTestCode(MathLib library) {
		System.out.println("GCD(4,2) = " +library.gcd(4, 2));
		System.out.println("fibonacci(4) = " +library.Fibonacci(4));
		System.out.println("Ackerman (3,4) = " +library.Ackerman(3,4));
		System.out.println("hanoi (4) = " +library.hanoi(4));
		
	}

}
