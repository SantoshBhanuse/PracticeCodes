@FunctionalInterface
interface myInterfaces
{
	public String display(int a, int b);
}
public class LambdaCalculation
{
	public static void main(String[] args) 
	{
		myInterfaces mi=(a,b)->{return "Lambda:"+(a+b);};
		myInterfaces m=(a,b)->{return "Lambda:"+(a-b);};
		myInterfaces m1=(a,b)->{return "Lambda:"+(a*b);};
		myInterfaces m2=(a,b)->{return "Lambda:"+(a/b);};
		myInterfaces m3=(a,b)->{return "Lambda:"+(a%b);};
		System.out.println(mi.display(70,30));
		System.out.println(m.display(80,20));
		System.out.println(m1.display(50,50));
		System.out.println(m2.display(90,10));
		System.out.println(m2.display(50,10));
	}

}