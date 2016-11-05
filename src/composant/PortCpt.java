package composant;


import java.util.ArrayList;

import lien.Attachement;
import lien.Binding;

public class PortCpt extends InterfaceCpt {

//private ArrayList<Ports> ports;
	private String nom;
	private Attachement attachement; 
	private Binding binding;

public PortCpt(String nom, Attachement attachement, Binding binding) {
	// TODO Auto-generated constructor stub
    this.nom=nom;
    this.attachement= attachement;
    this.binding= binding;

}


    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Attachement getAttachement() {
        return attachement;
    }

    public void setAttachement(Attachement attachement) {
        this.attachement = attachement;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }
}
