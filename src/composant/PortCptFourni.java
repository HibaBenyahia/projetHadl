package composant;

import lien.Attachement;
import lien.Binding;
import lien.BindingFourni;

import java.util.ArrayList;

public class PortCptFourni extends PortCpt{
	private Attachement attachement = new Attachement();

	public PortCptFourni(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1, Attachement attachement) {
		super(nom, serviceCS, portCpt, nom1);
		this.attachement = attachement;
	}



	public Attachement getAttachement() {
		return attachement;
	}

	public void setAttachement(Attachement attachement) {
		this.attachement = attachement;
	}

}
