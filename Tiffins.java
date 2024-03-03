package Restaurant;
public class Tiffins extends Tea
{
	static void tiffin()
	{
		System.out.println("\n\tPlease choose anye one what you want...!\n");
		System.out.println("\t\t ▁ ▂ ▄ ▅ ▆ ▇ █ Tiffins █ ▇ ▆ ▅ ▄ ▂ ▁");
		System.out.println("\t\t-----------------------------------------\n");
		System.out.println("\t\t\t1.Idly's");
		System.out.println("\t\t\t2.Vada");
		System.out.println("\t\t\t3.Dosa");
		System.out.println("\t\t\t4.Uttapam");
		System.out.println("\t\t\t5.Pesarattu");
		System.out.println("\t\t\t6.Regular Items");
		System.out.print("\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\t\tPlease enter the number only : ");
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				idly();
			break;
			case 2:
				vada();
			break;
			case 3:
				dosa();
			break;
			case 4:
				uttapam();
			break;
			case 5:
				pesarattu();
			break;
			case 6:
				ritem();
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
				tiffin();
			break;
		}
	}
	static void idly()
	{
		String s1="Idly's";
		System.out.println("\n\t\t-------------"+s1+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Single Idly          \t10\\-");
		System.out.println("\t2 \t   Idly-(2)             \t15\\-");
		System.out.println("\t3 \t   Idly-(P)   		  \t30\\-");
		System.out.println("\t4 \t   Sambar Idly 		  \t30\\-");
		System.out.println("\t5 \t   Butter Idly          \t40\\-");
		System.out.println("\t6 \t   Karam Podi Ghee Idly \t40\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa=sc.nextInt();
			switch(sa)
			{
				case 1:
					item[0]="Single Idly";
					System.out.println("\t\tYou Selected "+item[0]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[0]=sc.nextInt();
					cost[0]=10;
					total[0]=qunty[0]*cost[0];
					break;
				case 2:
					item[1]="Idly-(2)";
					System.out.println("\t\tYou Selected "+item[1]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[1]=sc.nextInt();
					cost[1]=15;
					total[1]=qunty[1]*cost[1];
					break;
				case 3:
					item[2]="Idly-(P) ";
					System.out.println("\t\tYou Selected "+item[2]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[2]=sc.nextInt();
					cost[2]=30;
					total[2]=qunty[2]*cost[2];
					break;
				case 4:
					item[3]="Sambar Idly";
					System.out.println("\t\tYou Selected "+item[3]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[3]=sc.nextInt();
					cost[3]=30;
					total[3]=qunty[3]*cost[3];
					break;
				case 5:
					item[4]="Butter Idly";
					System.out.println("\t\tYou Selected "+item[4]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[4]=sc.nextInt();
					cost[4]=40;
					total[4]=qunty[4]*cost[4];
					break;
				case 6:
					item[5]="Karam Podi Ghee Idly";
					System.out.println("\t\tYou Selected "+item[5]);							
					System.out.print("\tEnter how many plates you want you : ");
					qunty[5]=sc.nextInt();
					cost[5]=40;
					total[5]=qunty[5]*cost[5];
					break;				
				case 111:
					tiffin();
				break;
				case 222:
					mi.meth1();
					break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					idly();
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
					idly();
				break;
				case 111:
					tiffin();
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
					//break;
				}
			}
	}
	static void vada()
	{
		String s2="Vada's";
		System.out.println("\n\t\t-------------"+s2+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Single Vada          \t10\\-");
		System.out.println("\t2 \t   Vada-(P)             \t30\\-");
		System.out.println("\t3 \t   Sambar Vada-(P)   	  \t35\\-");				
		System.out.println("\t4 \t   1P Idly 1 Vada       \t40\\-");
		System.out.println("\t5 \t   2P Idly 1 Vada 	  \t60\\-");
		System.out.println("\t6 \t   1P Idly 1 Vada Sambar\t45\\-");
		System.out.println("\t7 \t   2P Idly 1 Vada Sambar\t70\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa1=sc.nextInt();
		switch(sa1)
		{
			case 1:
				item[6]="Single Vada";
				System.out.println("\t\tYou Selected "+item[6]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[6]=sc.nextInt();
				cost[6]=10;
				total[6]=qunty[6]*cost[6];
				break;
			case 2:
				item[7]="Vada-(P)";
				System.out.println("\t\tYou Selected "+item[7]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[7]=sc.nextInt();
				cost[7]=30;
				total[7]=qunty[7]*cost[7];
				break;
			case 3:
				item[8]="Sambar Vada-(P)";
				System.out.println("\t\tYou Selected "+item[8]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[8]=sc.nextInt();
				cost[8]=35;
				total[8]=qunty[8]*cost[8];
				break;
			case 4:
				item[9]="1P Idly 1 Vada";
				System.out.println("\t\tYou Selected "+item[9]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[9]=sc.nextInt();
				cost[9]=40;
				total[9]=qunty[9]*cost[9];
				break;
			case 5:
				item[10]="2P Idly 1 Vada";
				System.out.println("\t\tYou Selected "+item[10]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[10]=sc.nextInt();
				cost[10]=60;
				total[10]=qunty[10]*cost[10];
				break;
			case 6:
				item[11]="1P Idly 1 Vada Sambar";
				System.out.println("\t\tYou Selected "+item[11]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[11]=sc.nextInt();
				cost[11]=45;
				total[11]=qunty[11]*cost[11];
				break;
			case 7:
				item[12]="2P Idly 1 Vada Sambar";
				System.out.println("\t\tYou Selected "+item[12]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[12]=sc.nextInt();
				cost[12]=70;
				total[12]=qunty[12]*cost[12];
				break;
			case 111:
				tiffin();
				break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				vada();
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
				vada();
			break;
			case 111:
				tiffin();
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
	static void dosa()
	{
		String s3="Dosa's";
		System.out.println("\n\t\t-------------"+s3+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Plan Dosa            \t30\\-");
		System.out.println("\t2 \t   Set Dosa             \t30\\-");
		System.out.println("\t3 \t   Masala Dosa    	  \t35\\-");
		System.out.println("\t4 \t   Onion Dosa           \t40\\-");
		System.out.println("\t5 \t   Onion Masala Dosa	  \t45\\-");
		System.out.println("\t6 \t   Ghee Dosa            \t50\\-");
		System.out.println("\t7 \t   M.L.A Dosa(Umpa Dosa)\t50\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa2=sc.nextInt();
		switch(sa2)
		{
			case 1:
				item[13]="Plan Dosa";
				System.out.println("\t\tYou Selected "+item[13]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[13]=sc.nextInt();
				cost[13]=30;
				total[13]=qunty[13]*cost[13];
				break;
			case 2:
				item[14]="Set Dosa";
				System.out.println("\t\tYou Selected "+item[14]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[14]=sc.nextInt();
				cost[14]=30;
				total[14]=qunty[14]*cost[14];
				break;
			case 3:
				item[15]="Masala Dosa";
				System.out.println("\t\tYou Selected "+item[15]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[15]=sc.nextInt();
				cost[15]=35;
				total[15]=qunty[15]*cost[15];
				break;
			case 4:
				item[16]="Onion Dosa";
				System.out.println("\t\tYou Selected "+item[16]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[16]=sc.nextInt();
				cost[16]=40;
				total[16]=qunty[16]*cost[16];
				break;
			case 5:
				item[17]="Onion Masala Dosa";
				System.out.println("\t\tYou Selected "+item[17]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[17]=sc.nextInt();
				cost[17]=45;
				total[17]=qunty[17]*cost[17];
				break;
			case 6:
				item[18]="Ghee Dosa";
				System.out.println("\t\tYou Selected "+item[18]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[18]=sc.nextInt();
				cost[18]=50;
				total[18]=qunty[18]*cost[18];
				break;
			case 7:
				item[19]="M.L.A Dosa(Umpa Dosa)";
				System.out.println("\t\tYou Selected "+item[19]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[19]=sc.nextInt();
				cost[19]=50;
				total[19]=qunty[19]*cost[19];
				break;
			case 111:
				tiffin();
			break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				dosa();
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
				tiffin();
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
	static void uttapam()
	{
		String s4="Uttapams";
		System.out.println("\n\t\t-------------"+s4+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Uttapam              \t30\\-");
		System.out.println("\t2 \t   Masala Uttapam   	  \t35\\-");
		System.out.println("\t3 \t   Butter Uttapam       \t40\\-");
		System.out.println("\t4 \t   Ghee Uttapam         \t40\\-");
		System.out.println("\t5 \t   Panner Uttapam  	  \t40\\-");
		System.out.println("\t6 \t   Cheese Uttapam       \t45\\-");
		System.out.println("\t7 \t   Butter Paneer Uttapam\t50\\-");
		System.out.println("\t8 \t   Butter Cheese Uttapam\t55\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa3=sc.nextInt();
		switch(sa3)
		{
			case 1:
				item[20]="Uttapam";
				System.out.println("\t\tYou Selected "+item[20]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[20]=sc.nextInt();
				cost[20]=30;
				total[20]=qunty[20]*cost[20];
				break;
			case 2:
				item[21]="Masala Uttapam";
				System.out.println("\t\tYou Selected "+item[21]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[21]=sc.nextInt();
				cost[21]=35;
				total[21]=qunty[21]*cost[21];
				break;
			case 3:
				item[22]="Butter Uttapam";
				System.out.println("\t\tYou Selected "+item[22]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[22]=sc.nextInt();
				cost[22]=40;
				total[22]=qunty[22]*cost[22];
				break;
			case 4:
				item[23]="Ghee Uttapam";
				System.out.println("\t\tYou Selected "+item[23]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[23]=sc.nextInt();
				cost[23]=40;
				total[23]=qunty[23]*cost[23];
				break;
			case 5:
				item[24]="Panner Uttapam";
				System.out.println("\t\tYou Selected "+item[24]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[24]=sc.nextInt();
				cost[24]=40;
				total[24]=qunty[24]*cost[24];
				break;
			case 6:
				item[25]="Cheese Uttapam";
				System.out.println("\t\tYou Selected "+item[25]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[25]=sc.nextInt();
				cost[25]=45;
				total[25]=qunty[25]*cost[25];
				break;
			case 7:
				item[26]="Butter Paneer Uttapam";
				System.out.println("\t\tYou Selected "+item[26]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[26]=sc.nextInt();
				cost[26]=50;
				total[26]=qunty[26]*cost[26];
				break;
			case 8:
				item[27]="Butter Cheese Uttapam";
				System.out.println("\t\tYou Selected "+item[27]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[27]=sc.nextInt();
				cost[27]=55;
				total[27]=qunty[27]*cost[27];
				break;
			case 111:
				tiffin();
			break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				uttapam();
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
				uttapam();
			break;
			case 111:
				tiffin();
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
	static void pesarattu()
	{
		String s5="Pesarattulu";
		System.out.println("\n\t\t-------------"+s5+"---------------");
		System.out.println("\t S.No \t    	   ItemName      \t\t  Price ");
		System.out.println("\t-----\t-------------------------\t\t--------");
		System.out.println("\t1 \t   Pesarattu            	   \t35\\-");
		System.out.println("\t2 \t   Masala Pesarattu  	  	   \t40\\-");
		System.out.println("\t3 \t   M.L.A Pesarattu(Uma Dosa)     \t40\\-");
		System.out.println("\t4 \t   Panner Pesarattu     	   \t50\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa4=sc.nextInt();
		switch(sa4)
		{
			case 1:
				item[28]="Pesarattu";
				System.out.println("\t\tYou Selected "+item[28]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[28]=sc.nextInt();
				cost[28]=35;
				total[28]=qunty[28]*cost[28];
				break;
			case 2:
				item[29]="Masala Pesarattu";
				System.out.println("\t\tYou Selected "+item[29]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[29]=sc.nextInt();
				cost[29]=40;
				total[29]=qunty[29]*cost[29];
				break;
			case 3:
				item[30]="M.L.A Pesarattu(Uma Dosa)";
				System.out.println("\t\tYou Selected "+item[30]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[30]=sc.nextInt();
				cost[30]=40;
				total[30]=qunty[30]*cost[30];
				break;
			case 4:
				item[31]="Panner Pesarattu";
				System.out.println("\t\tYou Selected "+item[31]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[31]=sc.nextInt();
				cost[31]=50;
				total[31]=qunty[31]*cost[31];
				break;
			case 111:
				tiffin();
			break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				pesarattu();
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
				pesarattu();
			break;
			case 111:
				tiffin();
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
	static void ritem()
	{
		String s6="Regular Items";
		System.out.println("\n\t\t-------------"+s6+"---------------");
		System.out.println("\t S.No \t    	ItemName    \t\t Price");
		System.out.println("\t----- \t------------------\t\t-------");
		System.out.println("\t1 \t   Upma            	\t30\\-");
		System.out.println("\t2 \t   Mysore Bajji  	    \t30\\-");
		System.out.println("\t3 \t   Poori(2P)   	  	\t30\\-");
		System.out.println("\t4 \t   Chapathi        	   \t40\\-");
		System.out.println("\t5 \t   Onion Bajji      	  \t30\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.print("\t222.Main Menu");
		System.out.println("\t   000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa5=sc.nextInt();
		switch(sa5)
		{
			case 1:
				item[32]="Upma";
				System.out.println("\t\tYou Selected "+item[32]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[32]=sc.nextInt();
				cost[32]=30;
				total[32]=qunty[32]*cost[32];
				break;
			case 2:
				item[33]="Mysore Bajji";
				System.out.println("\t\tYou Selected "+item[33]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[33]=sc.nextInt();
				cost[33]=30;
				total[33]=qunty[33]*cost[33];
				break;
			case 3:
				item[34]="Poori(2P)";
				System.out.println("\t\tYou Selected "+item[34]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[34]=sc.nextInt();
				cost[34]=30;
				total[34]=qunty[34]*cost[34];
				break;
			case 4:
				item[35]="Chapathi";
				System.out.println("\t\tYou Selected "+item[35]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[35]=sc.nextInt();
				cost[35]=40;
				total[35]=qunty[35]*cost[35];
				break;
			case 5:
				item[36]="Onion Bajji";
				System.out.println("\t\tYou Selected "+item[36]);							
				System.out.print("\tEnter how many plates you want you : ");
				qunty[36]=sc.nextInt();
				cost[36]=30;
				total[36]=qunty[36]*cost[36];
				break;
			case 111:
				tiffin();
			break;
			case 222:
				mi.meth1();
				break;
			case 000:
				System.exit(0);
			default:
				System.err.println("\n\t\t Choose Valid Option......!\n");
				ritem();
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
				ritem();
			break;
			case 111:
				tiffin();
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
}
