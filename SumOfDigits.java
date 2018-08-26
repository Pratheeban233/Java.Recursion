package recursive;

public class SumOfDigits {

	public static void main(String[] args) {
		
		digit(6547);

		System.out.println(sumofdigit);
	}
	static int sumofdigit=0;
	static void digit(int n)
	{
		
		int r=0;
		
		r=n%10;
		n=n/10;
		sumofdigit=sumofdigit+r;
		System.out.println(r);
		if(n>0) {
			digit(n);
			}
	}

}
