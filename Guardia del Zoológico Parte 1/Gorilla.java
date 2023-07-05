package poo;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	public int throwSomething() {
		setEnergyLevel(getEnergyLevel()-5);
		System.out.println("Gorila lanza banana pierde un 5% > " + getEnergyLevel() + "% restante" );
		return getEnergyLevel();
	}
	public int eatBananas() {
		setEnergyLevel(getEnergyLevel()+10);
		System.out.println("Gorila come banana y recupera un 10% > " +getEnergyLevel() + "% restante");
		return getEnergyLevel();
	}
	public int climb() {
		setEnergyLevel(getEnergyLevel()-10);
		System.out.println("Gorila trepa a la cima y pierde un 10% > " +getEnergyLevel() + "% restante");
		return getEnergyLevel();
	}
}
