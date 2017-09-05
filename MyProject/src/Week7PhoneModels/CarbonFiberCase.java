package Week7PhoneModels;

public class CarbonFiberCase extends CaseDecorator {
    PhoneModel phone;

    public CarbonFiberCase(PhoneModel phone) {
        this.phone = phone;
    }

    public String getModel() {
        return phone.getModel() + ", plus Carbon Fiber case";
    }

    public double Cost() {
        return phone.Cost() + 10;
    }

    public String getOS() {
        return phone.getOS();
    }
}
