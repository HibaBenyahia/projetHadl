package composant;

import publique.ElementArchitecturale;

import java.util.ArrayList;

public class Composant extends ElementArchitecturale{

	//InterfaceCpt[] interfaces;
	private String nom;
	private ArrayList<InterfaceCpt> interfaceCpt;

	public Composant(String nom, ArrayList<InterfaceCpt> interfaceCpt) {
		this.nom = nom;
		this.interfaceCpt = interfaceCpt;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<InterfaceCpt> getInterfaceCpt() {
		return interfaceCpt;
	}

	public void setInterfaceCpt(ArrayList<InterfaceCpt> interfaceCpt) {
		this.interfaceCpt = interfaceCpt;
	}
}
