package poo;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Wizard w1 = new Wizard();
		Ninja n1 = new Ninja();
		
		h1.attack(h2);
		h1.attack(h2);
		
		w1.attack(h1);
		w1.attack(n1);
		
	}

}
