package Week7PhoneModels;

public abstract class CaseDecorator extends PhoneModel {
    PhoneModel phone;
    public abstract String getModel();

    public double Cost() {
        return phone.Cost();
    }
}
