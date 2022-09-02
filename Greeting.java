import java.util.*;
public class Greeting {
	public static void main(String[]args)
	{
		System.out.println("Please print only 1 or 2 or 3");
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		switch(button)
		{
		case 1:
			System.out.print("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Vadakkam");
			break;
		default:
			System.out.print("invalid");
		}
	}
}
