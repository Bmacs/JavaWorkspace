package Week4Iterator;

import java.awt.*;
import java.util.ArrayList;

public class Waitress1 {

    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

    DinerMenu1 dinerMenu = new DinerMenu1();
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    void printMenu() {

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

    }

    void printBreakfastMenu() {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
    void printLunchMenu() {


    }
    void printVegetarianMenu() {


    }
    boolean isItemVegetarian(String name) {
        return false;
    }
}
