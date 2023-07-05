package poo;

public class Wizard extends Human{
	
	
	public Wizard() {
		super();
		setHealth(50);
		setIntelligence(8);
	}
	
	public Wizard(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}
	public void heal(Human human) {
		human.setHealth(human.getHealth()+ this.getIntelligence());
		System.out.println(getClass().getSimpleName() + " Cura a " + human.getClass().getSimpleName() + ", curacion realizada: "+ getIntelligence() + "pts, vida actual: " + human.getHealth() + " pts");
	}
	public void fireBall(Human human) {
		int dmg = this.getIntelligence()*3;
		human.setHealth(human.getHealth() - dmg);
		System.out.println(getClass().getSimpleName() + " Castea Bola de Fuego a " + human.getClass().getSimpleName()+", daño realizado: "+ dmg + "pts, vida restante: " + human.getHealth() + " pts");
	}
}
