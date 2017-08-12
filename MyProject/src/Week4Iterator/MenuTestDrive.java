package Week4Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu2 dinerMenu = new DinerMenu2();

        Waitress2 alice = new Waitress2(null, dinerMenu);
        alice.printMenu();
    }
}
