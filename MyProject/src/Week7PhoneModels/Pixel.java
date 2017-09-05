package Week7PhoneModels;

public class Pixel extends PhoneModel {
    public Pixel() {
        model = "Pixel";
        size = Size.Standard;
        OS = "Android Oreo";
    }

    @Override
    public double Cost() {
        return 700;
    }
}
