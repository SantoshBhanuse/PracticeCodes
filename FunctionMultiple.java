import java.util.Scanner;

public class FunctionMultiple {
	public static int Calculateproduct(int a,int b)
	{
		int pro=a*b;
		return pro;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Calculateproduct(a,b));
	}
}
