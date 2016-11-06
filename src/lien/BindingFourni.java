package lien;


import composant.PortCptFourni;

public class BindingFourni extends Binding {
    //port cmp fourni
protected PortCptFourni portCptFourni;

    public BindingFourni(PortCptFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }



    public PortCptFourni getPortCptFourni() {
        return portCptFourni;
    }

    public void setPortCptFourni(PortCptFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }
}
