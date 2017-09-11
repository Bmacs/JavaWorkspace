package Week8CommandPatternLab;

public class OnPysicalFitnessDevice {
    PhysicalFitnessDevice physicalFitnessDevice;

    public OnPysicalFitnessDevice(PhysicalFitnessDevice physicalFitnessDevice) {
        this.physicalFitnessDevice = physicalFitnessDevice;
    }

    public void execute() {
        physicalFitnessDevice.on();
    }
}
