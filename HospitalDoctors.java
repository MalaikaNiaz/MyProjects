import java.util.*;
public class HospitalDoctors
{
	private boolean isSerious;

	public HospitalDoctors(){}
	public HospitalDoctors(boolean isSerious)
	{
		this.isSerious=isSerious;
	}

	public boolean getIsSerious()
	{
		return isSerious;
	}	
	public void setIsSerious(boolean isSerious)
	{
		this.isSerious=isSerious;
	}

	public void setDoctorList()
	{
		System.out.println("\nHere is our list of doctors :--");
		System.out.println("Names of doctors        DoctorTypes		  days		Timing		Dr.fee");
		System.out.println("\n\n0.  Dr.john		Eye Surgeon		monday		12am-3am	20000Rs");
		System.out.println("1.  Dr.William		Audiologist		tuesday		3am-6am		5000Rs");
		System.out.println("2.  Dr.Charles		Allergist		thursday	6am-8am		10000Rs");
		System.out.println("3.  Dr.David		Anesthesiologist	wednesday	8am-11am	8000Rs");
		System.out.println("4.  Dr.Micheal		Cardiologist		friday		11am-1pm	6000Rs");
		System.out.println("5.  Dr.Robert		Dermatologist		sunday		1pm-3pm		9000Rs");
		System.out.println("6.  Dr.James		Endocrinologist		saturday	3pm-5pm		30000Rs");
		System.out.println("7.  Dr.Richard		Epidemiologist		wednesday	5pm-6:30pm	20000Rs");
		System.out.println("8.  Dr.Jennifer		Gynecologist		friday		6:30pm-8pm	3000Rs");
		System.out.println("9.  Dr.Thomas		Immunologist		monday		8pm-10pm	5000Rs");
		System.out.println("10. Dr.Mark		Microbiologist		thursday	10pm-12am	10000Rs");
		System.out.println("11. Dr.Joseph		Neonatologist		saturday	12am-3am	9000Rs");
		System.out.println("12. Dr.Mary		Neurologist		Tuesday		3am-5:30	11000Rs");
		System.out.println("13. Dr.Elizabeth	Obstetrician		monday		6am-8am		120000Rs");
		System.out.println("14. Dr.Steven		Oncologist		saturday	8am-11am	15000Rs");
		System.out.println("15. Dr.Jaffery		Physiologist		friday		11am-1pm	3000Rs");
	}

	public void EmergencyDoctorList()
	{
		System.out.println("\n	Here is our list of Doctors for Emergencies :--");
		System.out.println("\nNames of doctors  	Doctors Of Diseases		Dr.fee");
		System.out.println("\n0.  Dr.Vijay   		 Heart attack			20000Rs");
		System.out.println("1.  Dr.khushi  		 Brain problem			5000Rs");
		System.out.println("2.  Dr.Manhotra  	 eyeSide Weak			1000Rs");
		System.out.println("3.  Dr.vedRam            Malaria			800Rs");
		System.out.println("4.  Dr.M.Hakim   	 Body Pain			600Rs");
		System.out.println("5.  Dr.M.Abdullah     	 Accident-Case			40000Rs");
		System.out.println("6.  Dr.M.H.Umer   	 Cancer Treatment		50000Rs");    
		System.out.println("7.  Dr.Kabeer       	 Infection			2000Rs");
		System.out.println("8.  Dr.Riyaa   		 Blind				1000Rs");
		System.out.println("9.  Dr.Veer   		 Deaf				1000Rs");
		System.out.println("10. Dr.Sachi	         Dumb				1000Rs");
		System.out.println("11. ANOTHER  		 DISEASE			");
	}

	public boolean getSituation()
	{
		System.out.println("Is patient condition serious");
		System.out.println("If serious press S else press N");
		Scanner input=new Scanner(System.in);
		String serious=input.nextLine();
		
		if(serious.equals("S") || serious.equals("s"))
		{
			isSerious = true;
			return true;
		}
		else
		{
			isSerious = false;
			return false;
		}
	}
}
