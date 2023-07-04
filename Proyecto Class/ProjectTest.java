package poo;

import java.util.ArrayList;

public class ProjectTest {

	public static void main(String[] args) {

		Project p1 = new Project();
		p1.setNombre("Project 1");
		p1.setDescripcion("Descripcion 1");
		p1.setInitialCost(10.2);
//		System.out.println(p1.elevatorPitch());
		
		Project p2 = new Project("Project 2");
		p2.setDescripcion("Descripcion 2");
		p2.setInitialCost(5.3);
//		System.out.println(p2.elevatorPitch());
		
		Project p3 = new Project("Project 3", "Descripcion 3", 5.5);
//		System.out.println(p3.elevatorPitch());
		

		
		ArrayList<Project> project1 = new ArrayList<Project>();
		project1.add(p1);
		project1.add(p2);
		
		ArrayList<Project> project2 = new ArrayList<Project>();
		project2.add(p3);
		
		Portafolio portafolio1 = new Portafolio(project1);
		Portafolio portafolio2 = new Portafolio(project2);
		
		portafolio1.showPortfolio(1);
		portafolio2.showPortfolio(2);
	}	

}
