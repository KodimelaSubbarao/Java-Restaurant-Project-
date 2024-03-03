//package Restaurant;
//import java.text.SimpleDateFormat;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//
//public class Testing extends Bill_Pay
//{
//
//	public static void main(String[] args) 
//	{
//		
//		try
//		{
//			File f=new File("Restauret.txt");
////			if(!(f.exists()))
////				f.createNewFile();
//			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f,true));
//			String data=" S.No \t  CName \t CPhNo \t MailId \t Amount";
//			
//			byte arr[]=data.getBytes();
//			bos.write(arr);
//			bos.close();
//		}
//		catch(Exception e)
//		{
//			System.err.println(e.toString());
//		}
//		
////		int grandTotal=501;
////		if(grandTotal>500 && grandTotal<2000)
////		{
////			int tax=grandTotal*3/100;
////			System.out.println(tax);
////			System.out.println("\t\t\t\t Tax :  "+tax);
////		}
////		else if(grandTotal>2000 && grandTotal<5000)
////		{
////			int tax=7/100;
////			System.out.println("\t\t\t\t Tax :  "+grandTotal*tax);
////		}
////		else
////		{
////			int tax=10/100;
////			System.out.println("\t\t\t\t Tax :  "+grandTotal*tax);
////		}
//		
////		System.out.print("\n\t\t Enter Your Name: ");
////		String name=sc.nextLine();
////		System.out.print("\t\t Enter Your Phone Number: ");
////		int phNo=sc.nextInt();
////		System.out.println("\n\n");
////		System.out.println("\t\t\t KSR Restaurant");
////		System.out.println("\t\t\t----------------");
////		System.out.println("\t\t KSR Restaurant, Ameerpet,");
////		System.out.println("\t\t\t Hyderabad,");
////		System.out.println("\t\t\t TS, 500016");
////		System.out.println("\t\t       (+91) 9121912345 ");
////		System.out.println("        ----------------------------------------------------\t");
////		System.out.println("\t Order ID: 1234"+"\t\t\t Date: "+java.time.LocalDate.now());
////		LocalTime time=LocalTime.now();
////		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
////		System.out.println("\t CName: "+name+"\t\t\t Time: "+time.format(dtf));
////	
//		
//		
//		
//		//		Calendar cal = Calendar.getInstance();  
////		creating a constructor of the SimpleDateFormat class  
////		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
////		getting current date  
////		System.out.println("Today's date: "+sdf.format(cal.getTime()));  
////		creating a constructor of the Format class  
////		displaying full-day name  
////		SimpleDateFormat f = new SimpleDateFormat("EEEE");  
////		String str = f.format(new Date());  
//		//prints day name  
//		
//		System.out.println("Day Name: "+str);  
//		 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
//	        Date date = new Date();
//	        String time=formatter.format(date);
//	        System.out.println(time);
//		Calendar cal = Calendar.getInstance(); //Create Calendar-Object
//		cal.setTime(new Date());               //Set the Calendar to now
//		int hour = cal.get(Calendar.HOUR_OF_DAY); //Get the hour from the calendar
//		System.out.println(hour);
//		if(hour <= 23 && hour >= 8)              // Check if hour is between 8 am and 11pm
//		{
//		     // do whatever you want
//			System.out.println("hi");
//		}
//		   LocalTime currentTime = LocalTime.now();
//	        
//	        // Define the start time and end time for the range
//	        LocalTime startTime = LocalTime.of(6, 0);
//	        LocalTime endTime = LocalTime.of(10, 30);
//	        
//	        // Check if the current time is within the range
//	        if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
//	            System.out.println("The current time is between 6 am to 10:30 am.");
//	        } else {
//	            System.out.println("The current time is not between 6 am to 10:30 am.");
//	        }
//	}
//
//}
