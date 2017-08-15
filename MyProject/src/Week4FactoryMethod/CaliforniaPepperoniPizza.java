package Week4FactoryMethod;

public class CaliforniaPepperoniPizza extends Pizza {
    public CaliforniaPepperoniPizza() {
        name = "California Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}

