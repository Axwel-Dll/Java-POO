package poo;

public class Samurai extends Human{
	
	public Samurai() {
		super();
		setHealth(200);
	}
	public Samurai(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth() / 2);
		System.out.println(getClass().getSimpleName() + " Asesina a: " + human.getClass().getSimpleName() + " y su vida se reduce a: " + this.getHealth());
	}
	public void meditate() {
		int health = this.getHealth() / 2;
		this.setHealth(this.getHealth() + health );
		System.out.println(getClass().getSimpleName() + " Se cura " + health + " pts");
	}
	public void howMany() {
		System.out.println("Vida de " + getClass().getSimpleName() + " = " + this.getHealth());
	}

}
