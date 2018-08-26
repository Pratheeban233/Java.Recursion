package recursive;

public class Fibonacci {

	public static void main(String[] args) {
		fibo(0,1);

	}
//	static int a=0,b=1,n=1;
	
	static int n=1;
	static void fibo(int a, int b)
	{
		
		 int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		n++;
		if(n<15)
		fibo(a,b);
			
		
	}
}