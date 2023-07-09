package DZ_14;

public abstract class AbstractPhone {

    private String phoneModel;
    private int memory;
    private int cameraOption;

    private OperationSystem ops;

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

    public OperationSystem getOps() {
        return ops;
    }

    public AbstractPhone(OperationSystem ops, String phoneModel, int memory, int cameraOption) {
        this.ops = ops;
        this.phoneModel = phoneModel;
        this.memory = memory;
        this.cameraOption = cameraOption;
    }

    public abstract void phoneInfo();


}
