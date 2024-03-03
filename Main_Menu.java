package Restaurant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import RestaurantInterface.Bill_Interface1;

public class Main_Menu extends Menu_Card_Restaurant
{
	public static void main(String[] args)
	{
		LocalTime time=LocalTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
		
		SimpleDateFormat f = new SimpleDateFormat("EEEE");  
		String str = f.format(new Date());  
		if(!(str.equalsIgnoreCase("Sunday"))){
			System.out.println("\n\t\t<------𝓦𝓮𝓵𝓮𝓬𝓸𝓶𝓮 𝓽𝓸 𝓚𝓢𝓡 𝓡𝓮𝓼𝓽𝓪𝓾𝓻𝓮𝓷𝓽------->"+"\t   "+java.time.LocalDate.now()+"/"+time.format(dtf));
			System.out.println("\t\t       ======================\n");
			mi.meth1();
			System.out.println("\n");
			System.out.println("=====================================================================================");
			
			new Discount().discount();
			
			System.out.print("\t Do you want Bill....? \n\t Choose Your Option yes->1 (or) no->0  : ");
			int b=sc.nextInt();
			if(b==1)
			{
				Bill_Interface1 bi=new Bill_Pay();
				bi.bill();
			}
			else {
				System.err.println("\tPlease Try Again....!!!");
			}
		}
		else {
			System.out.println("\n\t\t *****Sunday Closed*****");
			System.out.println("\t Restaurent opens Monday to Saturday Only");
		}		
	}
}
