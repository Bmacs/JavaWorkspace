package Week4Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu2 dinerMenu = new DinerMenu2();
        PancakeHouseMenu2 pancakeMenu = new PancakeHouseMenu2();

        Waitress2 alice = new Waitress2(null, dinerMenu);
        alice.printMenu();

        Waitress2 steph = new Waitress2(pancakeMenu, dinerMenu);
        steph.printMenu();
    }
}
