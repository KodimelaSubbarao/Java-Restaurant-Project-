package Restaurant;

public class SoftDrinks extends Bill_Pay
{
	//215
	static void softDrinks()
	{
		String s1="Soft Drinks";
		System.out.println("\n\t-------------"+s1+"---------------\n");
		System.out.println("\t S.No \t      ItemName       \t Price");
		System.out.println("\t------\t--------------------\t-------");
		System.out.println("\t  1   \t   Water(500ml)     \t  10\\-");
		System.out.println("\t  2   \t   Water(1ltr)      \t  20\\-");
		System.out.println("\t  3   \t   Sprite           \t  20\\-");
		System.out.println("\t  4   \t   Thums Up         \t  20\\-");
		System.out.println("\t  5   \t   Mazza            \t  20\\-");
		System.out.println("\t  6   \t   Pepsi            \t  20\\-");
		System.out.println("\t  7   \t   Coca-Cola        \t  20\\-");
		System.out.println("\t  8   \t   Fanta            \t  20\\-");
		System.out.println("\t  9   \t   Mirinda          \t  20\\-");
		System.out.println("\t  10 \t   Appy Fizz         \t  20\\-");
		System.out.print("\n\t111.Previous Menu");
		System.out.println("\t  000.Exit");
		System.out.print("\n\tPlease enter the number only : ");
		int sa1=sc.nextInt();
			switch(sa1)
			{
				case 1:
					item[215]="Water(500ml)";
					System.out.println("\t\tYou Selected "+item[215]);							
					System.out.print("\tEnter how many Water Bottles you want you : ");
					qunty[215]=sc.nextInt();
					cost[215]=10;
					total[215]=qunty[215]*cost[215];
					break;
				case 2:
					item[216]="Water(1ltr)";
					System.out.println("\t\tYou Selected "+item[216]);							
					System.out.print("\tEnter how many Water Bottles you want you : ");
					qunty[216]=sc.nextInt();
					cost[216]=20;
					total[216]=qunty[216]*cost[216];
					break;
				case 3:
					item[217]="Sprite";
					System.out.println("\t\tYou Selected "+item[217]);							
					System.out.print("\tEnter how many drink Sprite's you want you : ");
					qunty[217]=sc.nextInt();
					cost[217]=20;
					total[217]=qunty[217]*cost[217];
					break;
				case 4:
					item[218]="Thums Up";
					System.out.println("\t\tYou Selected "+item[218]);							
					System.out.print("\tEnter how many Thums Up's you want you : ");
					qunty[218]=sc.nextInt();
					cost[218]=20;
					total[218]=qunty[218]*cost[218];
					break;
				case 5:
					item[219]="Mazza";
					System.out.println("\t\tYou Selected "+item[219]);							
					System.out.print("\tEnter how many Mazza's you want you : ");
					qunty[219]=sc.nextInt();
					cost[219]=20;
					total[219]=qunty[219]*cost[219];
					break;
				case 6:
					item[220]="Pepsi";
					System.out.println("\t\tYou Selected "+item[220]);							
					System.out.print("\tEnter how many Pepsi's you want you : ");
					qunty[220]=sc.nextInt();
					cost[220]=20;
					total[220]=qunty[220]*cost[220];
					break;
				case 7:
					item[221]="Coca-Cola";
					System.out.println("\t\tYou Selected "+item[221]);							
					System.out.print("\tEnter how many Coca-Cola's you want you : ");
					qunty[221]=sc.nextInt();
					cost[221]=20;
					total[221]=qunty[221]*cost[221];
					break;
				case 8:
					item[222]="Fanta";
					System.out.println("\t\tYou Selected "+item[222]);							
					System.out.print("\tEnter how many Fanta's you want you : ");
					qunty[222]=sc.nextInt();
					cost[222]=20;
					total[222]=qunty[222]*cost[222];
					break;
				case 9:
					item[223]="Mirinda";
					System.out.println("\t\tYou Selected "+item[223]);							
					System.out.print("\tEnter how many Mirinda's you want you : ");
					qunty[223]=sc.nextInt();
					cost[223]=20;
					total[223]=qunty[223]*cost[223];
					break;
				case 10:
					item[224]="Appy Fizz";
					System.out.println("\t\tYou Selected "+item[224]);							
					System.out.print("\tEnter how many Appy Fizz's you want you : ");
					qunty[224]=sc.nextInt();
					cost[224]=20;
					total[224]=qunty[224]*cost[224];
					break;
				case 111:
					mi.meth1();
				break;
				case 000:
					System.exit(0);
				default:
					System.err.println("\n\t\t Choose Valid Option......!\n");
					softDrinks();
				break;			
			}		
			int a2=1;
			while(a2<=1)
			{
				System.out.println("\n\tDo you want more items Enter 1......!");
				System.out.println("\t\t\t    1.Menu");
				System.out.print("\t111.Previous Menu");
				System.out.print("\t333.Bill");
				System.out.println("\t\t\t000.Exit");
				System.out.print("\tPlease enter the number : ");
				int sa2=sc.nextInt();
				a2++;
				switch(sa2)
				{
				case 1:
					softDrinks();
				break;
				case 111:
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
//		new SoftDrinks().softDrinks();
//	}
}
