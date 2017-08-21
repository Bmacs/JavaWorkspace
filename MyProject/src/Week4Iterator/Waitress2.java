package Week4Iterator;

import java.awt.*;

public class Waitress2 {

    PancakeHouseMenu2 pancakeHouseMenu;
    DinerMenu2 dinerMenu;

    public Waitress2(PancakeHouseMenu2 pancakeHouseMenu, DinerMenu2 dinerMenu2) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu2;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("MENU\n----\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\n----\nLunch");
        printMenu(dinerIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() +  ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
