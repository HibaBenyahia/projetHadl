package configuration;

import composant.PortCpt;

import java.util.ArrayList;

public class InterfaceCfg{

    private ArrayList<PortCfg> portConfig;

    public InterfaceCfg(ArrayList<PortCfg> portConfig) {
        this.portConfig = portConfig;
    }

    public ArrayList<PortCfg> getPortConfig() {
        return portConfig;
    }

    public void setPortConfig(ArrayList<PortCfg> portConfig) {
        this.portConfig = portConfig;
    }
}
