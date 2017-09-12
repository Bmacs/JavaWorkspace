package Week8CommandPatternLab;

public class ConsoleBoxTest {
    public static void main(String[] args) {

        BrainWaveDevice brainWaveDevice = new BrainWaveDevice();
        MouseDevice3d mouseDevice3d = new MouseDevice3d();
        PhysicalFitnessDevice physicalFitnessDevice = new PhysicalFitnessDevice();

        OnBrainWaveDevice onBrainWaveDevice = new OnBrainWaveDevice(brainWaveDevice);
        OffBrainWaveDevice offBrainWaveDevice = new OffBrainWaveDevice(brainWaveDevice);
        OnMouseDevice3d onMouseDevice3d = new OnMouseDevice3d(mouseDevice3d);
        OffMouseDevice3d offMouseDevice3d = new OffMouseDevice3d(mouseDevice3d);
        OnPysicalFitnessDevice onPysicalFitnessDevice = new OnPysicalFitnessDevice(physicalFitnessDevice);
        OffPhysicalFitnessDevice offPhysicalFitnessDevice = new OffPhysicalFitnessDevice(physicalFitnessDevice);

        System.out.println("<---- Brain Wave Device ---->");
        onBrainWaveDevice.execute();
        System.out.println();
        offBrainWaveDevice.execute();
        System.out.println();
        System.out.println("<---- Mouse Device ---->");
        onMouseDevice3d.execute();
        System.out.println();
        offMouseDevice3d.execute();
        System.out.println();
        System.out.println("<---- Physical Fitness Device ---->");
        onPysicalFitnessDevice.execute();
        System.out.println();
        offPhysicalFitnessDevice.execute();



    }
}
