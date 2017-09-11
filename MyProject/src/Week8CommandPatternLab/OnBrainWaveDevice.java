package Week8CommandPatternLab;

public class OnBrainWaveDevice {
    BrainWaveDevice brainWaveDevice;

    public OnBrainWaveDevice(BrainWaveDevice brainWaveDevice) {
        this.brainWaveDevice = brainWaveDevice;
    }

    public void execute() {
        brainWaveDevice.on();
    }
}
