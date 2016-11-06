package configuration;

import lien.Binding;
import lien.BindingFourni;

import java.util.ArrayList;

public class PortCfgFourni extends PortCfg {
    private BindingFourni bindingFourni;

    public PortCfgFourni(ArrayList<PortCfg> portConfig, String nom, Binding binding, BindingFourni bindingFourni) {
        super(portConfig, nom, binding);
        this.bindingFourni = bindingFourni;
    }
}
