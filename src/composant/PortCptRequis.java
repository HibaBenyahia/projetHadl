package composant;

import lien.Attachement;
import lien.Binding;
import lien.BindingRequis;

import java.util.ArrayList;

public class PortCptRequis extends PortCpt {
	private Attachement attachement;
	private BindingRequis bindingRequis;

	public PortCptRequis(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1, Attachement attachement, BindingRequis bindingRequis) {
		super(nom, serviceCS, portCpt, nom1);
		this.attachement = attachement;
		this.bindingRequis = bindingRequis;
	}
}
