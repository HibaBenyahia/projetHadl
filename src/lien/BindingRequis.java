package lien;

import configuration.PortCfgRequis;

public class BindingRequis extends Binding {

    private PortCfgRequis portCfgRequis;

    public BindingRequis(PortCfgRequis portCfgRequis) {
        this.portCfgRequis = portCfgRequis;
    }

    public PortCfgRequis getPortCfgRequis() {
        return portCfgRequis;
    }

    public void setPortCfgRequis(PortCfgRequis portCfgRequis) {
        this.portCfgRequis = portCfgRequis;
    }
}
