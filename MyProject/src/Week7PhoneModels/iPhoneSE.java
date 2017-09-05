package Week7PhoneModels;

public class iPhoneSE extends PhoneModel {

    public iPhoneSE() {
        model = "iPhone SE";
        size = Size.Standard;
        OS = "IOS 10";
    }

    public double Cost() {
        return 450;
    }
}
