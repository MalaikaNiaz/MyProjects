import java.util.*;
public class HospitalPharmacy{

	private double totalPrice;
	private double discount;

	public HospitalPharmacy(){}
	public HospitalPharmacy(double totalPrice,double discount)
	{
		this.totalPrice=totalPrice;
		this.discount=discount;
	}

	public double getTotalPrice()
	{
    		return totalPrice;
    	}

	public void setTotalPrice(double totalPrice)
	{
        	this.totalPrice=totalPrice;
    	}

	public double getDiscount()
	{
    		return discount;
    	}

	public void setDiscount(double discount)
	{
	this.discount=discount;
	}

	public void order()
    	{
		Scanner scan= new Scanner(System.in);
	    	System.out.println("\nHere is our list of Pharmacy items and there prices :--\n");

		System.out.println("0. Liptor                  12 pieces pack             -->             300.Rs");
		System.out.println("1. Advair                  5 pieces pack              -->             300.Rs");
		System.out.println("2. Piavix                  12 pieces pack             -->             300.Rs");
		System.out.println("3. Nexium                  250Gram pack               -->             250.Rs");
		System.out.println("4. Norvasc                 1L pack             	      -->             500.Rs");
		System.out.println("5. Enbirel                 1L pack          	      -->             500.Rs");
		System.out.println("6. Zyprexa                 500 Gram pack              -->             200.Rs");
		System.out.println("7. Remicade                1Kg pack                   -->             1000.Rs");
		System.out.println("8. Araneps                 90 gram pack               -->             300.Rs");
		System.out.println("9. Effexor                 12 pieces pack             -->             3000.Rs");
		System.out.println("10. Singulair              100Gram pack               -->             900.Rs");		

		String[] itemType = new String[]{"Liptor packs","Advair packs","Piavix packs", "Nexium packs", "Norvasc packs" ,"Enbirel packs","Zyprexa packs","Remicade packs", "Araneps packs","Effexor packs","Singulair packs"};
		int[] itemPrice = new int[]{300,500,300,250,500,500,200,1000,300,3000,900};

        	System.out.println("\nHow many items do you want to buy.");
        	int itemNo= scan.nextInt();

		if(itemNo>0 && itemNo<12)
		{
	        	System.out.println("\nPlease select "+itemNo +" items from the list numbers that you want to buy.");
			int[] selectItem= new int[20];
			int[] quantity=new int[100];

	 	        for(int i=0;i<itemNo;i++)
	        	{
				System.out.println("\nEnter the item "+(i+1));
	            		selectItem[i]= scan.nextInt();

				if(selectItem[i]>=0 && selectItem[i]<=10)
				{
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}
				else
				{
					System.out.println("\nPlease enter the Item number between 0 to 10.\n");
					System.out.println("\nEnter the item "+(i+1));
		            		selectItem[i]= scan.nextInt();				
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}			
	        	}
	
	        	for(int i=0;i<itemNo;i++)
	        	{
				if(quantity[i]!=0)
	            		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+" Rs.");
	        	}
		}
		else
		{ 
			System.out.println("\n\nplease enter the number between 0 to 11\n\n");

        		System.out.println("\nHow many items do you want to buy.");
	        	itemNo= scan.nextInt();
	        	System.out.println("\nPlease select "+itemNo +" items from the list numbers that you want to buy.");
			int[] selectItem= new int[20];
			int[] quantity=new int[100];
	 	        for(int i=0;i<itemNo;i++)
	        	{
				System.out.println("\nEnter the item "+(i+1));
	            		selectItem[i]= scan.nextInt();

				if(selectItem[i]>=0 && selectItem[i]<=10)
				{
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}
				else
				{
					System.out.println("Please enter the Item number between 0 to 10.");
					System.out.println("\nEnter the item "+(i+1));
		            		selectItem[i]= scan.nextInt();				
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}			
	        	}
	
	        	for(int i=0;i<itemNo;i++)
	        	{
				if(quantity[i]!=0)
	            		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+"Rs.");
	        	}

		}
    	}

	public void discount(double totalPrice)
	{
		if(totalPrice>=700 && totalPrice<=1500)
		{
			 setDiscount(totalPrice*3/100);
		}
		else if(totalPrice>1500 && totalPrice<=3000)
		{
			 setDiscount(totalPrice*6/100);
		}
		else if(totalPrice>3000 && totalPrice<=5000)
		{
			 setDiscount(totalPrice*9/100);
		}
		else if(totalPrice>5000)
		{
			 setDiscount(totalPrice*12/100);
		}
		else
		{ 
			 setDiscount(0);
		}
	}
}
