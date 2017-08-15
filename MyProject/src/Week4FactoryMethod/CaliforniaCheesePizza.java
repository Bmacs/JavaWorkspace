package Week4FactoryMethod;

public class CaliforniaCheesePizza extends Pizza {
    public CaliforniaCheesePizza() {
        name = "California Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
