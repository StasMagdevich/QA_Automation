package DZ_14;

public class Main {

    public static void main(String[] args) {
        IPhones iphoneObject = new IPhones(OperationSystem.IOS, "iPhone7", 32, 16);
        Androids androidObject = new Androids(OperationSystem.ANDROID, "Xiaomi", 64, 16);
        androidObject.phoneInfo();
        androidObject.call();
        iphoneObject.phoneInfo();
        iphoneObject.sms();
        androidObject.internet();

    }

}