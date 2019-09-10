
public class Dog extends Animal{
	
	public Dog(String name, int legs) {
		super.name = name;
		super.legs = legs;
	}
	
	public String toString() {
		return super.name + ": " + super.legs;
	}
}
