package publique;

import connecteur.Connecteur;

import java.util.ArrayList;

public class ElementArchitecturale {

    public String nom;

    public ElementArchitecturale(String nom) {
        this.nom = nom;
    }

    public String getNom() { 
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
