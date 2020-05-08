/**
 * 
 */
package rev;

/**
 * @author padra
s *
 */
public class Person {

	private String name;
	private int age;
	private boolean isAlive;

	public Person() {

	}

	/**
	 * @param name
	 * @param age
	 * @param isAlive
	 */
	public Person(String name, int age) {
		// super();
		this.name = name;
		this.age = age;
		this.setAlive(true);
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	
	
	
	
/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = true;
	}

	/*
	public boolean recordDeath() {
		return this.isAlive = false;
	}
*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isAlive=" + isAlive + "]";
	}

}