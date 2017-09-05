package Week7PhoneModels;

public class PixelXL extends PhoneModel {
    public PixelXL() {
        model = "PixelXL";
        size = Size.Plus;
        OS = "Android Oreo";
    }

    @Override
    public double Cost() {
        return 800;
    }
}
