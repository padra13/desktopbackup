/**
 * 
 */
package zooland;

/**
 * @author padra
 *
 */
public class Cat extends Animals {

	private CatBreed breed;
	
	
	
	/**
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age, CatBreed breed) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.breed = breed;
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CAT " +super.toString() +"breed="+ this.getBreed();
	}
	
	
	/**
	 * @return the breed
	 */
	public CatBreed getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(CatBreed breed) {
		this.breed = breed;
	}

	
	
	
}
