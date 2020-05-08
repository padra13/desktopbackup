/**
 * 
 */
package zooland;

/**
 * @author padra
 *
 */
public class Animals {

	private String name;
	private int age;
	private boolean adopted;
	
	/**
	 * default constructor
	 */
	public Animals() {
		
	}
	
	/**
	 * @param name
	 * @param age
	 */
	public Animals(String name, int age) {
		
		//super();
		this.setName(name);
		this.setAge(age);
		this.setAdopted(false);
		
	}

	/**
	 * @return the adopted
	 */
	public boolean isAdopted() {
		return adopted;
	}

	/**
	 * @param adopted the adopted to set
	 */
	public void setAdopted(boolean adopted) throws IllegalArgumentException{
		if(adopted == true || adopted == false) {
			this.adopted = adopted;
			
		}else {
			throw new IllegalArgumentException("Invalid entry");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name the name to set
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() > 0 && name.length() <= 20) {
			this.name = name;

		} else {
			throw new IllegalArgumentException("Name too long");
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age the age to set
	 * @throws IllegalArgumentException
	 */
	public void setAge(int age) throws IllegalArgumentException {

		if (age > 0 && age <= 20) {
			this.age = age;

		} else {
			throw new IllegalArgumentException("Not a valid age");
		}

	}

	/*
	 * 
	 */
	public void makeSound() {
		System.out.println("Making a sound");
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age+", adopted="+adopted;
	}

}
