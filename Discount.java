package Restaurant;


public class Discount extends Bill_Pay
{
	public void discount()
	{
		
		int totalamount=2500;
		for(int i:total)
		{
			totalamount +=i;
		}
		System.out.println("\t\tYour Total Bill is : "+totalamount+"\n");
		if(totalamount<400)
		{
			System.out.println("If you purchase items worth "+(400-totalamount)+" rupees, you are eligible for discounts, and you will save our money.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 500 to 1000  and you'll get 10% discount ");
			System.out.println("\t\tYour bill is 1000 to 1500  and you'll get 14% discount  ");
			System.out.println("\t\tYour bill is 1500 to 2000  and you'll get 18% discount  ");
			System.out.println("\t\tYour bill is 2000 to 3000  and you'll get 23% discount  ");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=400 && totalamount<500)
		{
			System.out.println("If you purchase items worth "+(500-totalamount)+" rupees, you will receive a 10% discount, and you will save 50 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 500 to 1000  and you'll get 6% discount ");
			System.out.println("\t\tYour bill is 1000 to 1500  and you'll get 14% discount  ");
			System.out.println("\t\tYour bill is 1500 to 2000  and you'll get 18% discount  ");
			System.out.println("\t\tYour bill is 2000 to 3000  and you'll get 23% discount  ");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=800 && totalamount<1000)
		{
			System.out.println("If you purchase items worth "+(1000-totalamount)+" rupees, you will receive a 14% discount, and you will save 160 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 1000 to 1500  and you'll get 14% discount  ");
			System.out.println("\t\tYour bill is 1500 to 2000  and you'll get 18% discount  ");
			System.out.println("\t\tYour bill is 2000 to 3000  and you'll get 23% discount  ");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=1300 && totalamount<1500)
		{
			System.out.println("If you purchase items worth "+(1500-totalamount)+" rupees, you will receive a 18% discount, and you will save 270 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 1500 to 2000  and you'll get 18% discount  ");
			System.out.println("\t\tYour bill is 2000 to 3000  and you'll get 23% discount  ");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=1800 && totalamount<2000)
		{
			System.out.println("If you purchase items worth "+(2000-totalamount)+" rupees, you will receive a 23% discount, and you will save 460 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 2000 to 3000  and you'll get 23% discount  ");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");;
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=2500 && totalamount<3000)
		{
			System.out.println("If you purchase items worth "+(3000-totalamount)+" rupees, you will receive a 28% discount, and you will save 840 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 3000 to 5000  and you'll get 28% discount  ");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}
		else if(totalamount>=4200 && totalamount<5000)
		{
			System.out.println("If you purchase items worth "+(5000-totalamount)+" rupees, you will receive a 35% discount, and you will save 1,750 rupees.\n");
			System.out.println("\tIn my Restaurant discounts are Availbale......!\n");
			System.out.println("\t\tYour bill is 5000  or above  and you'll get 35% discount  ");
			System.out.println("\n\tDo want discount buy some more......");
			System.out.print("\tplease choose your option 1(yes) or 0(no) : ");
			
			int x=sc.nextInt();
			if(x==1)
			{
				new Menu_Card_Restaurant().meth1();
			}
			else {
				return ;
			}
		}		
	}
}
