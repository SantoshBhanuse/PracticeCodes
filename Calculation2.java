
import static org.junit.Assert.*;
public class Calculation2 {

		public int findmax(int a[])
		{
			int max=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
				
			}
			return max;
			
			
		}
	
	
}