package Restaurant;

import java.util.Scanner;

public class PNumber
{
	static Scanner sc=new Scanner(System.in);
	public static long phno() 
	{
		
		while(true)
		{
			System.out.print("\t\t Enter Your Mobile Number");
			long l=Long.parseLong(sc.next());
			String s=""+l;
			if(s.length()==10)
			{
				if(s.startsWith("6") || s.startsWith("7") || s.startsWith("8") | s.startsWith("9"))
				{
					return Long.parseLong(s);
				}
				else {
					System.err.println("\t\t\t Mobile Number Must be Starts With 6 to 9 ");
				}
			}
			else {
				System.err.println("\t\t\t  Mobile Number must be 10 digits");
			}
		}
		
	}
}
