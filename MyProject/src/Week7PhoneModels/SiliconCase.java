package Week7PhoneModels;

public class SiliconCase extends PhoneModel {
    PhoneModel phone;

    public SiliconCase(PhoneModel phone) {
        this.phone = phone;
    }

    public String getModel() {
        return phone.getModel() + ", plus Silicon case";
    }

    public double Cost() {
        return phone.Cost() + 5;
    }

    public String getOS() {
        return phone.getOS();
    }
}
