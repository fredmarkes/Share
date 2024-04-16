package objects;

public class Fred implements Person {
	
	String firstName;
	String LastName;
	int age;
	double height;
	double weight; 

	public Fred() {
	}
	public Fred(String firstName, String lastName, int age, double height, double weight) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}