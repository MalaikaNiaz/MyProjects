import java.util.Date;
import java.util.*;
public class HospitalReceptionist extends HospitalPatients
{
	private String dateOfAdmitted;
	private String dateOfDischarge;
	private double bill;
	private Date date;
	private String drName;

	public HospitalReceptionist(){}

	public HospitalReceptionist(String name,String address,long contactNo,String emailAddress,int age,String gender,String dateOfAdmitted,String dateOfDischarge,double bill,Date date,String drName)
	{
		super(name,address,contactNo,emailAddress,age,gender);
		this.dateOfAdmitted=dateOfAdmitted;
		this.dateOfDischarge=dateOfDischarge;
		this.bill=bill;
		this.date=date;
		this.drName=drName;
	}

	public String getDrName()
	{
		return drName;
	}
	public void setDrName(String drName)
	{	
		this.drName=drName;
	}

	public String getDateOfAdmitted()
	{
		return dateOfAdmitted;
	}

	public void setDateOfAdmitted()
	{
		Scanner input=new Scanner(System.in);
		this.dateOfAdmitted=input.nextLine();
	}
	
	public Date getDate()
	{
		return date;
	}

	public String getDateOfDischarge()
	{
		return dateOfDischarge;
	}

	public void setDateOfDischarge()
	{
		Scanner input=new Scanner(System.in);
		this.dateOfDischarge=input.nextLine();
	}

	public double getBill()
	{
		return bill;
	}

	public void setBill(double bill)
	{
	this.bill=bill;
	}

	HospitalDoctors doctor=new HospitalDoctors();

	

	public void setAppointmentProcedure()
	{
		Scanner scan=new Scanner(System.in);
		doctor.setDoctorList();

		String[] doctorType= new String[]{"Dr.john","Dr.William","Dr.Charles","Dr.David","Dr.Micheal","Dr.Robert","Dr.James","Dr.Richard","Dr.Jennifer","Dr.Thomas","Dr.Mark","Dr.Joseph","Dr.Mary","Dr.Elizabeth","Dr.Steven","Dr.Jaffery"};

		long[] Drfees = new long[]{20000,5000,10000,8000,6000,9000,30000,20000,3000,5000,10000,9000,11000,12000,15000,3000};

		String[] DrTiming=new String[]{"12am to 3am","3am to 6am","6am to 8am","8am to 11am","11am to 1pm","1pm to 3pm","3pm to 5pm","5pm to 6:30pm","6:30pm to 8pm","8pm to 10pm","10pm to 12am","12am to 3am","3am to 6am","6am to 8am","8am to 11am","11am to 1pm"};

		String[] DrDays=new String[]{"monday","tuesday","thursday","wednesday","friday","sunday","saturday","wednesday","friday","monday","thursday","saturday","Tuesday","monday",
		"saturday","friday"};

		System.out.println("Select your doctor to take appointment.");
		int selectDoctor= scan.nextInt();

		if(selectDoctor>=0 && selectDoctor<=15)
		{
			bill=Drfees[selectDoctor];

			String Timing=DrTiming[selectDoctor];
			String Day=DrDays[selectDoctor];
	
                	System.out.println("you select "+doctorType[selectDoctor]);
			drName=doctorType[selectDoctor];

			System.out.println("your appoinment on:"+DrDays[selectDoctor]+" " + "at:"+DrTiming[selectDoctor] +" " + "with:" +doctorType[selectDoctor] );
        
       			System.out.println("\nYour bill is "+bill);
		}
		else
		{
			System.out.println("Please select the dr from 0 to 15.");

			System.out.println("Select your doctor to take appointment.");
			selectDoctor= scan.nextInt();

			if(selectDoctor>=0 && selectDoctor<=15)
			{
				bill=Drfees[selectDoctor];
	
				String Timing=DrTiming[selectDoctor];
				String Day=DrDays[selectDoctor];
		
	                	System.out.println("you select "+doctorType[selectDoctor]);
				System.out.println("your appoinment on:"+DrDays[selectDoctor]+" " + "at:"+DrTiming[selectDoctor] +" " + "with:" +doctorType[selectDoctor] );
	        
	       			System.out.println("\nYour bill is "+bill);
			}
			else
			{
				System.out.println("Your select wrong input.");
				System.exit(0);
			}

		}
    	}

	public void setEmergencyProcedure()
	{

		Scanner scan=new Scanner(System.in);
		doctor.EmergencyDoctorList();

		String[] Doctors= new String[]{"Dr.Vijay","Dr.khushi","Dr.Manhotra","Dr.vedRam","Dr.M.Hakim","M.Abdullah","Dr.M.H.Umer","Dr.Kabeer","Dr.Riyaa","Dr.Veer","Dr.Sachi"};

		String[] Diseases= new String[]{"Heart attack","Brain problem","eyeSide Weak","Malaria","Body Pain","Accident-Case","Cancer Treatment","Infection","Blind","Deaf","Dumb","ANOTHER DISEASE"};


		long[] Drfees = new long[]{20000,5000,1000,800,600,40000,50000,2000,1000,1000,1000};
		int i=0;
	
		System.out.println("select your disease:");
	 	int selectDisease= scan.nextInt();
	
           	if(selectDisease>=0 && selectDisease<=10)
		{
			bill=Drfees[selectDisease];

	            	System.out.println("you select "+Doctors[selectDisease]+ " " + "for treatment of" + " "  + Diseases[selectDisease]);
        		System.out.println("\nThe doctor fees is "+bill);
		
			if(selectDisease==0 || selectDisease==5)
			{
				System.out.println("\nImediately admit the patient in ICU");
				System.out.println("\n\nYour final bill is "+bill);				

			}
			else 
			if(selectDisease==1 || selectDisease==2 || selectDisease==3 || selectDisease==4 || selectDisease==6 || selectDisease==7 || selectDisease==8 || selectDisease==9 || selectDisease==10)
			{
				System.out.println("First doctor will check you:\n");
				doctor.getSituation();	
				if(doctor.getIsSerious()== true)
				{
					System.out.println("Patient will be admitted");
					System.out.println("Where are do you want to admitted");
					System.out.println("1.Ward  3000Rs per day\n2.room  4000Rs per day");
					int ward=scan.nextInt();

					if(ward!=1 && ward!=2)
					{
					System.out.println("\nPlease enter the correct option");
					System.out.println("\nWhere are do you want to admitted");
					System.out.println("1.Ward  3000Rs per day\n2.room  4000Rs per day");
					ward=scan.nextInt();
						
					}
					if(ward==1)
					{
						System.out.println("Enter the days ");
						int day=scan.nextInt();
						bill=bill+(day*3000);					
						System.out.println("Patient will be shifted to ward.");
						System.out.println("Your total bill is "+bill);			
	
					}else if(ward==2)
					{
						System.out.println("Enter the days ");
						int day=scan.nextInt();
						bill=bill+(day*4000);					
						System.out.println("Patient will be shifted to Room.");
						System.out.println("Your total bill is "+bill);			
	
					}else
					{
						System.out.println("Please select write input");
						System.exit(0);						
					}

				}
				else
				{
					System.out.println("\n\nYour final bill is "+bill);			
				}
			}
		
		
	}
	else
	{
		System.out.println("Doctor of your Disease is not available in this hospital go to another Hospital");
		System.exit(0);
	}
		
}

	public String toString()
	{
		return super.toString()+dateOfAdmitted+dateOfDischarge;
	}


}

