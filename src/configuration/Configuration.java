package configuration;

import lien.Attachement;
import lien.Binding;
import publique.ElementArchitecturale;
import composant.Composant;
import connecteur.Connecteur;

import javax.sound.sampled.Port;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Configuration extends ElementArchitecturale{
	

	private ArrayList<Composant> composant;
	private ArrayList<Connecteur> connecteur;
	private ArrayList<Port> port;
	private ArrayList<Attachement> attachement;
	private ArrayList<Binding> binding;


	public Configuration(ArrayList<Composant> composant, ArrayList<Connecteur> connecteur, ArrayList<Port> port, ArrayList<Attachement> attachement, ArrayList<Binding> binding) {

		this.composant = composant;
		this.connecteur = connecteur;
		this.port = port;
		this.attachement = attachement;
		this.binding = binding;
	}

	public ArrayList<Composant> getComposant() {
		return composant;
	}

	public void setComposant(ArrayList<Composant> composant) {
		this.composant = composant;
	}

	public ArrayList<Connecteur> getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(ArrayList<Connecteur> connecteur) {
		this.connecteur = connecteur;
	}

	public ArrayList<Port> getPort() {
		return port;
	}

	public void setPort(ArrayList<Port> port) {
		this.port = port;
	}


}
