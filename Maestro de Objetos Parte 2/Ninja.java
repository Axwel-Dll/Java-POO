package poo;

public class Ninja extends Human{
	
	public Ninja() {
		super();
		setStealth(10);
	}
	
	public Ninja(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.getStealth());
		this.setHealth(this.getHealth() + this.getStealth());
		System.out.println(getClass().getSimpleName() + " Roba "+ getStealth() + " pts de salud a " + human.getClass().getSimpleName() + " vida restante: " + human.getHealth() + " pts");
		System.out.println("Salud de ninja ha incrementado a: " + this.getHealth() + " pts");
	}
	public void runAway() {
		setHealth(getHealth() - 10);
		System.out.println(getClass().getSimpleName() + " Escapa, salud reducida a: " + this.getHealth() + " pts");
	}
}
