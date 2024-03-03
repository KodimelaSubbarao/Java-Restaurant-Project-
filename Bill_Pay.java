package Restaurant;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import RestaurantInterface.Bill_Interface1;
import RestaurantInterface.Menu_Interface;

public class Bill_Pay implements Bill_Interface1
{
	static Menu_Interface mi=new Menu_Card_Restaurant();
	static Scanner sc=new Scanner(System.in);
	static String item[]=new String[225];
	static int qunty[]=new int [225];  
	static int cost[]=new int[225];
	static int total[]=new int[225];
	static int discount;
	static int tax;
	static int subTotal;
	long phNo;
	@Override
	public void bill() 
	{
		System.out.print("\n\t\t Enter Your Name: ");
		sc.nextLine();
		String name=sc.nextLine();
		phNo=PNumber.phno();
		System.out.println("        _____________________________________________________\t");
		System.out.println();
		System.out.println("\t\t ˜”*°•.˜”*°• RECEIPT •°*”˜.•°*”˜ ");
		System.out.println("\t\t\t    ^^^^^^^^^");
		System.out.println("\t\t\t ♥ KSR Restaurant ♥");
		System.out.println("\t\t\t----------------");
		System.out.println("\t\t     KSR Restaurant, Ameerpet,");
		System.out.println("\t\t\t   Hyderabad,");
		System.out.println("\t\t\t   TS, 500016");
		System.out.println("\t\t       (+91) 9121912345 ");
		System.out.println("            ******************************************");
		System.out.println("        ________________________________________________________\t");
		Random random = new Random();
	    int id = random.nextInt(900000) + 100000;
		System.out.println("\t Order ID: "+id+"\t\t\tDate: "+java.time.LocalDate.now());
		LocalTime time=LocalTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println("\t CName: "+name+"\t\t\t\tTime: "+time.format(dtf));
		System.out.println("       ----------------------------------------------------------\t");
		int SNo=1;
		int a=0;
		System.out.println("\t S.No"+"\t"+"Item Name"+"\t"+"Quantity"+"\t"+"Cost"+"\t"+"Total");
		for(int x:total)
		{
			if(x>0)
			{
				System.out.println("\t  "+SNo+"\t"+item[a]+"\t    "+qunty[a]+"\t    "+cost[a]+"\t     "+total[a]);
				SNo++;
			}
			a++;
		}
		for(int i:total)
		{
			subTotal +=i;
		}
		System.out.println("\t\t\t================================");
		System.out.println("\t\t\t\t Sub Total :  "+subTotal);

		if(subTotal>=500 && subTotal<1000)
		{
			tax=subTotal*2/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else if(subTotal>=1000 && subTotal<1500)
		{
			tax=subTotal*5/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else if(subTotal>=1500 && subTotal<2000)
		{
			tax=subTotal*10/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else if(subTotal>=2000 && subTotal<3000)
		{
			tax=subTotal*16/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else if(subTotal>=3000 && subTotal<5000)
		{
			tax=subTotal*21/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else if(subTotal>=5000)
		{
			tax=subTotal*27/100;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}
		else 
		{
			tax=2;
			System.out.println("\t\t\t\t Tax :  "+tax);
		}

		if(subTotal>=500 && subTotal<1000)
		{
			discount=subTotal*10/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else if(subTotal>=1000 && subTotal<1500)
		{
			discount=subTotal*14/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else if(subTotal>=1500 && subTotal<2000)
		{
			discount=subTotal*18/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else if(subTotal>=2000 && subTotal<3000)
		{
			discount=subTotal*23/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else if(subTotal>=3000 && subTotal<5000)
		{
			discount=subTotal*28/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else if(subTotal>=5000)
		{
			discount=subTotal*35/100;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		else {
			discount=3;
			System.out.println("\t\t\t\t Discount :  "+discount);
		}
		
		int gTotal=subTotal+tax-discount;
		System.out.println("\t\t\t\t---------------------");
		System.out.println("\t\t\t\t Total Bill :  "+(gTotal));
		System.out.println("\t\t\t\t---------------------");
		System.out.println("\t\t\t==============================");

		System.out.println("\t\t\t******* 𝐓𝐇𝐍𝐊 𝐘𝐎𝐔 ! *******");
		LocalDateTime date = LocalDateTime.now();
		try
		{
			File f=new File("Restauret.txt");
			if(!(f.exists()))
			{
				f.createNewFile();
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f));
				String data="\n\t OdrerID \t\tCName \t\t  CPhNo   \t\t    Amount   \t\t    Date-Time";
				String lines="\n---------------------------------------------------------------------------------------------------------";
				byte arr[]=data.getBytes();
				byte arr1[]=lines.getBytes();
				bos.write(arr);
				bos.write(arr1);
				bos.close();
			}				

			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f,true));
			String data1="\n\t"+id+"  \t\t"+name+"  \t\t"+ phNo +"    \t\t "+gTotal+"  \t\t"+date;
			byte arr1[]=data1.getBytes();
			bos.write(arr1);								
			bos.close();				
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}			 
	}
}
