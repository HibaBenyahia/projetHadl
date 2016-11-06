package connecteur;

import composant.InterfaceCpt;
import publique.ElementArchitecturale;

import java.util.ArrayList;

public class Connecteur extends ElementArchitecturale{
	
	private ArrayList<Glue> glue ;
	private ArrayList<InterfaceCpt> interfaceCpts;

	public Connecteur(String name, ArrayList<Glue> glue, ArrayList<InterfaceCpt> interfaceCpts) {
		super(name);
		this.glue = glue;
		this.interfaceCpts = interfaceCpts;
	}

	public ArrayList<Glue> getGlue() {
		return glue;
	}

	public void setGlue(ArrayList<Glue> glue) {
		this.glue = glue;
	}

	public ArrayList<InterfaceCpt> getInterfaceCpts() {
		return interfaceCpts;
	}

	public void setInterfaceCpts(ArrayList<InterfaceCpt> interfaceCpts) {
		this.interfaceCpts = interfaceCpts;
	}
}
