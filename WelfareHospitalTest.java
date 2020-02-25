import java.util.*;
import java.util.Date;
public class WelfareHospitalTest
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			WelfareHospital hospital=new WelfareHospital("WELFARE","I.I CHUNDRIGAR ROAD",03112727537,"WelfareH@gmail.com");
			
			HospitalPatients patient=new HospitalPatients();
			Date date=new Date();
			HospitalReceptionist recep=new HospitalReceptionist();
			HospitalPayment pay=new HospitalPayment();
			HospitalDoctors doctor=new HospitalDoctors();
			HospitalPharmacy pharmacy =new HospitalPharmacy();
			

			System.out.println("\n-------------------------------WELCOME TO WELFARE HOSPITAL-------------------------");
			System.out.println("\n");

			System.out.println("Fill the form");
			System.out.println("Enter the patient name:");
			patient.setName(scan.nextLine());
			System.out.println("Enter address:");
			patient.setAddress(scan.nextLine());
			System.out.println("Enter the contact-no:");
			patient.setContactNo(scan.nextLong());
			scan.nextLine();
			System.out.println("Enter the emailAddress:");
			patient.setEmailAddress(scan.nextLine());
			System.out.println("Enter the age:");
			patient.setAge(scan.nextInt());
			System.out.println("select the gender:");
			System.out.println("1.Male\n2.Female");
			int gender=scan.nextInt();
			if(gender!=1 && gender!=2)
			{
			System.out.println("\nPlease enter the correct option");
			System.out.println("\nselect the gender:");
			System.out.println("1.Male\n2.Female");
			gender=scan.nextInt();

			}			
		
			if(gender==1)
			{
			patient.setGender("male");				
			}
			else if(gender==2)
			{
			patient.setGender("female");				

			}else
			{
				System.out.println("You enter the incorrect option");
				System.exit(0);
			}


			System.out.println("\n-------------How can I help you----------------");
			System.out.println("SELECT WHAT DO U WANT");
			System.out.println("\n1.For Take Appoinment of doctor");
			System.out.println("2.For Any Emergency");
			System.out.println("3.Pharmacy");
			int choice=scan.nextInt();
			if(choice!=1 && choice!=2 && choice!=3)
			{
				System.out.println("\nPlease enter the correct option.");
				System.out.println("\nSELECT WHAT DO U WANT");
				System.out.println("\n1.For Take Appoinment of doctor");
				System.out.println("2.For Any Emergency");
				System.out.println("3.Pharmacy");
				choice=scan.nextInt();

			}			

			if(choice==1)
			{
				System.out.println("Select the doctor according to your disease");
				recep.setAppointmentProcedure();
				pay.setCash(recep.getBill());
				pay.paymentOption();
			}
			else
			if(choice==2)
			{
				recep.setEmergencyProcedure();
				pay.setCash(recep.getBill());
				pay.paymentOption();					
			}
			else if(choice==3)
			{
				pharmacy.order();
	    			pharmacy.discount(pharmacy.getTotalPrice());

			        System.out.println("\nYour total bill of cosmetics item is "+pharmacy.getTotalPrice());
			 	System.out.println("\nOn the cosmetics shoping of "+pharmacy.getTotalPrice()+" you get the discount of "+pharmacy.getDiscount());

				pharmacy.setTotalPrice((pharmacy.getTotalPrice()-pharmacy.getDiscount()));
			        System.out.println("\nYour total bill after discount is "+pharmacy.getTotalPrice());
				pay.setCash(pharmacy.getTotalPrice());
				pay.paymentOption();


			}
			else
			{
				System.out.println("please enter the correct input.");
				System.exit(0);
			}

			System.out.println("===>  Here is your recept  <===");
			int a=0;
			patient.setID(a++);
			System.out.println(patient.toString());
			System.out.println("Patient bill is "+recep.getBill());
			System.out.println("Patient consultant Doctor is "+recep.getDrName());
			System.out.println("Patient entry date is "+date);
			System.out.println("\n\n");
			System.out.println(hospital);
			

		}
}

