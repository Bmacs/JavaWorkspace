package Week8CommandPatternLab;

public class OffPhysicalFitnessDevice {
    PhysicalFitnessDevice physicalFitnessDevice;

    public OffPhysicalFitnessDevice(PhysicalFitnessDevice physicalFitnessDevice) {
        this.physicalFitnessDevice = physicalFitnessDevice;
    }

    public void execute() {
        physicalFitnessDevice.off();
    }
}
