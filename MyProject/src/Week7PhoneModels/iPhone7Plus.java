package Week7PhoneModels;

public class iPhone7Plus extends PhoneModel {
    public iPhone7Plus() {
        model = "iPhone 7 Plus";
        size = Size.Plus;
        OS = "IOS 11";
    }

    public double Cost() {
        return 700;
    }
}
