package Week8CommandPatternLab;

public class OnMouseDevice3d {
    MouseDevice3d mouseDevice3d;
    public OnMouseDevice3d(MouseDevice3d mouseDevice3d) {
        this.mouseDevice3d = mouseDevice3d;
    }

    public void execute() {
        mouseDevice3d.on();
    }
}
