package Restaurant;

public class NonVeg extends Veg
{
	//71
	static void nonVeg()
	{
		System.out.println("\n\tPlease choose anye one what you want...!\n");
		System.out.println("\t\t ▁ ▂ ▄ ▅ ▆ ▇ █ Non-Vegs █ ▇ ▆ ▅ ▄ ▂ ▁");
		System.out.println("\t\t-----------------------------------------\n");
		System.out.println("\t\t1.Non-Veg Curries");
		System.out.println("\t\t2.Non-Veg Fried Rice and Noodles");
		System.out.println("\t\t3.Non-Veg Biryanis");
		System.out.println("\t\t4.Family Packs");
		System.out.println("\t\t5.Non-Veg Tandoori");
		System.out.println("\t\t6.Non-Veg Snacks");
		System.out.println("\t\t7.Non-Veg Soups");
		System.out.println("\t\t    111.Previous Menu");
		System.out.println("\t\t    000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				nvc();
				break;
			case 2:
				nvfn();
				break;
			case 3:
				nvb();				
				break;
			case 4:
				nvfp();				
				break;
			case 5:
				nvt();				
				break;
			case 6:
				nvs();			
				break;
			case 7:
				nvss();
				break;
			case 111:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nonVeg();
				break;
		}
	}
	static void nvc()
	{

		String s1="Non-Veg Curries";
		System.out.println("\n\t\t-------------"+s1+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Chicken Curry (B)       \t120\\-");
		System.out.println("\t2 \t   Chicken Curry (BL)      \t130\\-");
		System.out.println("\t3 \t   Chicken Fry (B)    	 \t125\\-");
		System.out.println("\t4 \t   Chicken Fry (BL) 	 \t140\\-");
		System.out.println("\t5 \t   Butter Chicken          \t150\\-");
		System.out.println("\t6 \t   Mogalai Chicken 	 \t160\\-");
		System.out.println("\t7 \t   Chicken Tikka Masala	 \t170\\-");
		System.out.println("\t8 \t   Wings Curry (4Pcs)  	 \t160\\-");
		System.out.println("\t9 \t   Mutton Curry (Bones)    \t210\\-");
		System.out.println("\t10 \t   Mutton Fry (Bones) 	 \t230\\-");
		System.out.println("\t11 \t   Kadai Mutton	  	 \t250\\-");
		System.out.println("\t12 \t   Prawns Curry	  	 \t140\\-");
		System.out.println("\t13 \t   Prawns Fry	  	 \t150\\-");
		System.out.println("\t14 \t   Fish Curry 	 	 \t130\\-");
		System.out.println("\t15 \t   Fish Fry 	  	 \t150\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa1=sc.nextInt();
			switch(sa1)
			{
				case 1:
					item[71]="Chicken Curry (B)";
					System.out.println("\t\tYou Selected "+item[71]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[71]=sc.nextInt();
					cost[71]=120;
					total[71]=qunty[71]*cost[71];
					break;
				case 2:
					item[72]="Chicken Curry (BL)";
					System.out.println("\t\tYou Selected "+item[72]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[72]=sc.nextInt();
					cost[72]=130;
					total[72]=qunty[72]*cost[72];
					break;
				case 3:
					item[73]="Chicken Fry (B)";
					System.out.println("\t\tYou Selected "+item[73]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[73]=sc.nextInt();
					cost[73]=125;
					total[73]=qunty[73]*cost[73];
					break;
				case 4:
					item[74]="Chicken Fry (BL)";
					System.out.println("\t\tYou Selected "+item[74]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[74]=sc.nextInt();
					cost[74]=140;
					total[74]=qunty[74]*cost[74];
					break;
				case 5:
					item[75]="Butter Chicken";
					System.out.println("\t\tYou Selected "+item[75]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[75]=sc.nextInt();
					cost[75]=150;
					total[75]=qunty[75]*cost[75];
					break;
				case 6:
					item[76]="Mogalai Chicken";
					System.out.println("\t\tYou Selected "+item[76]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[76]=sc.nextInt();
					cost[76]=160;
					total[76]=qunty[76]*cost[76];
					break;
				case 7:
					item[77]="Chicken Tikka Masala";
					System.out.println("\t\tYou Selected "+item[77]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[77]=sc.nextInt();
					cost[77]=170;
					total[77]=qunty[77]*cost[77];
					break;
				case 8:
					item[78]="Wings Curry (4Pcs)";
					System.out.println("\t\tYou Selected "+item[78]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[78]=sc.nextInt();
					cost[78]=160;
					total[78]=qunty[78]*cost[78];
					break;
				case 9:
					item[79]="Mutton Curry (Bones)";
					System.out.println("\t\tYou Selected "+item[79]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[79]=sc.nextInt();
					cost[79]=210;
					total[79]=qunty[79]*cost[79];
					break;
				case 10:
					item[80]="Mutton Fry (Bones)";
					System.out.println("\t\tYou Selected "+item[80]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[80]=sc.nextInt();
					cost[80]=23;
					total[80]=qunty[80]*cost[80];
					break;
				case 11:
					item[81]="Kadai Mutton";
					System.out.println("\t\tYou Selected "+item[81]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[81]=sc.nextInt();
					cost[81]=250;
					total[81]=qunty[81]*cost[81];
					break;
				case 12:
					item[82]="Prawns Curry";
					System.out.println("\t\tYou Selected "+item[82]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[82]=sc.nextInt();
					cost[82]=140;
					total[82]=qunty[82]*cost[82];
					break;
				case 13:
					item[83]="Prawns Fry";
					System.out.println("\t\tYou Selected "+item[83]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[83]=sc.nextInt();
					cost[83]=150;
					total[83]=qunty[83]*cost[83];
					break;
				case 14:
					item[84]="Fish Curry";
					System.out.println("\t\tYou Selected "+item[84]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[84]=sc.nextInt();
					cost[84]=130;
					total[84]=qunty[84]*cost[84];
					break;
				case 15:
					item[85]="Fish Fry";
					System.out.println("\t\tYou Selected "+item[85]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[85]=sc.nextInt();
					cost[85]=150;
					total[85]=qunty[85]*cost[85];
					break;		
				case 111:
					nonVeg();
				break;
				case 222:
					mi.meth1();
				break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					nvc();
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
				int sa2=sc.nextInt();
				a2++;
				switch(sa2)
				{
				case 1:
					nvc();
				break;
				case 111:
					nonVeg();
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
	static void nvfn()
	{
	
		String s2="Non-Veg Fried Rice and Noodles";
		System.out.println("\n\t\t-------------"+s2+"---------------");
		System.out.println("\t S.No \t    	  ItemName        \t\t Price");
		System.out.println("\t----- \t------------------------\t\t-------");
		System.out.println("\t1 \t   Egg Fried Rice         	  \t70\\-");
		System.out.println("\t2 \t   Chicken Fried Rice           \t90\\-");
		System.out.println("\t3 \t   S.P Chicken Fried Rice    	  \t100\\-");
		System.out.println("\t4 \t   Chicken Lollypop Fried Rice  \t110\\-");
		System.out.println("\t5 \t   Chicken Schezwan Fried Rice  \t130\\-");
		System.out.println("\t6 \t   Egg Noodles 		          \t60\\-");
		System.out.println("\t7 \t   Chicken Fried Noodles 	  \t70\\-");
		System.out.println("\t8 \t   Chicken Schezwan Noodles	  \t120\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		
		int sa2=sc.nextInt();
			switch(sa2)
			{
				case 1:
					item[86]="Egg Fried Rice";
					System.out.println("\t\tYou Selected "+item[86]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[86]=sc.nextInt();
					cost[86]=70;
					total[86]=qunty[86]*cost[86];
					break;
				case 2:
					item[87]="Chicken Fried Rice";
					System.out.println("\t\tYou Selected "+item[87]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[87]=sc.nextInt();
					cost[87]=90;
					total[87]=qunty[87]*cost[87];
					break;
				case 3:
					item[88]="S.P Chicken Fried Rice";
					System.out.println("\t\tYou Selected "+item[88]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[88]=sc.nextInt();
					cost[88]=100;
					total[88]=qunty[88]*cost[88];
					break;
				case 4:
					item[89]="Chicken Lollypop Fried Rice";
					System.out.println("\t\tYou Selected "+item[89]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[89]=sc.nextInt();
					cost[89]=110;
					total[89]=qunty[89]*cost[89];
					break;
				case 5:
					item[90]="Chicken Schezwan Fried Rice";
					System.out.println("\t\tYou Selected "+item[90]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[90]=sc.nextInt();
					cost[90]=130;
					total[90]=qunty[90]*cost[90];
					break;
				case 6:
					item[91]="Egg Noodles";
					System.out.println("\t\tYou Selected "+item[91]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[91]=sc.nextInt();
					cost[91]=60;
					total[91]=qunty[91]*cost[91];
					break;
				case 7:
					item[92]="Chicken Fried Noodles";
					System.out.println("\t\tYou Selected "+item[92]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[92]=sc.nextInt();
					cost[92]=70;
					total[92]=qunty[92]*cost[92];
					break;
				case 8:
					item[93]="Chicken Schezwan Noodles";
					System.out.println("\t\tYou Selected "+item[93]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[93]=sc.nextInt();
					cost[93]=120;
					total[93]=qunty[93]*cost[93];
					break;		
				case 111:
					nonVeg();
				break;
				case 222:
					mi.meth1();
				break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					nvfn();
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
					nvfn();
				break;
				case 111:
					nonVeg();
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
static void nvb()
{
	String s3="Non-Veg Biryanis";
	System.out.println("\n\t\t-------------"+s3+"---------------");
	System.out.println("\t S.No \t    	      ItemName       \t\t Price");
	System.out.println("\t-----  \t--------------------------\t\t-------");
	System.out.println("\t1 \t   Plain Biryani          	 \t120\\-");
	System.out.println("\t2 \t   Egg Biryani             	 \t130\\-");
	System.out.println("\t3 \t   Chicken Dum Biryani         	\t140\\-");
	System.out.println("\t4 \t   S.P Chicken Biryani 		 \t150\\-");
	System.out.println("\t5 \t   Fried Wings Biryani         	\t170\\-");
	System.out.println("\t6 \t   Lollypop Biryani 		 \t170\\-");
	System.out.println("\t7 \t   Chicken Fry Pcs Biryani	 \t160\\-");
	System.out.println("\t8 \t   Chicken Liver Biryani	 \t160\\-");
	System.out.println("\t9 \t   Chicken Mogalai Biryani 	 \t190\\-");
	System.out.println("\t10 \t   Chicken Tikka Biryani  	\t199\\-");
	System.out.println("\t11 \t   Natukodi Biryani	  	     \t210\\-");
	System.out.println("\t12 \t   Chicken Ulavacharu Biryani  	\t230\\-");
	System.out.println("\t13 \t   Joint Biryani	  	 \t230\\-");
	System.out.println("\t14 \t   Mutton Biryani 		 \t310\\-");
	System.out.println("\t15 \t   Mutton Keema Biryani 	 \t320\\-");
	System.out.println("\t16 \t   Prawns Biryani 	  	 \t260\\-");
	System.out.println("\t17 \t   Fish Biryani (BL)	  	 \t180\\-");
	System.out.print("\n\t111.Previous Menu");
	System.out.print("\t222.Main Menu");
	System.out.println("\t  000.Exit");
	System.out.print("\n\tPlease enter the number only : ");
	int sa3=sc.nextInt();
		switch(sa3)
		{
			case 1:
				item[94]="Plain Biryani";
				System.out.println("\t\tYou Selected "+item[94]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[94]=sc.nextInt();
				cost[94]=120;
				total[94]=qunty[94]*cost[94];
				break;
			case 2:
				item[95]="Egg Biryani";
				System.out.println("\t\tYou Selected "+item[95]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[95]=sc.nextInt();
				cost[95]=130;
				total[95]=qunty[95]*cost[95];
				break;
			case 3:
				item[96]="Chicken Dum Biryani";
				System.out.println("\t\tYou Selected "+item[96]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[96]=sc.nextInt();
				cost[96]=140;
				total[96]=qunty[96]*cost[96];
				break;
			case 4:
				item[97]="S.P Chicken Biryani";
				System.out.println("\t\tYou Selected "+item[97]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[97]=sc.nextInt();
				cost[97]=150;
				total[97]=qunty[97]*cost[97];
				break;
			case 5:
				item[98]="Fried Wings Biryani";
				System.out.println("\t\tYou Selected "+item[98]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[98]=sc.nextInt();
				cost[98]=170;
				total[98]=qunty[98]*cost[98];
				break;
			case 6:
				item[99]="Lollypop Biryani";
				System.out.println("\t\tYou Selected "+item[99]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[99]=sc.nextInt();
				cost[99]=170;
				total[99]=qunty[99]*cost[99];
				break;
			case 7:
				item[100]="Chicken Fry Pcs Biryani";
				System.out.println("\t\tYou Selected "+item[100]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[100]=sc.nextInt();
				cost[100]=160;
				total[100]=qunty[100]*cost[100];
				break;
			case 8:
				item[101]="Chicken Liver Biryani";
				System.out.println("\t\tYou Selected "+item[101]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[101]=sc.nextInt();
				cost[101]=160;
				total[101]=qunty[10]*cost[101];
				break;
			case 9:
				item[102]="Chicken Mogalai Biryani";
				System.out.println("\t\tYou Selected "+item[102]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[102]=sc.nextInt();
				cost[102]=190;
				total[102]=qunty[102]*cost[102];
				break;
			case 10:
				item[103]="Chicken Tikka Biryani";
				System.out.println("\t\tYou Selected "+item[103]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[103]=sc.nextInt();
				cost[103]=199;
				total[103]=qunty[103]*cost[103];
				break;
			case 11:
				item[104]="Natukodi Biryani";
				System.out.println("\t\tYou Selected "+item[104]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[104]=sc.nextInt();
				cost[104]=210;
				total[104]=qunty[104]*cost[104];
				break;
			case 12:
				item[105]="Chicken Ulavacharu Biryani";
				System.out.println("\t\tYou Selected "+item[105]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[105]=sc.nextInt();
				cost[105]=230;
				total[105]=qunty[105]*cost[105];
				break;
			case 13:
				item[106]="Joint Biryani";
				System.out.println("\t\tYou Selected "+item[106]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[106]=sc.nextInt();
				cost[106]=230;
				total[106]=qunty[106]*cost[106];
				break;
			case 14:
				item[107]="Mutton Biryani";
				System.out.println("\t\tYou Selected "+item[107]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[107]=sc.nextInt();
				cost[107]=310;
				total[107]=qunty[107]*cost[107];
				break;
			case 15:
				item[108]="Mutton Keema Biryani";
				System.out.println("\t\tYou Selected "+item[108]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[108]=sc.nextInt();
				cost[108]=320;
				total[108]=qunty[108]*cost[108];
				break;
			case 16:
				item[109]="Prawns Biryani";
				System.out.println("\t\tYou Selected "+item[109]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[109]=sc.nextInt();
				cost[109]=260;
				total[109]=qunty[109]*cost[109];
				break;
			case 17:
				item[110]="Fish Biryani (BL)";
				System.out.println("\t\tYou Selected "+item[110]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[110]=sc.nextInt();
				cost[110]=180;
				total[110]=qunty[110]*cost[110];
				break;
			case 111:
				nonVeg();
			break;
			case 222:
				mi.meth1();
			break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nvb();
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
			int sa2=sc.nextInt();
			a2++;
			switch(sa2)
			{
			case 1:
				nvb();
			break;
			case 111:
				nonVeg();
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
static void nvfp()
{
	String s4="Family Packss";
	System.out.println("\n\t\t-------------"+s4+"---------------");
	System.out.println("\t S.No \t    	   ItemName         \t\t Price");
	System.out.println("\t----- \t--------------------------\t\t-------");
	System.out.println("\t1 \t   Full Family Pack         	\t620\\-");
	System.out.println("\t  \t   (2 Chicken Biryani, NV Curry");
	System.out.println("\t  \t    2Pcs BN, Curd Rice)");
	System.out.println("\n\t2 \t   Mini Family Pack           	\t330\\-");
	System.out.println("\t  \t    (1 Chicken Biryani, 1 Roti");
	System.out.println("\t  \t    1/2 Biryani Rice, 1/2 NV Curry");
	System.out.println("\n\t3 \t   Veg Family Pack   		 \t479\\- ");
	System.out.println("\t  \t    (2 Biryani Rice,1/2 PBM Curry");
	System.out.println("\t  \t     2 Pcs BN, Curd Rice");
	System.out.println("\n\t4 \t   Bucket Biryani		 \t710\\- ");
	System.out.println("\n\t5 \t   Bucket Biryani (Small)           \t420\\-");
	System.out.print("\n\t111.Previous Menu");
	System.out.print("\t222.Main Menu");
	System.out.println("\t  000.Exit");
	System.out.print("\n\tPlease enter the number only : ");
	int sa4=sc.nextInt();
		switch(sa4)
		{
			case 1:
				item[111]="Full Family Pack";
				System.out.println("\t\tYou Selected "+item[111]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[111]=sc.nextInt();
				cost[111]=620;
				total[111]=qunty[111]*cost[111];
				break;
			case 2:
				item[112]="Mini Family Pack";
				System.out.println("\t\tYou Selected "+item[112]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[112]=sc.nextInt();
				cost[112]=330;
				total[112]=qunty[112]*cost[112];
				break;
			case 3:
				item[113]="Veg Family Pack";
				System.out.println("\t\tYou Selected "+item[113]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[113]=sc.nextInt();
				cost[113]=479;
				total[113]=qunty[113]*cost[113];
				break;
			case 4:
				item[114]="Bucket Biryani";
				System.out.println("\t\tYou Selected "+item[114]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[114]=sc.nextInt();
				cost[114]=710;
				total[114]=qunty[114]*cost[114];
				break;
			case 5:
				item[115]="Bucket Biryani (Small)";
				System.out.println("\t\tYou Selected "+item[115]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[115]=sc.nextInt();
				cost[115]=420;
				total[115]=qunty[115]*cost[115];
				break;
			case 111:
				nonVeg();
			break;
			case 222:
				mi.meth1();
			break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nvfp();
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
			int sa2=sc.nextInt();
			a2++;
			switch(sa2)
			{
			case 1:
				nvfp();
			break;
			case 111:
				nonVeg();
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
static void nvt()
{
	String s5="Non-Veg Tandoori";
	System.out.println("\n\t\t-------------"+s5+"---------------");
	System.out.println("\t S.No \t    	ItemName    \t\t Price");
	System.out.println("\t----- \t------------------\t\t-------");
	System.out.println("\t1 \t   Chicken Tikka          \t120\\-");
	System.out.println("\t2 \t   Tangdi Kebab           \t150\\-");
	System.out.println("\t3 \t   Reshmi Kebab    	\t155\\-");
	System.out.println("\t4 \t   Murg Malai Kebab	\t170\\-");
	System.out.println("\t5 \t   Tandoori Chicken Full  \t249\\-");
	System.out.println("\t6 \t   Tandoori Chicken Half\t145\\-");
	System.out.println("\t7 \t   Garlic Kebab		  \t189\\-");
	System.out.println("\t8 \t   Green Chilli Kabab	  \t199\\-");
	System.out.print("\n\t111.Previous Menu");
	System.out.print("\t222.Main Menu");
	System.out.println("\t  000.Exit");
	System.out.print("\n\tPlease enter the number only : ");
	int sa5=sc.nextInt();
		switch(sa5)
		{
			case 1:
				item[116]="Chicken Tikka";
				System.out.println("\t\tYou Selected "+item[116]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[116]=sc.nextInt();
				cost[116]=120;
				total[116]=qunty[116]*cost[116];
				break;
			case 2:
				item[117]="Tangdi Kebab";
				System.out.println("\t\tYou Selected "+item[117]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[117]=sc.nextInt();
				cost[117]=150;
				total[117]=qunty[117]*cost[117];
				break;
			case 3:
				item[118]="Reshmi Kebab";
				System.out.println("\t\tYou Selected "+item[118]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[118]=sc.nextInt();
				cost[118]=155;
				total[118]=qunty[118]*cost[118];
				break;
			case 4:
				item[119]="Murg Malai Kebab";
				System.out.println("\t\tYou Selected "+item[119]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[119]=sc.nextInt();
				cost[119]=170;
				total[119]=qunty[119]*cost[119];
				break;
			case 5:
				item[120]="Tandoori Chicken Full";
				System.out.println("\t\tYou Selected "+item[120]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[120]=sc.nextInt();
				cost[120]=249;
				total[120]=qunty[120]*cost[120];
				break;
			case 6:
				item[121]="Tandoori Chicken Half";
				System.out.println("\t\tYou Selected "+item[121]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[121]=sc.nextInt();
				cost[121]=145;
				total[121]=qunty[121]*cost[121];
				break;
			case 7:
				item[122]="Garlic Kebab";
				System.out.println("\t\tYou Selected "+item[122]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[122]=sc.nextInt();
				cost[122]=189;
				total[122]=qunty[122]*cost[122];
				break;
			case 8:
				item[123]="Green Chilli Kabab";
				System.out.println("\t\tYou Selected "+item[123]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[123]=sc.nextInt();
				cost[123]=199;
				total[123]=qunty[123]*cost[123];
				break;
			case 111:
				nonVeg();
			break;
			case 222:
				mi.meth1();
			break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nvt();
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
			int sa2=sc.nextInt();
			a2++;
			switch(sa2)
			{
			case 1:
				nvt();
			break;
			case 111:
				nonVeg();
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
static void nvs()
{
	String s6="Non-Veg Snacks";
	System.out.println("\n\t\t-------------"+s6+"---------------");
	System.out.println("\t S.No \t    	  ItemName       \t\t Price");
	System.out.println("\t----- \t------------------------\t\t--------");
	System.out.println("\t1 \t   Chilli Chicken       	\t150\\-");
	System.out.println("\t2 \t   Chicken 65          		 \t160\\-");
	System.out.println("\t3 \t   Chicken Manchurian   	\t150\\-");
	System.out.println("\t4 \t   Chicken Majestic 		 \t170\\-");
	System.out.println("\t5 \t   Chicken Deumstickes(4Pcs)   	\t190\\-");
	System.out.println("\t6 \t   Chilli Wings  		\t190\\-");
	System.out.println("\t7 \t   Chicken 555		  	\t180\\-");
	System.out.println("\t8 \t   Spicy Fried Chicken	  	 \t190\\-");
	System.out.println("\t9 \t   Garlic Chicken 	  	     \t170\\-");
	System.out.println("\t10 \t  Chicken Hawai 	  	\t209\\-");
	System.out.println("\t11 \t  Red Pepper Chicken 	  	 \t200\\-");
	System.out.println("\t12 \t  Dragen Chicken 	  	\t249\\-");
	System.out.println("\t13 \t  Chilli Mutton	  		\t260\\-");
	System.out.println("\t14 \t  Mutton manchurian / 65 	 \t260\\-");
	System.out.println("\t15 \t  Mutton Keema Balls 	  	 \t299\\-");
	System.out.println("\t16 \t  Chilli Prawns  	  	\t160\\-");
	System.out.println("\t17 \t  Prawns Mancurian 	  	\t160\\-");
	System.out.println("\t18 \t  Golden Fried Prawns 	  	 \t170\\-");
	System.out.println("\t19 \t  Dragan Prawns 	  	\t170\\-");
	System.out.println("\t20 \t  Chilli Fish 	  		 \t140\\-");
	System.out.println("\t21 \t  Fish Manchurian 	  	\t140\\-");
	System.out.println("\t22 \t  Fried Fish 	  		\t150\\-");
	System.out.print("\n\t111.Previous Menu");
	System.out.print("\t222.Main Menu");
	System.out.println("\t  000.Exit");
	System.out.print("\n\tPlease enter the number only : ");
	int sa6=sc.nextInt();
		switch(sa6)
		{
			case 1:
				item[124]="Chilli Chicken ";
				System.out.println("\t\tYou Selected "+item[124]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[124]=sc.nextInt();
				cost[124]=150;
				total[124]=qunty[124]*cost[124];
				break;
			case 2:
				item[125]="Chicken 65";
				System.out.println("\t\tYou Selected "+item[125]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[125]=sc.nextInt();
				cost[125]=160;
				total[125]=qunty[125]*cost[125];
				break;
			case 3:
				item[126]="Chicken Manchurian";
				System.out.println("\t\tYou Selected "+item[126]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[126]=sc.nextInt();
				cost[126]=150;
				total[126]=qunty[126]*cost[126];
				break;
			case 4:
				item[127]="Chicken Majestic";
				System.out.println("\t\tYou Selected "+item[127]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[127]=sc.nextInt();
				cost[127]=170;
				total[127]=qunty[127]*cost[127];
				break;
			case 5:
				item[128]="Chicken Deumstickes(4Pcs)";
				System.out.println("\t\tYou Selected "+item[128]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[128]=sc.nextInt();
				cost[128]=190;
				total[128]=qunty[128]*cost[128];
				break;
			case 6:
				item[129]="Chilli Wings";
				System.out.println("\t\tYou Selected "+item[129]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[129]=sc.nextInt();
				cost[129]=190;
				total[129]=qunty[129]*cost[129];
				break;
			case 7:
				item[130]="Chicken 555";
				System.out.println("\t\tYou Selected "+item[130]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[130]=sc.nextInt();
				cost[130]=180;
				total[130]=qunty[130]*cost[130];
				break;
			case 8:
				item[131]="Spicy Fried Chicken";
				System.out.println("\t\tYou Selected "+item[131]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[131]=sc.nextInt();
				cost[131]=190;
				total[131]=qunty[131]*cost[131];
				break;
			case 9:
				item[132]="Garlic Chicken";
				System.out.println("\t\tYou Selected "+item[132]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[132]=sc.nextInt();
				cost[132]=170;
				total[132]=qunty[132]*cost[132];
				break;
			case 10:
				item[133]="Chicken Hawai";
				System.out.println("\t\tYou Selected "+item[133]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[133]=sc.nextInt();
				cost[133]=209;
				total[133]=qunty[133]*cost[133];
				break;
			case 11:
				item[134]="Red Pepper Chicken";
				System.out.println("\t\tYou Selected "+item[134]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[134]=sc.nextInt();
				cost[134]=200;
				total[134]=qunty[134]*cost[134];
				break;
			case 12:
				item[135]="Dragen Chicken";
				System.out.println("\t\tYou Selected "+item[135]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[135]=sc.nextInt();
				cost[135]=249;
				total[135]=qunty[135]*cost[135];
				break;
			case 13:
				item[136]="Chilli Mutton";
				System.out.println("\t\tYou Selected "+item[136]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[136]=sc.nextInt();
				cost[136]=260;
				total[136]=qunty[136]*cost[136];
				break;
			case 14:
				item[137]="Mutton manchurian/65 ";
				System.out.println("\t\tYou Selected "+item[137]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[137]=sc.nextInt();
				cost[137]=260;
				total[137]=qunty[137]*cost[137];
				break;
			case 15:
				item[138]="Mutton Keema Balls";
				System.out.println("\t\tYou Selected "+item[138]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[138]=sc.nextInt();
				cost[138]=299;
				total[138]=qunty[138]*cost[138];
				break;
			case 16:
				item[139]="Chilli Prawns";
				System.out.println("\t\tYou Selected "+item[139]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[139]=sc.nextInt();
				cost[139]=160;
				total[139]=qunty[139]*cost[139];
				break;
			case 17:
				item[140]="Prawns Mancurian";
				System.out.println("\t\tYou Selected "+item[140]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[140]=sc.nextInt();
				cost[140]=160;
				total[140]=qunty[140]*cost[140];
				break;
			case 18:
				item[141]="Golden Fried Prawns";
				System.out.println("\t\tYou Selected "+item[141]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[141]=sc.nextInt();
				cost[141]=170;
				total[141]=qunty[141]*cost[141];
				break;
			case 19:
				item[142]="Dragan Prawns";
				System.out.println("\t\tYou Selected "+item[142]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[142]=sc.nextInt();
				cost[142]=170;
				total[142]=qunty[142]*cost[142];
				break;
			case 20:
				item[143]="Chilli Fish";
				System.out.println("\t\tYou Selected "+item[143]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[143]=sc.nextInt();
				cost[143]=140;
				total[143]=qunty[143]*cost[143];
				break;
			case 21:
				item[144]="Fish Manchurian";
				System.out.println("\t\tYou Selected "+item[144]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[144]=sc.nextInt();
				cost[144]=140;
				total[144]=qunty[144]*cost[144];
				break;
			case 22:
				item[145]="Fried Fish";
				System.out.println("\t\tYou Selected "+item[145]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[145]=sc.nextInt();
				cost[145]=150;
				total[145]=qunty[145]*cost[145];
				break;
			case 111:
				nonVeg();
			break;
			case 222:
				mi.meth1();
			break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nvs();
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
			int sa2=sc.nextInt();
			a2++;
			switch(sa2)
			{
			case 1:
				nvs();
			break;
			case 111:
				nonVeg();
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
static void nvss()
{
	String s7="Non-Veg Soups";
	System.out.println("\n\t\t-------------"+s7+"---------------");
	System.out.println("\t S.No \t    	   ItemName      \t\tPrice");
	System.out.println("\t----- \t------------------------\t       -------");
	System.out.println("\t1 \t   Chicken Corn Soup            \t90\\-");
	System.out.println("\t2 \t   Chicken Hot & Sour Soup      \t110\\-");
	System.out.println("\t3 \t   Chicken Clear Soup    	 \t90\\-");
	System.out.println("\t4 \t   Chicken Manchow Soup 	 \t100\\-");
	System.out.println("\t5 \t   Chicken Tomyam Soup          \t100\\-");
	System.out.println("\t6 \t   Mutton Soup 			 \t150\\-");
	System.out.print("\n\t111.Previous Menu");
	System.out.print("\t222.Main Menu");
	System.out.println("\t  000.Exit");
	System.out.print("\n\tPlease enter the number only : ");
	int sa7=sc.nextInt();
		switch(sa7)
		{
			case 1:
				item[146]="Chicken Corn Soup";
				System.out.println("\t\tYou Selected "+item[146]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[146]=sc.nextInt();
				cost[146]=90;
				total[146]=qunty[146]*cost[146];
				break;
			case 2:
				item[147]="Chicken Hot & Sour Soup";
				System.out.println("\t\tYou Selected "+item[147]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[147]=sc.nextInt();
				cost[147]=110;
				total[147]=qunty[147]*cost[147];
				break;
			case 3:
				item[148]="Chicken Clear Soup";
				System.out.println("\t\tYou Selected "+item[148]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[148]=sc.nextInt();
				cost[148]=90;
				total[148]=qunty[148]*cost[148];
				break;
			case 4:
				item[149]="Chicken Manchow Soup";
				System.out.println("\t\tYou Selected "+item[149]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[149]=sc.nextInt();
				cost[149]=100;
				total[149]=qunty[149]*cost[149];
				break;
			case 5:
				item[150]="Chicken Tomyam Soup";
				System.out.println("\t\tYou Selected "+item[150]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[150]=sc.nextInt();
				cost[150]=100;
				total[150]=qunty[150]*cost[150];
				break;
			case 6:
				item[151]="Mutton Soup";
				System.out.println("\t\tYou Selected "+item[151]);							
				System.out.print("\tEnter how many cups you want you : ");
				qunty[151]=sc.nextInt();
				cost[151]=150;
				total[151]=qunty[151]*cost[151];
				break;
			case 111:
				nonVeg();
			break;
			case 222:
				mi.meth1();
			break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				nvss();
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
			int sa2=sc.nextInt();
			a2++;
			switch(sa2)
			{
			case 1:
				nvss();
			break;
			case 111:
				nonVeg();
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
	public static void main(String[] args) 
	{
		nonVeg();
	}
}
