
public class iterationMathLib extends MathLib { 
	
	@Override
	public int gcd(int x, int y) {
		while(y!=0) {
			if(x>=y && x!=0) {
				int temp = x;
				x=y;
				y = temp % y;
			}
		}
		return x;
	}
	
	
	
	public  int Fibonacci (int x) {
	 int x1=0, x2=1, x3, i, count=10;
	System.out.print(x1+" "+x2);//Print 0 and 1
	
	for(i = 2; 1 < count; ++ i) //Loop starts from 2 because 0 and 1 already printed
	{
		x3 = x1 + x2;
		System.out.print(" " + x3);
		x1 = x2;
		x2 = x1;
	}
	return 0;
	
	

	}

	public int Ackerman (int x, int y)
	{ 
		//x = 0; // Since I made "x" equaled to "0" it should return 2 * y
		if (x == 0) {
			return 2 * y;
		} else if (x >= 1) { // This else if will run if x is not equal to 0. 
			return 0;
		}else if (y == 1) {
			return 2;
		}else {
			return Ackerman(x-1, Ackerman (x, y-1));
		} 
		
	} 
	
	public int hanoi (int n) {
		
		int y = 1;
		
		while( n > 0) {
			if(n== 1) {
				
				return y; 
			} 
			
			else {
				y = 2 * (2 * n - 1) + 1;
				return y; 
			}
		}
		
		return y;
	}
	
}

