import java.util.Date;
public class HospitalPatientData 
{
    	private int id;
    	private Date dateOfBirth;
    	private int age;
    	private String physician;
    
    	public HospitalPatientData(){}
    	public HospitalPatientData(int id, Date dateOfBirth, int age, String physician) 
	{
    	    	this.id = id;
    	    	this.dateOfBirth = dateOfBirth;
    	    	this.age = age;
    	    	this.physician = physician;
    	}

    	public int getId() 
	{
        	return id;
    	}

    	public void setId(int id) 
	{
        	this.id = id;
    	}

    	public Date getDateOfBirth() 
	{
        	return dateOfBirth;
    	}

    	public void setDateOfBirth(Date dateOfBirth) 
	{
    	    	this.dateOfBirth = dateOfBirth;
    	}
	
    	public int getAge() 
	{
    	    	return age;
    	}
	
    	public void setAge(int age) 
	{
    	    	this.age = age;
    	}
	
    	public String getPhysician() 
	{
    	    	return physician;
    	}

    	public void setPhysician(String physician) 
	{
    	    	this.physician = physician;
    	}

    	@Override
    	public String toString() 
	{
    	    	return "HospitalPatientData{" +
    	            	"id=" + id +
    	            	", dateOfBirth=" + dateOfBirth +
    	            	", age=" + age +
    	            	", physician='" + physician + '\'' +
    	            	'}';
    	}
}	
		
