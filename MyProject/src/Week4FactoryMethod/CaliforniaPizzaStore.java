package Week4FactoryMethod;

public class CaliforniaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equalsIgnoreCase("cheese"))
            return new CaliforniaCheesePizza();
        else if (item.equalsIgnoreCase("veggie"))
            return new CaliforniaVeggiePizza();
        else if (item.equalsIgnoreCase("clam"))
            return new CaliforniaClamPizza();
        else if (item.equalsIgnoreCase("pepperoni"))
            return new CaliforniaPepperoniPizza();
        else
            return null;
    }
}
