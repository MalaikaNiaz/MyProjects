import java.util.*;
public class HospitalPatients extends HospitalPerson
{
	private int age;
	private String gender;
	private int id=0;

	public HospitalPatients(){}

	public HospitalPatients(String name,String address,long contactNo,String emailAddress,int age,String gender,int id)
	{
		super(name,address,contactNo,emailAddress);
		this.age=age;
		this.gender=gender;
		this.id=id;		
	}

	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}	

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age=age;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender=gender;
	}

	public String toString()
	{

		return "\nPatient ID is: "+id+"Patient name is: "+getName()+"\nPatient address is: "+getAddress()+"\nPatient email is: "+getEmailAddress()+"\nPatient age is: "+age+"\nPatient gender is: "+gender;
	}

}
