package poo;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Wizard w1 = new Wizard();
		Ninja n1 = new Ninja();
		Samurai s1 = new Samurai();
		
		h1.attack(h2);
		h1.attack(h2);
		System.out.println("\n");
		
		w1.heal(h2);
		w1.fireBall(h1);
		w1.fireBall(h1);
		System.out.println("\n");
		
		n1.steal(w1);
		n1.runAway();
		n1.runAway();
		System.out.println("\n");
		
		s1.deathBlow(w1);
		s1.deathBlow(n1);
		s1.meditate();
		s1.howMany();
		
	}

}
