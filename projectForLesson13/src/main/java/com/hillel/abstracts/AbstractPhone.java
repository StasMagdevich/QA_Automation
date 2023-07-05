package com.hillel.abstracts;

public abstract class AbstractPhone {

    private String phoneModel;
    private int memory;
    private int cameraOption;

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCameraOption() {
        return cameraOption;
    }

    public void setCameraOption(int cameraOption) {
        this.cameraOption = cameraOption;
    }

    public AbstractPhone(String phoneModel, int memory, int cameraOption) {
        this.phoneModel = phoneModel;
        this.memory = memory;
        this.cameraOption = cameraOption;
    }

    public abstract void phoneInfo ();

}
