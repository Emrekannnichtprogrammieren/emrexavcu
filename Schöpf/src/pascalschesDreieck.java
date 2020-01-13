public class pascalschesDreieck {

	
	public static int pas_rec(int m,int n) 
	{
		//pt (m,n)
		if (n == 0) {
			return 1;
		}
		
		if (m == n) {
			return 1;
		}
		return pas_rec(m-1,n-1) + pas_rec(m-1,n);
	}
	public static void main(String[] args) {
		System.out.println(pas_rec(4,2));
	}

}
