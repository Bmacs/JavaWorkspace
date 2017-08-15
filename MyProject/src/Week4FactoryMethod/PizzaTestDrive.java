package Week4FactoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();
        PizzaStore caliStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First Customer ordered a " + pizza.getName() + "\n");


        pizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Second Customer ordered a " + pizza.getName() + "\n");

        pizza = caliStore.orderPizza("cheese");
        System.out.println("Third Customer ordered a " + pizza.getName() + "\n");
    }
}
