package Week8CommandPatternLab;

public class OffBrainWaveDevice {
    BrainWaveDevice brainWaveDevice;

    public OffBrainWaveDevice(BrainWaveDevice brainWaveDevice) {
        this.brainWaveDevice = brainWaveDevice;
    }

    public void execute() {
        brainWaveDevice.off();
    }
}
