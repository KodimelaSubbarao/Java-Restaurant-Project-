package Restaurant;

public class Veg extends SoftDrinks
{
	//152
	static void pureVeg()
	{
		System.out.println("\n\tPlease choose anye one what you want...!\n");
		System.out.println("\t\t ▁ ▂ ▄ ▅ ▆ ▇ █ Pure-Vegs █ ▇ ▆ ▅ ▄ ▂ ▁");
		System.out.println("\t\t-----------------------------------------\n");
		System.out.println("\t\t1.Veg Curries");
		System.out.println("\t\t2.Veg Fried Rice and Noodles");
		System.out.println("\t\t3.Veg Biryanis");
		System.out.println("\t\t4.Tandoori Bread");
		System.out.println("\t\t5.Veg Tandoori");
		System.out.println("\t\t6.Veg Snacks");
		System.out.println("\t\t7.Veg Soups");
		System.out.println("\t\t    111.Previous Menu");
		System.out.println("\t\t    000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				vc();
				break;
			case 2:
				vfn();
				break;
			case 3:
				vb();				
				break;
			case 4:
				tb();
				break;
			case 5:
				vt();				
				break;
			case 6:
				vs();
				break;
			case 7:
				vss();
				break;
			case 111:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				pureVeg();
				break;
			
		}
	}
	static void vc()
	{
		String s1="Veg Curries";
		System.out.println("\n\t\t-------------"+s1+"---------------");
		System.out.println("\t S.No \t    	 ItemName     \t\t Price");
		System.out.println("\t----- \t--------------------\t\t-------");
		System.out.println("\t1 \t   Plain Palak       	 \t40\\-");
		System.out.println("\t2 \t   Palak Paneer    	     \t70\\-");
		System.out.println("\t3 \t   Alu Gobi    	 	 \t40\\-");
		System.out.println("\t4 \t   Tamato Curry 	  \t40\\-");
		System.out.println("\t5 \t   Tamato Cashew Nut Curry \t70\\-");
		System.out.println("\t6 \t   Cashew Nut Curry 	 \t80\\-");
		System.out.println("\t7 \t   Capsicum Alu	 	 \t40\\-");
		System.out.println("\t8 \t   Alu Matter  	 	 \t50\\-");
		System.out.println("\t9 \t   Paneer Shai Kurma   	\t80\\-");
		System.out.println("\t10 \t   Paneer Mushroom Curry \t90\\-");
		System.out.println("\t11 \t   Mushroom Curry	 \t100\\-");
		System.out.println("\t12 \t   Veg Maharani	  	 \t50\\-");
		System.out.println("\t13 \t   Dal Tadka 	  	 \t40\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa1=sc.nextInt();
			switch(sa1)
			{
				case 1:
					item[152]="Plain Palak";
					System.out.println("\t\tYou Selected "+item[152]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[152]=sc.nextInt();
					cost[152]=40;
					total[152]=qunty[152]*cost[152];
					break;
				case 2:
					item[153]="Palak Paneer";
					System.out.println("\t\tYou Selected "+item[153]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[153]=sc.nextInt();
					cost[153]=70;
					total[153]=qunty[153]*cost[153];
					break;
				case 3:
					item[154]="Alu Gobi";
					System.out.println("\t\tYou Selected "+item[154]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[154]=sc.nextInt();
					cost[154]=40;
					total[154]=qunty[154]*cost[154];
					break;
				case 4:
					item[155]="Tamato Curry";
					System.out.println("\t\tYou Selected "+item[155]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[155]=sc.nextInt();
					cost[155]=40;
					total[155]=qunty[155]*cost[155];
					break;
				case 5:
					item[156]="Tamato Cashew Nut Curry";
					System.out.println("\t\tYou Selected "+item[156]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[156]=sc.nextInt();
					cost[156]=70;
					total[156]=qunty[156]*cost[156];
					break;
				case 6:
					item[157]="Cashew Nut Curry";
					System.out.println("\t\tYou Selected "+item[157]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[157]=sc.nextInt();
					cost[157]=80;
					total[157]=qunty[157]*cost[157];
					break;
				case 7:
					item[158]="Capsicum Alu";
					System.out.println("\t\tYou Selected "+item[158]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[158]=sc.nextInt();
					cost[158]=40;
					total[158]=qunty[158]*cost[158];
					break;
				case 8:
					item[159]="Alu Matter";
					System.out.println("\t\tYou Selected "+item[159]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[159]=sc.nextInt();
					cost[159]=50;
					total[159]=qunty[159]*cost[159];
					break;
				case 9:
					item[160]="Paneer Shai Kurma";
					System.out.println("\t\tYou Selected "+item[160]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[160]=sc.nextInt();
					cost[160]=80;
					total[160]=qunty[160]*cost[160];
					break;
				case 10:
					item[161]="Paneer Mushroom Curry";
					System.out.println("\t\tYou Selected "+item[161]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[161]=sc.nextInt();
					cost[161]=90;
					total[161]=qunty[161]*cost[161];
					break;
				case 11:
					item[162]="Mushroom Curry";
					System.out.println("\t\tYou Selected "+item[162]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[162]=sc.nextInt();
					cost[162]=100;
					total[162]=qunty[162]*cost[162];
					break;
				case 12:
					item[163]="Veg Maharani";
					System.out.println("\t\tYou Selected "+item[163]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[163]=sc.nextInt();
					cost[163]=50;
					total[163]=qunty[163]*cost[163];
					break;
				case 13:
					item[164]="Dal Tadka";
					System.out.println("\t\tYou Selected "+item[164]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[164]=sc.nextInt();
					cost[164]=40;
					total[164]=qunty[164]*cost[164];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vs();
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
					vs();
				break;
				case 111:
					pureVeg();
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
	static void vfn()
	{
		String s2="Veg Fried Rice and Noodles";
		System.out.println("\n\t\t-------------"+s2+"---------------");
		System.out.println("\t S.No \t      ItemName     \t\t Price");
		System.out.println("\t----- \t-------------------\t\t-------");
		System.out.println("\t1 \t   Veg Fried Rice         \t60\\-");
		System.out.println("\t2 \t   Zeera Rice             \t70\\-");
		System.out.println("\t3 \t   Schezwan Veg Rice      \t80\\-");
		System.out.println("\t4 \t   Mushroom Fried Rice  \t90\\-");
		System.out.println("\t5 \t   Baby Corn Fried Rice \t90\\-");
		System.out.println("\t6 \t   Veg Noodles 		    \t60\\-");
		System.out.println("\t7 \t   Mushroom Noodles 	  \t80\\-");
		System.out.println("\t8 \t   Baby Corn Noodles 	  \t80\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa2=sc.nextInt();
			switch(sa2)
			{
				case 1:
					item[165]="Veg Fried Rice";
					System.out.println("\t\tYou Selected "+item[165]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[165]=sc.nextInt();
					cost[165]=60;
					total[165]=qunty[165]*cost[165];
					break;
				case 2:
					item[166]="Zeera Rice";
					System.out.println("\t\tYou Selected "+item[166]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[166]=sc.nextInt();
					cost[166]=70;
					total[166]=qunty[166]*cost[166];
					break;
				case 3:
					item[167]="Schezwan Veg Rice";
					System.out.println("\t\tYou Selected "+item[167]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[167]=sc.nextInt();
					cost[167]=80;
					total[167]=qunty[167]*cost[167];
					break;
				case 4:
					item[168]="Mushroom Fried Rice";
					System.out.println("\t\tYou Selected "+item[168]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[168]=sc.nextInt();
					cost[168]=90;
					total[168]=qunty[168]*cost[168];
					break;
				case 5:
					item[169]="Baby Corn Fried Rice";
					System.out.println("\t\tYou Selected "+item[169]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[169]=sc.nextInt();
					cost[169]=90;
					total[169]=qunty[169]*cost[169];
					break;
				case 6:
					item[170]="Veg Noodles";
					System.out.println("\t\tYou Selected "+item[170]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[170]=sc.nextInt();
					cost[170]=90;
					total[170]=qunty[170]*cost[170];
					break;
				case 7:
					item[171]="Mushroom Noodles";
					System.out.println("\t\tYou Selected "+item[171]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[171]=sc.nextInt();
					cost[171]=80;
					total[171]=qunty[171]*cost[171];
					break;
				case 8:
					item[172]="Baby Corn Noodles";
					System.out.println("\t\tYou Selected "+item[172]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[172]=sc.nextInt();
					cost[172]=80;
					total[172]=qunty[172]*cost[172];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vfn();
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
					vfn();
				break;
				case 111:
					pureVeg();
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
	static void vb()
	{
		String s3="Veg Biryanis";
		System.out.println("\n\t\t-------------"+s3+"---------------");
		System.out.println("\t S.No \t    	ItemName   \t\t Price");
		System.out.println("\t----- \t-----------------\t\t-------");
		System.out.println("\t1 \t   Veg Biryani           \t100\\-");
		System.out.println("\t2 \t   Mushroom Biryani      \t130\\-");
		System.out.println("\t3 \t   Cashew Biryani        \t140\\-");
		System.out.println("\t4 \t   Paneer Biryani 	   \t160\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa3=sc.nextInt();
			switch(sa3)
			{
				case 1:
					item[173]="Veg Biryani";
					System.out.println("\t\tYou Selected "+item[173]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[173]=sc.nextInt();
					cost[173]=100;
					total[173]=qunty[173]*cost[173];
					break;
				case 2:
					item[174]="Mushroom Biryani";
					System.out.println("\t\tYou Selected "+item[174]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[174]=sc.nextInt();
					cost[174]=130;
					total[174]=qunty[174]*cost[174];
					break;
				case 3:
					item[175]="Cashew Biryani";
					System.out.println("\t\tYou Selected "+item[175]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[175]=sc.nextInt();
					cost[175]=140;
					total[175]=qunty[175]*cost[175];
					break;
				case 4:
					item[176]="Paneer Biryani";
					System.out.println("\t\tYou Selected "+item[176]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[176]=sc.nextInt();
					cost[176]=160;
					total[176]=qunty[176]*cost[176];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vb();
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
					vb();
				break;
				case 111:
					pureVeg();
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
	static void tb()
	{
		String s4="Tandoori Bread";
		System.out.println("\n\t\t-------------"+s4+"---------------");
		System.out.println("\t S.No \t    	 ItemName     \t\t Price");
		System.out.println("\t----- \t--------------------\t\t-------");
		System.out.println("\t1 \t   Pulka       		 \t10\\-");
		System.out.println("\t2 \t   Roti    	     	 \t20\\-");
		System.out.println("\t3 \t   Butter Roti    	 \t30\\-");
		System.out.println("\t4 \t   Plain Non 	 	 \t25\\-");
		System.out.println("\t5 \t   Butter Non 		 \t30\\-");
		System.out.println("\t6 \t   Suffred Non 		 \t40\\-");
		System.out.println("\t7 \t   Garlic Non	 	 \t50\\-");
		System.out.println("\t8 \t   Masala Kulcha  	 \t60\\-");
		System.out.println("\t9 \t   Alu Kulcha   	 \t60\\-");
		System.out.println("\t10 \t   Alu Parota 		 \t60\\-");
		System.out.println("\t11 \t   Pudina Parota	 \t60\\-");
		System.out.println("\t12 \t   Veg Maharani	  	 \t60\\-");
		System.out.println("\t13 \t   Dal Tadka 	  	 \t60\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa4=sc.nextInt();
			switch(sa4)
			{
				case 1:
					item[177]="Pulka";
					System.out.println("\t\tYou Selected "+item[177]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[177]=sc.nextInt();
					cost[177]=10;
					total[177]=qunty[177]*cost[177];
					break;
				case 2:
					item[178]="Roti";
					System.out.println("\t\tYou Selected "+item[178]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[178]=sc.nextInt();
					cost[178]=20;
					total[178]=qunty[178]*cost[178];
					break;
				case 3:
					item[179]="Butter Roti";
					System.out.println("\t\tYou Selected "+item[179]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[179]=sc.nextInt();
					cost[179]=30;
					total[179]=qunty[179]*cost[179];
					break;
				case 4:
					item[180]="Plain Non";
					System.out.println("\t\tYou Selected "+item[180]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[180]=sc.nextInt();
					cost[180]=25;
					total[180]=qunty[180]*cost[180];
					break;
				case 5:
					item[181]="Butter Non";
					System.out.println("\t\tYou Selected "+item[181]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[181]=sc.nextInt();
					cost[181]=30;
					total[181]=qunty[181]*cost[181];
					break;
				case 6:
					item[182]="Suffred Non";
					System.out.println("\t\tYou Selected "+item[182]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[182]=sc.nextInt();
					cost[182]=40;
					total[182]=qunty[182]*cost[182];
					break;
				case 7:
					item[183]="Garlic Non";
					System.out.println("\t\tYou Selected "+item[183]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[183]=sc.nextInt();
					cost[183]=50;
					total[183]=qunty[183]*cost[183];
					break;
				case 8:
					item[184]="Masala Kulcha";
					System.out.println("\t\tYou Selected "+item[184]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[184]=sc.nextInt();
					cost[184]=60;
					total[184]=qunty[184]*cost[184];
					break;
				case 9:
					item[185]="Alu Kulcha";
					System.out.println("\t\tYou Selected "+item[185]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[185]=sc.nextInt();
					cost[185]=60;
					total[185]=qunty[185]*cost[185];
					break;
				case 10:
					item[186]="Alu Parota";
					System.out.println("\t\tYou Selected "+item[186]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[186]=sc.nextInt();
					cost[186]=60;
					total[186]=qunty[186]*cost[186];
					break;
				case 11:
					item[187]="Pudina Parota";
					System.out.println("\t\tYou Selected "+item[187]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[187]=sc.nextInt();
					cost[187]=60;
					total[187]=qunty[187]*cost[187];
					break;
				case 12:
					item[188]="Veg Maharani";
					System.out.println("\t\tYou Selected "+item[188]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[188]=sc.nextInt();
					cost[188]=60;
					total[188]=qunty[188]*cost[188];
					break;
				case 13:
					item[189]="Dal Tadka";
					System.out.println("\t\tYou Selected "+item[189]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[189]=sc.nextInt();
					cost[189]=60;
					total[189]=qunty[189]*cost[189];
					break;	
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					tb();
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
					tb();
				break;
				case 111:
					pureVeg();
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
	static void vt()
	{
		String s5="Veg Tandoori";
		System.out.println("\n\t\t-------------"+s5+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Paneer Tikka           \t160\\-");
		System.out.println("\t2 \t   Paneer Haryali Tikka   \t170\\-");
		System.out.println("\t3 \t   Veg Sheek Kebab    	\t180\\-");
		System.out.println("\t4 \t   Veg Harabhara Kebab	\t189\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa5=sc.nextInt();
			switch(sa5)
			{
				case 1:
					item[190]="Paneer Tikka";
					System.out.println("\t\tYou Selected "+item[190]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[190]=sc.nextInt();
					cost[190]=160;
					total[190]=qunty[190]*cost[190];
					break;
				case 2:
					item[191]="Paneer Haryali Tikka";
					System.out.println("\t\tYou Selected "+item[191]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[191]=sc.nextInt();
					cost[191]=170;
					total[191]=qunty[191]*cost[191];
					break;
				case 3:
					item[192]="Veg Sheek Kebab";
					System.out.println("\t\tYou Selected "+item[192]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[192]=sc.nextInt();
					cost[192]=180;
					total[192]=qunty[192]*cost[192];
					break;
				case 4:
					item[193]="Veg Harabhara Kebab";
					System.out.println("\t\tYou Selected "+item[193]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[193]=sc.nextInt();
					cost[193]=189;
					total[193]=qunty[193]*cost[193];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vt();
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
					vt();
				break;
				case 111:
					pureVeg();
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
	static void vs()
	{
		String s6="Veg Snacks";
		System.out.println("\n\t\t-------------"+s6+"---------------");
		System.out.println("\t S.No \t    	  ItemName     \t\t Price");
		System.out.println("\t----- \t-----------------------\t\t-------");
		System.out.println("\t1 \t   Veg Manchurian       	 \t70\\-");
		System.out.println("\t2 \t   Gobi Manchurian          	 \t70\\-");
		System.out.println("\t3 \t   Crispy Veg   		  \t70\\-");
		System.out.println("\t4 \t   Veg Gold Coin		  \t75\\-");
		System.out.println("\t5 \t   Ginger Veg   		  \t80\\-");
		System.out.println("\t6 \t   Finger Chips 		  \t50\\-");
		System.out.println("\t7 \t   Alu 65		   	 \t60\\-");
		System.out.println("\t8 \t   Chilli Paneer	  	  \t80\\-");
		System.out.println("\t9 \t   Paneer Marchurian / 65 	 \t99\\-");
		System.out.println("\t10 \t   Paneer Burji	  		 \t85\\-");
		System.out.println("\t11 \t   Chilli Mushroom 	  	 \t90\\-");
		System.out.println("\t12 \t   Mushroom Manchurian / 65	 \t100\\-");
		System.out.println("\t13 \t   Paneer Majestic      	 \t110\\-");
		System.out.println("\t14 \t   Veg Sticks	 		  \t109\\-");
		System.out.println("\t15 \t   Cashewnut Roast 	  	 \t129\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa6=sc.nextInt();
			switch(sa6)
			{
				case 1:
					item[194]="Veg Manchurian";
					System.out.println("\t\tYou Selected "+item[194]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[194]=sc.nextInt();
					cost[194]=70;
					total[194]=qunty[194]*cost[194];
					break;
				case 2:
					item[195]="Gobi Manchurian";
					System.out.println("\t\tYou Selected "+item[195]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[195]=sc.nextInt();
					cost[195]=70;
					total[195]=qunty[195]*cost[195];
					break;
				case 3:
					item[196]="Crispy Veg";
					System.out.println("\t\tYou Selected "+item[196]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[196]=sc.nextInt();
					cost[196]=70;
					total[196]=qunty[196]*cost[196];
					break;
				case 4:
					item[197]="Veg Gold Coin";
					System.out.println("\t\tYou Selected "+item[197]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[197]=sc.nextInt();
					cost[197]=75;
					total[197]=qunty[197]*cost[197];
					break;
				case 5:
					item[198]="Ginger Veg";
					System.out.println("\t\tYou Selected "+item[198]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[198]=sc.nextInt();
					cost[198]=80;
					total[198]=qunty[198]*cost[198];
					break;
				case 6:
					item[199]="Finger Chips";
					System.out.println("\t\tYou Selected "+item[199]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[199]=sc.nextInt();
					cost[199]=50;
					total[199]=qunty[199]*cost[199];
					break;
				case 7:
					item[200]="Alu 65";
					System.out.println("\t\tYou Selected "+item[200]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[200]=sc.nextInt();
					cost[200]=60;
					total[200]=qunty[200]*cost[200];
					break;
				case 8:
					item[201]="Chilli Paneer";
					System.out.println("\t\tYou Selected "+item[201]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[201]=sc.nextInt();
					cost[201]=80;
					total[201]=qunty[201]*cost[201];
					break;
				case 9:
					item[202]="Paneer Marchurian / 65";
					System.out.println("\t\tYou Selected "+item[202]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[202]=sc.nextInt();
					cost[202]=99;
					total[202]=qunty[202]*cost[202];
					break;
				case 10:
					item[203]="Paneer Burji";
					System.out.println("\t\tYou Selected "+item[203]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[203]=sc.nextInt();
					cost[203]=85;
					total[203]=qunty[203]*cost[203];
					break;
				case 11:
					item[204]="Chilli Mushroom";
					System.out.println("\t\tYou Selected "+item[204]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[204]=sc.nextInt();
					cost[204]=90;
					total[204]=qunty[204]*cost[204];
					break;
				case 12:
					item[205]="Mushroom Manchurian / 65";
					System.out.println("\t\tYou Selected "+item[205]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[205]=sc.nextInt();
					cost[205]=100;
					total[205]=qunty[205]*cost[205];
					break;
				case 13:
					item[206]="Paneer Majestic";
					System.out.println("\t\tYou Selected "+item[206]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[206]=sc.nextInt();
					cost[206]=110;
					total[206]=qunty[206]*cost[206];
					break;
				case 14:
					item[207]="Veg Sticks";
					System.out.println("\t\tYou Selected "+item[207]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[207]=sc.nextInt();
					cost[207]=109;
					total[207]=qunty[207]*cost[207];
					break;
				case 15:
					item[208]="Cashewnut Roast";
					System.out.println("\t\tYou Selected "+item[208]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[208]=sc.nextInt();
					cost[208]=129;
					total[208]=qunty[208]*cost[208];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vs();
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
					vs();
				break;
				case 111:
					pureVeg();
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
	static void vss()
	{
		String s7="Veg Soups";
		System.out.println("\n\t\t-------------"+s7+"---------------");
		System.out.println("\t S.No \t    ItemName     \t\t Price");
		System.out.println("\t----- \t-----------------\t\t-------");
		System.out.println("\t1 \t   Veg Corn Soup        \t50\\-");
		System.out.println("\t2 \t   Veg Cream Soup       \t50\\-");
		System.out.println("\t3 \t   Tamato Soup    	  \t50\\-");
		System.out.println("\t4 \t   Veg Hot & Sour Soup  \t60\\-");
		System.out.println("\t5 \t   Veg Clear Soup       \t50\\-");
		System.out.println("\t6 \t   Veg Manchow Soup 	  \t60\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa7=sc.nextInt();
			switch(sa7)
			{
				case 1:
					item[209]="Veg Corn Soup";
					System.out.println("\t\tYou Selected "+item[209]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[209]=sc.nextInt();
					cost[209]=50;
					total[209]=qunty[209]*cost[209];
					break;
				case 2:
					item[210]="Veg Cream Soup";
					System.out.println("\t\tYou Selected "+item[210]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[210]=sc.nextInt();
					cost[210]=50;
					total[210]=qunty[210]*cost[210];
					break;
				case 3:
					item[211]="Tamato Soup";
					System.out.println("\t\tYou Selected "+item[211]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[211]=sc.nextInt();
					cost[211]=50;
					total[211]=qunty[211]*cost[211];
					break;
				case 4:
					item[212]="Veg Hot & Sour Soup";
					System.out.println("\t\tYou Selected "+item[212]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[212]=sc.nextInt();
					cost[212]=60;
					total[212]=qunty[212]*cost[212];
					break;
				case 5:
					item[213]="Veg Clear Soup";
					System.out.println("\t\tYou Selected "+item[213]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[213]=sc.nextInt();
					cost[213]=50;
					total[213]=qunty[213]*cost[213];
					break;
				case 6:
					item[214]="Veg Manchow Soup";
					System.out.println("\t\tYou Selected "+item[214]);							
					System.out.print("\tEnter how many cups you want you : ");
					qunty[214]=sc.nextInt();
					cost[214]=60;
					total[214]=qunty[214]*cost[214];
					break;
				case 111:
					pureVeg();
					break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					vss();
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
					vss();
				break;
				case 111:
					pureVeg();
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
//	public static void main(String[] args) 
//	{
//		pureVeg();
//	}
}
