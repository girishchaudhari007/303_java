import java.util.Scanner;
class fac
{
	public static void main(String []args)
	{
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=n; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial result="+fact);
	}
}