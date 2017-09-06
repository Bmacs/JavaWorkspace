package Week8CommandPattern;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garage) {
        this.garageDoor = garage;
    }

    public void execute() {
        garageDoor.up();
    }
}
