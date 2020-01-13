public class fibonacci {

	//fakultät und rekursion fakultät fehlt
	
	
	public static int fib_rec(int n) 
	{
		
		if ( n == 0 ) {
			return 0;
		}
		
		if ( n == 1 ) {
			return 1;
		}
		
		return fib_rec(n-2)+fib_rec(n-1);
	}
	
	public static void main(String[] args)
	{
		System.out.println(fib_rec(10));
	}
}
