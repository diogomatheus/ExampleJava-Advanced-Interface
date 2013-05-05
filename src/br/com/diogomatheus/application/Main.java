package br.com.diogomatheus.application;

import br.com.diogomatheus.classes.BlurayPlayerImpl;
import br.com.diogomatheus.classes.RemoteControlImpl;
import br.com.diogomatheus.classes.TelevisionImpl;
import br.com.diogomatheus.interfaces.Electronic;
import br.com.diogomatheus.interfaces.RemoteControl;

public class Main {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControlImpl();
        Electronic television = new TelevisionImpl();
        Electronic blurayPlayer = new BlurayPlayerImpl();

        remote.tooglePower(television);
        remote.tooglePower(blurayPlayer);
        remote.tooglePower(blurayPlayer);
        remote.tooglePower(television);
    }

}