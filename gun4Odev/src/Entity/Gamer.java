package Entity;

import Abstract.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String firstname;
	private String lastname;
	private String nationalityId;
	private int dateOfBirth;
	
	
	
	public Gamer(int id, String firstname, String lastname, String nationalityId, int dateOfBirth) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
