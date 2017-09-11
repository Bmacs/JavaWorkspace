package Week8CommandPatternLab;

public class OffMouseDevice3d {
    MouseDevice3d mouseDevice3d;

    public OffMouseDevice3d(MouseDevice3d mouseDevice3d) {
        this.mouseDevice3d = mouseDevice3d;
    }

    public void execute() {
        mouseDevice3d.off();
    }
}
