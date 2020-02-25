import java.util.*;
public class HospitalPayment
{
	private double cash;

	public HospitalPayment(){}
	public HospitalPayment(double cash)
	{
		this.cash=cash;
	}
	
	public double getCash()
	{
		return cash;
	}

	public void setCash(double cash)
	{
	this.cash=cash;
	}

	public void paymentOption()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nHow do you want to pay your bill");
		System.out.println("\nSelect from the options");
		System.out.println("1. Cash\n2. ATM Card");
		int type=scan.nextInt();

		if(type!=1 && type!=2)
		{
		System.out.println("\nPlease select the correct option.");
		System.out.println("\nSelect from the options");
		System.out.println("1. Cash\n2. ATM Card");
		type=scan.nextInt();

		}

		if(type==1)
		{
			System.out.println("\nPlease give "+cash+" Rs to the Cash counter.");

			double payment=scan.nextDouble();

			if(payment>=cash)
			{
				payment=payment-cash;
				System.out.println("\nHere is your change "+payment);
				System.out.println("\nYour payment process is succesfully done.");
			} 
			else
			{
				System.out.println("\n\nYour cash is less than total bill.");
				System.out.println("Do you wants to continue or wants to cancel it");
				System.out.println("Press 1 for continue \nPress 2 for cancel");
				int want=scan.nextInt();

				if(want==1)
				{
					System.out.println("Please give "+(cash-payment)+" more cash to complete your orders");

					double mCash=scan.nextInt();
					if(mCash>=(cash-payment))
					{
						mCash=mCash-(cash-payment);

						System.out.println("\nHere is your change "+mCash);
						System.out.println("\nYour payment process is succesfully done.");
					}
					else
					{
						System.out.println("your apointment is cancelled.");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("Your order is cancelled.");
					System.exit(0);
				}
			}	
		}
		else
		if(type==2)
		{
			System.out.println("\nPlease give your ATM card");
			System.out.println("Enter ATM's Pin");

			int pin=scan.nextInt();

			System.out.println("\nEnter the price to withdraw the bill payment from the ATM\n");

			double atm=scan.nextDouble();

			if(atm>=cash)
			{
				System.out.println(atm+ " Rs is succesfully withdraw from your atm");

				atm=atm-cash;

				System.out.println("\nHere is your change "+atm);
				System.out.println("\nYour payment process is succesfully done.");
			} 
			else
			{
				System.out.println("\n\nYour withdraw payment is less than total bill.");
				System.out.println("Do you wants to continue or wants to cancel it");
				System.out.println("Press 1 for continue \nPress 2 for cancel");

				int want=scan.nextInt();

				if(want==1)
				{
					System.out.println("Please give "+(cash-atm)+" more cash to complete your orders");

					double mCash=scan.nextInt();
					
					if(mCash>=(cash-atm))
					{
						mCash=mCash-(cash-atm);

						System.out.println("\nHere is your change "+mCash);
						System.out.println("\nYour payment process is succesfully done.");
					}
					else
					{
						System.out.println("your apointment is cancelled.");
						System.exit(0);
					}				}
				else
				{
					System.out.println("Your order is cancelled.");
					System.exit(0);
				}
			}								
		}
		else
		{
			System.out.println("You enter the wrong inout.");
			System.exit(0);
		}
	}

	

}
