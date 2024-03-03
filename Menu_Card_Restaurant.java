package Restaurant;

import java.time.LocalTime;

import RestaurantInterface.Menu_Interface;

public class Menu_Card_Restaurant extends Tiffins implements Menu_Interface
{
	static int a=1;
	@Override
	public void meth1(){
		LocalTime Time = LocalTime.now();      
		LocalTime start1 = LocalTime.of(6, 30);
		LocalTime end1 = LocalTime.of(10, 30);
		LocalTime start2 = LocalTime.of(12, 30);
		LocalTime end2 = LocalTime.of(15, 00);
		LocalTime start3 = LocalTime.of(19,30);
		LocalTime end3 = LocalTime.of(23, 00);
		if(Time.isAfter(start1) && Time.isBefore(end1)){
			System.out.println("\t<--------- Menu Card -----------> ");
			System.out.println("\n\t\t1.Tiffins");
			System.out.println("\t\t   000.Exit");	
			while(a<2){
				System.out.print("\n\tPlease enter the valid number: ");
				int n =sc.nextInt();
				switch(n){
					case 1:
						tiffins();					
					 break;
					 case 000:
						System.exit(0);	
					default:
						System.err.println("\n\tChoose Valid Option....!\n");
						int b=1;
						if(b<=1){
							meth1();
							a--;
							b++;
						}
					 break;
				}a++;
			}			
	    }else if(Time.isAfter(start2) && Time.isBefore(end2)){
			System.out.println("\tChoose Your Option....! ");
			System.out.println("\n\t\t1.Veg");
			System.out.println("\t\t2.Non-Veg");
			System.out.println("\t\t3.Soft Drinks");
			System.out.println("\t\t   000.Exit");	
			while(a<2){
				System.out.print("\n\tPlease enter the valid number: ");
				int n =sc.nextInt();
				switch(n) {
					case 1:
						pureVeg();
						break;	
					case 2:
						nonVeg();
						break; 
					case 3:
						softDrinks();
						break;
					case 000:
						System.exit(0);
					default:
						System.err.println("\n\tChoose Valid Option....!\n");
						int b=1;
						if(b<=1){
							meth1();
							a--;
							b++;
						}
						break;
				}a++;
			}			
	    }else if(Time.isAfter(start3) && Time.isBefore(end3)){
			System.out.println("\tChoose Your Option....! ");
			System.out.println("\n\t\t1.Tiffins");
			System.out.println("\t\t2.Veg");
			System.out.println("\t\t3.Non-Veg");
			System.out.println("\t\t4.Soft Drinks");
			System.out.println("\t\t   000.Exit");	
			while(a<2){
				System.out.print("\n\tPlease enter the valid number: ");
				int n =sc.nextInt();
				switch(n){
					case 1:
						tiffins();					
					 break;
					 case 2:
						pureVeg();
						break;
					case 3:
						nonVeg();							
						break;
					case 4:
						softDrinks();
						break;
					case 000:
						System.exit(0);
					default:
						System.err.println("\n\tChoose Valid Option....!\n");
						int b=1;
						if(b<=1){
							meth1();
							a--;
							b++;
						}
					break;
				}a++;
			}
		}else {
			LocalTime start11 = LocalTime.of(10, 30);
			LocalTime end11 = LocalTime.of(12, 30);
			LocalTime start22 = LocalTime.of(15, 00);
			LocalTime end22 = LocalTime.of(19, 30);
			if(Time.isAfter(start11) && Time.isBefore(end11)) {
				LocalTime start0 = LocalTime.of(12,00);
				LocalTime end0 = LocalTime.of(12, 30);
				if(Time.isAfter(start0) && Time.isBefore(end0)) {
					System.out.println("\t\tPlease wait few Minutes......!");
					System.exit(0);
				}else {
					System.out.println("\t\tIt's Preparing Time for Food \n\t\t Visit Agian After 12:30 pm");
					System.exit(0);
				}	
			}else if(Time.isAfter(start22) && Time.isBefore(end22)) {
				LocalTime start00 = LocalTime.of(19,00);
				LocalTime end00 = LocalTime.of(19, 30);
				if(Time.isAfter(start00) && Time.isBefore(end00)) {
					System.out.println("\t\tPlease wait few Minutes......!");
					System.exit(0);
				}else {
					System.out.println("\t\tIt's Preparing Time for Food \n\t\t Visit Agian After 07:30 pm");
					System.exit(0);
				}
			}else {
				System.out.println("\t\tRestaurent is Closed");
				System.exit(0);
			}
		}		
	}
	
	@Override
	public void tiffins()
	{
		System.out.println("\n\tPlease Choose Your Option");
		System.out.println("\n\t\t\t1.Tiffin");
		System.out.println("\t\t\t2.Morning Beverages");
		System.out.print("\t111.Previous Menu");
		System.out.println("\t\t000.Exit");
		while(a<2){
			System.out.print("\n\tPlease enter the valid number: ");
			int i =sc.nextInt();
			switch(i){
				case 1:
					tiffin();
					break; 
				case 2:
					teas();
					break; 
				case 111:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\tChoose Valid Option....!");
					int b=1;
					if(b<=1){
						tiffins();
						a--;
						b++;
					}
				break;
			}a++;
		}		
	}
}
