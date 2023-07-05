package com.hillel.impl;

import com.hillel.abstracts.AbstractPhone;

public class Androids extends AbstractPhone implements SmartPhones {

    public Androids(String phoneModel, int memory, int cameraOption) {
        super(phoneModel, memory, cameraOption);
    }

    @Override
    public void call() {
        System.out.println(getPhoneModel() + " is calling");
    }

    @Override
    public void sms() {
        System.out.println(getPhoneModel() + " is typing sms");
    }

    @Override
    public void internet() {
        System.out.println(getPhoneModel() + " is connected to the Web ");
    }

    @Override
    public void phoneInfo() {

        System.out.println("Модель: " + getPhoneModel() + " Память: " + getMemory() + "Gb" + " Камера: "
                + getCameraOption() + "Mpx");
    }
}
