package Week4FactoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First Customer ordered a " + pizza.getName() + "\n");


        pizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Second Customer ordered a " + pizza.getName() + "\n");
    }
}
