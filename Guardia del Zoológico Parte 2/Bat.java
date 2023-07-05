package poo;

public class Bat extends Mammal{
	public Bat() {
		super();
		setEnergyLevel(300);
	}
	public int fly() {
		setEnergyLevel(getEnergyLevel()-50);
		System.out.println("'Sonido de volar' y pierde un 50% > " + getEnergyLevel() + "% restante" );
		return getEnergyLevel();
	}
	public int eatHumans() {
		setEnergyLevel(getEnergyLevel()+25);
		System.out.println("bueno no importa y recupera un 25% > " +getEnergyLevel() + "% restante");
		return getEnergyLevel();
	}
	public int attackTown() {
		setEnergyLevel(getEnergyLevel()-100);
		System.out.println("'sonido de llamas' y pierde un 10% > " +getEnergyLevel() + "% restante");
		return getEnergyLevel();
	}
}
