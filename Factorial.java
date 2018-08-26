package recursive;

public class Factorial {

public static void main (String []args) {
	fact(5);
	
}
static int fact=1;
static void fact(int n) {
//int  fact=1;

	
	fact=fact*n;
	System.out.print(fact+"  ");
	if(n>0)
		fact(n-1);
		//n=n-1;
	System.out.println(n);

}

		}
	


