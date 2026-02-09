package restAPI;

public class PersonAge {

	String firstname;
	String lastname;
	int age;
	public PersonAge (String fname, String lname, int age) {
		super();
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return firstname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.firstname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lastname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lastname = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person: " + firstname + " " + lastname + ", " + age ;
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException{
		if (age<18 || that.age<18){
		throw new UnderAgeException();
		}
		PersonAge child=new PersonAge(this.firstname,that.lastname,0);
		return child;
	}
	
	
	public static void main(String[] args) {
		PersonAge d=new PersonAge ("Dewey","Du", 20);
		System.out.println("D"+d);
	}
}


