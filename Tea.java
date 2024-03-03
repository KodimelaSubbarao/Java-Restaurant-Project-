package Restaurant;
public class Tea extends NonVeg
{
	//37
	static void teas()
	{
		System.out.println("\n\t\t꧁༒༺ Morning Beverages ༻༒꧂");
		System.out.println("\t\t-------------------------------");
		System.out.println("\t\t1.Tea's");
		System.out.println("\t\t2.Coffee's");
		System.out.println("\t\t3.Milk Bevarages");
		System.out.println("\t\t4.Cold Shakes");
		System.out.println("\t\t5.Lassi\n");
		System.out.print("\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\t\tPlease enter the number only : ");
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				tea();
			break;
			case 2:
				coffee();
			break;
			case 3:
				mb();
			break;
			case 4:
				cs();
			break;
			case 5:
				lassi();
				break;
			case 111:
				mi.tiffins();
			break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				teas();
			break;
		}
	}
	static void tea()
	{
		String s1="Tea's";
		System.out.println("\n\t\t-------------"+s1+"---------------");
		System.out.println("\t S.No \t      ItemName        \t\t Price");
		System.out.println("\t------\t--------------------\t\t-------");
		System.out.println("\t1 \t    Kadak Chai       	\t10\\-");
		System.out.println("\t2 \t    Lemon Tea       	\t15\\-");
		System.out.println("\t3 \t    Green Tea       	\t15\\-");
		System.out.println("\t4 \t    Tulsi Tea       	\t15\\-");
		System.out.println("\t5 \t    Ginger Chai      	\t15\\-");
		System.out.println("\t6 \t    Masala Chai      	\t20\\-");
		System.out.println("\t7 \t    Elaichi Chai     	\t20\\-");
		System.out.println("\t8 \t    Badam Chai       	\t25\\-");	
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa1=sc.nextInt();
			switch(sa1)
			{
				case 1:
					item[37]="Kadak Chai";
					System.out.println("\t\tYou Selected "+item[37]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[37]=sc.nextInt();
					cost[37]=10;
					total[37]=qunty[37]*cost[37];
					break;
				case 2:
					item[38]="Lemon Tea";
					System.out.println("\t\tYou Selected "+item[38]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[38]=sc.nextInt();
					cost[38]=15;
					total[38]=qunty[38]*cost[38];
					break;
				case 3:
					item[39]="Green Tea";
					System.out.println("\t\tYou Selected "+item[39]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[39]=sc.nextInt();
					cost[39]=15;
					total[39]=qunty[39]*cost[39];
					break;
				case 4:
					item[40]="Tulsi Tea ";
					System.out.println("\t\tYou Selected "+item[40]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[40]=sc.nextInt();
					cost[40]=15;
					total[40]=qunty[40]*cost[40];
					break;
				case 5:
					item[41]="Ginger Chai";
					System.out.println("\t\tYou Selected "+item[41]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[41]=sc.nextInt();
					cost[41]=15;
					total[41]=qunty[41]*cost[41];
					break;
				case 6:
					item[42]="Masala Chai";
					System.out.println("\t\tYou Selected "+item[42]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[42]=sc.nextInt();
					cost[42]=20;
					total[42]=qunty[42]*cost[42];
					break;
				case 7:
					item[43]="Elaichi Chai";
					System.out.println("\t\tYou Selected "+item[43]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[43]=sc.nextInt();
					cost[43]=20;
					total[43]=qunty[43]*cost[43];
					break;
				case 8:
					item[44]="Badam Chai";
					System.out.println("\t\tYou Selected "+item[44]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[44]=sc.nextInt();
					cost[44]=25;
					total[44]=qunty[44]*cost[44];
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					tea();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.println("\t\t222.Main Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa=sc.nextInt();
				a2++;
				switch(sa)
				{
				case 1:
					tea();
				break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
				break;
				case 333:
					return;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					a2--;
					//break;
				}
			}
	}
	static void coffee()
	{
		String s2="Coffee's";
		System.out.println("\n\t\t-------------"+s2+"---------------");
		System.out.println("\t S.No \t     ItemName     \t\t Price");
		System.out.println("\t------\t------------------\t\t-------");
		System.out.println("\t1 \t    Filter Coffee   	   \t20\\-");
		System.out.println("\t2 \t    Instant Coffee   	   \t20\\-");
		System.out.println("\t3 \t    Black Coffee     	   \t20\\-");
		System.out.println("\t4 \t    Cold Coffee      	   \t30\\-");
		System.out.println("\t5 \t    Chocolate Cold Coffee\t40\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa2=sc.nextInt();
			switch(sa2)
			{
				case 1:
					item[45]="Filter Coffee ";
					System.out.println("\t\tYou Selected "+item[45]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[45]=sc.nextInt();
					cost[45]=20;
					total[45]=qunty[45]*cost[45];							
					break;
				case 2:
					item[46]="Instant Coffee";
					System.out.println("\t\tYou Selected "+item[46]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[46]=sc.nextInt();
					cost[46]=20;
					total[46]=qunty[46]*cost[46];
					break;
				case 3:
					item[47]="Black Coffee";
					System.out.println("\t\tYou Selected "+item[47]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[47]=sc.nextInt();
					cost[47]=20;
					total[47]=qunty[47]*cost[47];
					break;
				case 4:
					item[48]="Cold Coffee";
					System.out.println("\t\tYou Selected "+item[48]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[48]=sc.nextInt();
					cost[48]=30;
					total[48]=qunty[48]*cost[48];
					break;
				case 5:
					item[49]="Chocolate Cold Coffee";
					System.out.println("\t\tYou Selected "+item[49]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[49]=sc.nextInt();
					cost[49]=40;
					total[49]=qunty[49]*cost[49];
					break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					coffee();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.println("\t\t222.Main Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa1=sc.nextInt();
				a2++;
				switch(sa1)
				{
				case 1:
					coffee();
				break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
				break;
				case 333:
					return;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					a2--;
					//break;
				}
			}
	}
	static void mb()
	{
		String s3="Milk Bevarages";
		System.out.println("\n\t\t-------------"+s3+"---------------");
		System.out.println("\t S.No \t     ItemName     \t\t Price");
		System.out.println("\t------\t------------------\t\t-------");
		System.out.println("\t1 \t    Plain Milk   	       \t10\\-");
		System.out.println("\t2 \t    Badam Milk    	   \t20\\-");
		System.out.println("\t3 \t    Horlicks      	   \t20\\-");
		System.out.println("\t4 \t    Boost          	   \t20\\-");
		System.out.println("\t5 \t    Bournvita Milk	   \t20\\-");
		System.out.println("\t6 \t    Cold Badam Milk	   \t30\\-");
		System.out.println("\t7 \t    Hot Chocolate	   \t40\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa3=sc.nextInt();
			switch(sa3)
			{
				case 1:
					item[50]="Plain Milk";
					System.out.println("\t\tYou Selected "+item[50]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[50]=sc.nextInt();
					cost[50]=10;
					total[50]=qunty[50]*cost[50];
					break;
				case 2:
					item[51]="Badam Milk";
					System.out.println("\t\tYou Selected "+item[51]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[51]=sc.nextInt();
					cost[51]=20;
					total[51]=qunty[51]*cost[51];
					break;
				case 3:
					item[52]="Horlicks";
					System.out.println("\t\tYou Selected "+item[52]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[52]=sc.nextInt();
					cost[52]=20;
					total[52]=qunty[52]*cost[52];
					break;
				case 4:
					item[53]="Boost";
					System.out.println("\t\tYou Selected "+item[53]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[53]=sc.nextInt();
					cost[53]=20;
					total[53]=qunty[53]*cost[53];
					break;
				case 5:
					item[54]="Bournvita Milk";
					System.out.println("\t\tYou Selected "+item[54]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[54]=sc.nextInt();
					cost[54]=20;
					total[54]=qunty[54]*cost[54];
					break;
				case 6:
					item[55]="Cold Badam Milk";
					System.out.println("\t\tYou Selected "+item[55]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[55]=sc.nextInt();
					cost[55]=30;
					total[55]=qunty[55]*cost[55];
					break;
				case 7:
					item[56]="Hot Chocolate";
					System.out.println("\t\tYou Selected "+item[56]);							
					System.out.print("\tEnter how many cups  you want you : ");
					qunty[56]=sc.nextInt();
					cost[56]=40;
					total[56]=qunty[56]*cost[56];
					break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					mb();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.println("\t\t222.Main Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa1=sc.nextInt();
				a2++;
				switch(sa1)
				{
				case 1:
					mb();
				break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
				break;
				case 333:
					return;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					a2--;
					//break;
				}
			}
	}
	static void cs()
	{
		String s4="Cold Shakes";
		System.out.println("\n\t\t-------------"+s4+"---------------");
		System.out.println("\t S.No \t     ItemName     \t\t Price");
		System.out.println("\t------\t------------------\t\t-------");
		System.out.println("\t1 \t    Chocolate    	       \t30\\-");
		System.out.println("\t2 \t    Strawberry    	   \t35\\-");
		System.out.println("\t3 \t    Oreo           	   \t35\\-");
		System.out.println("\t4 \t    KitKat          	   \t35\\-");
		System.out.println("\t5 \t    Mango Shake    	   \t40\\-");
		System.out.println("\t6 \t    Green Apple Shake	   \t40\\-");
		System.out.println("\t7 \t    Black Current Shake  \t40\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa4=sc.nextInt();
			switch(sa4)
			{
				case 1:
					item[57]="Chocolate";
					System.out.println("\t\tYou Selected "+item[57]);							
					System.out.print("\tEnter how many "+item[57]+"'s  you want you : ");
					qunty[57]=sc.nextInt();
					cost[57]=30;
					total[57]=qunty[57]*cost[57];
					break;
				case 2:
					item[58]="Strawberry";
					System.out.println("\t\tYou Selected "+item[58]);							
					System.out.print("\tEnter how many "+item[58]+"'s  you want you : ");
					qunty[58]=sc.nextInt();
					cost[58]=35;
					total[58]=qunty[58]*cost[58];
					break;
				case 3:
					item[59]="Oreo";
					System.out.println("\t\tYou Selected "+item[59]);							
					System.out.print("\tEnter how many "+item[59]+"'s  you want you : ");
					qunty[59]=sc.nextInt();
					cost[59]=35;
					total[59]=qunty[59]*cost[59];
					break;
				case 4:
					item[60]="KitKat";
					System.out.println("\t\tYou Selected "+item[60]);							
					System.out.print("\tEnter how many "+item[60]+"'s  you want you : ");
					qunty[60]=sc.nextInt();
					cost[60]=35;
					total[60]=qunty[60]*cost[60];
					break;
				case 5:
					item[61]="Mango Shake ";
					System.out.println("\t\tYou Selected "+item[61]);							
					System.out.print("\tEnter how many "+item[61]+"'s  you want you : ");
					qunty[61]=sc.nextInt();
					cost[61]=40;
					total[61]=qunty[61]*cost[61];
					break;
				case 6:
					item[62]="Green Apple Shake";
					System.out.println("\t\tYou Selected "+item[62]);							
					System.out.print("\tEnter how many "+item[62]+"'s  you want you : ");
					qunty[62]=sc.nextInt();
					cost[62]=40;
					total[62]=qunty[62]*cost[62];
					break;
				case 7:
					item[63]="Black Current Shake";
					System.out.println("\t\tYou Selected "+item[63]);							
					System.out.print("\tEnter how many "+item[63]+"'s  you want you : ");
					qunty[63]=sc.nextInt();
					cost[63]=40;
					total[63]=qunty[63]*cost[63];
					break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					cs();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.println("\t\t222.Main Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa1=sc.nextInt();
				a2++;
				switch(sa1)
				{
				case 1:
					cs();
				break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
				break;
				case 333:
					return;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					a2--;
					//break;
				}
			}
	}
	static void lassi()
	{
		String s5="Lassi";
		System.out.println("\n\t\t-------------"+s5+"---------------");
		System.out.println("\t S.No \t     ItemName     \t\t Price");
		System.out.println("\t------\t------------------\t\t-------");
		System.out.println("\t1 \t    Sweet Lassi   	   \t20\\-");
		System.out.println("\t2 \t    Mango Lassi    	   \t25\\-");
		System.out.println("\t3 \t    ButterScotch Lassi   \t30\\-");
		System.out.println("\t4 \t    Roohafza Lassi   	   \t30\\-");
		System.out.println("\t5 \t    Green Apple Lassi    \t40\\-");
		System.out.println("\t6 \t    Blackcurrant Lassi   \t40\\-");
		System.out.println("\t7 \t    Dry Fruit Lassi      \t50\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa5=sc.nextInt();
			switch(sa5)
			{
				case 1:
					item[64]="Sweet Lassi";
					System.out.println("\t\tYou Selected "+item[64]);							
					System.out.print("\tEnter how many "+item[64]+"'s   you want you : ");
					qunty[64]=sc.nextInt();
					cost[64]=20;
					total[64]=qunty[64]*cost[64];
					break;
				case 2:
					item[65]="Mango Lassi";
					System.out.println("\t\tYou Selected "+item[65]);							
					System.out.print("\tEnter how many "+item[65]+"'s  you want you : ");
					qunty[65]=sc.nextInt();
					cost[65]=25;
					total[65]=qunty[65]*cost[65];
					break;
				case 3:
					item[66]="ButterScotch Lassi";
					System.out.println("\t\tYou Selected "+item[66]);							
					System.out.print("\tEnter how many "+item[66]+"'s  you want you : ");
					qunty[66]=sc.nextInt();
					cost[66]=30;
					total[66]=qunty[66]*cost[66];
					break;
				case 4:
					item[67]="Roohafza Lassi";
					System.out.println("\t\tYou Selected "+item[67]);							
					System.out.print("\tEnter how many "+item[67]+"'s  you want you : ");
					qunty[67]=sc.nextInt();
					cost[67]=30;
					total[67]=qunty[67]*cost[67];
					break;
				case 5:
					item[68]="Green Apple Lassi";
					System.out.println("\t\tYou Selected "+item[68]);							
					System.out.print("\tEnter how many "+item[68]+"'s  you want you : ");
					qunty[68]=sc.nextInt();
					cost[68]=40;
					total[68]=qunty[68]*cost[68];
					break;
				case 6:
					item[69]="Blackcurrant Lassi";
					System.out.println("\t\tYou Selected "+item[69]);							
					System.out.print("\tEnter how many "+item[69]+"'s  you want you : ");
					qunty[69]=sc.nextInt();
					cost[69]=40;
					total[69]=qunty[69]*cost[69];
					break;
				case 7:
					item[70]="Dry Fruit Lassi";
					System.out.println("\t\tYou Selected "+item[70]);							
					System.out.print("\tEnter how many "+item[70]+"'s  you want you : ");
					qunty[70]=sc.nextInt();
					cost[70]=50;
					total[70]=qunty[70]*cost[70];
					break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					lassi();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.println("\t\t222.Main Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa1=sc.nextInt();
				a2++;
				switch(sa1)
				{
				case 1:
					lassi();
				break;
				case 111:
					teas();
				break;
				case 222:
					mi.meth1();
				break;
				case 333:
					return;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					System.err.println("\n\t\t Choose Valid Option......!\n");
					a2--;
					//break;
				}
			}
	}
}
