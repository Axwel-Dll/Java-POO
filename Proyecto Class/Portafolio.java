package poo;

import java.util.ArrayList;

public class Portafolio {
	private ArrayList<Project> projects;

	
	public Portafolio(ArrayList<Project> projects) {
		super();
		this.projects = projects;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public double getPortfolioCost() {
		double total = 0;
		for (Project p : projects) {
			total += p.getInitialCost();
		}
		return total;
	}

	public void showPortfolio(int num) {
		System.out.println("\nPortafolio " + num);
		
		for (Project p : projects) {
			System.out.println(p.elevatorPitch());
		}
		System.out.println("Total: $" + getPortfolioCost());
	}

}
