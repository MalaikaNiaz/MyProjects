import java.util.*;
public abstract class HospitalPerson
{
	private String name;
	private String address;
	private long contactNo;
	private String emailAddress;

	public HospitalPerson(){}
	
	public HospitalPerson(String name,String address,long contactNo,String emailAddress)
	{
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
		this.emailAddress=emailAddress;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address=address;
	}

	public long getContactNo()
	{
		return contactNo;
	}

	public void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress=emailAddress;
	}

	public abstract String toString();
	
}
 
