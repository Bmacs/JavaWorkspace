package Week4FactoryMethod;

public class CaliforniaVeggiePizza extends Pizza {
    public CaliforniaVeggiePizza() {
        name = "California Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}

