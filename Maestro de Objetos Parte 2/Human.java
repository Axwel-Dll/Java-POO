package poo;

public class Human {
	private int strength, stealth , intelligence, health;
	
	
	public Human() {
		super();
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}

	public Human(int strength, int stealth, int intelligence, int health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println(getClass().getSimpleName() + " ataca a " + human.getClass().getSimpleName()+", daño realizado: "+ getStrength() + "pts, vida restante: " + human.getHealth() + " pts");
	}
	
}
