package Week7PhoneModels;

public abstract class PhoneModel {

    public enum Size {Standard, Plus}
    Size size = Size.Standard;
    public enum Color {Black, White, Gold}
    Color color = Color.Black;
    String model = "Model of Phone";
    String OS;

    public String getModel() {
        return model;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOS() {
        return OS;
    }

    public abstract double Cost();
}
