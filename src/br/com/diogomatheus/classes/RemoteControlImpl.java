package br.com.diogomatheus.classes;

import br.com.diogomatheus.interfaces.Electronic;
import br.com.diogomatheus.interfaces.RemoteControl;

public class RemoteControlImpl implements RemoteControl {

    public void tooglePower(Electronic electronic) {
        if(!electronic.isOn()) {
            electronic.turnOn();
        } else {
            electronic.turnOff();
        }
    }

}