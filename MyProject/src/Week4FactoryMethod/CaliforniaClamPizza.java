package Week4FactoryMethod;

public class CaliforniaClamPizza extends Pizza {
    public CaliforniaClamPizza() {
        name = "California Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}

