package br.com.diogomatheus.classes;

import br.com.diogomatheus.interfaces.Electronic;

public class BlurayPlayerImpl implements Electronic {

    private boolean status = false;

    public void turnOn() {
        System.out.println("Turning on the Bluray Player");
        this.status = true;
    }

    public void turnOff() {
        System.out.println("Turning off the Bluray Player");
        this.status = false;
    }

    public boolean isOn() {
        return status;
    }

}