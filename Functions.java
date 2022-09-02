import java.util.*;

public class Functions {
	public static void printMyNameAge(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		return;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int age=sc.nextInt();
		
		printMyNameAge(name,age);
	}
	
	
}
