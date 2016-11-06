package publique;

import connecteur.Connecteur;

import java.util.ArrayList;

public class ElementArchitecturale {

    private String name;

    public ElementArchitecturale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
