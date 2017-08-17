package MidtermHarryPotter;

public abstract class Game {
    public Game() {
    }

    int unitPrice = 80;
    double stateTax;

    public double potentialRevenue() {
        double revenue = unitPrice + (unitPrice * stateTax);

        return revenue * 10000;
    }

    public abstract double getStateTax();

}
