package hi;

public class Person {
	String fname;
	String lname;
	int age;
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
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
		return "Person: " + fname + " " + lname + ", " + age;
	}
	public Person makePerson(Person that) throws UnderAgeException{
		if (age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		Person child = new Person(this.fname, that.lname, 0);
		return child;
	}
	public static void main(String[] args) {
		Person p = new Person("Romeo", "Mon", 15);
		System.out.println("R" + p);
	}
}
