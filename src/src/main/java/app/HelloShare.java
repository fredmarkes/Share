package app;

import objects.*;

public class HelloShare {

	public static void main(String[] args) {
		
		Person fred = new Fred();
		fred.setFirstName("Frederico");
		fred.setLastName("Marques");
		fred.setAge(33);
		fred.setHeight(172.2);
		fred.setWeight(54.4);
		System.out.println(fred.getFirstName());
		System.out.println(fred.getLastName());
		System.out.println("Got in");
	}

}
