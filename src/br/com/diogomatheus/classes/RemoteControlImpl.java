package br.com.diogomatheus.classes;

import br.com.diogomatheus.interfaces.Electronic;
import br.com.diogomatheus.interfaces.RemoteControl;

public class RemoteControlImpl implements RemoteControl {

    public void togglePower(Electronic electronic) {
        if(!electronic.isOn()) {
            electronic.turnOn();
        } else {
            electronic.turnOff();
        }
    }

}