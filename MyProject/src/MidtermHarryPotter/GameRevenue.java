package MidtermHarryPotter;

public class GameRevenue {
    protected Game potentialRevenue(String item) {
        if (item.equalsIgnoreCase("arizona"))
            return new Arizona();
        else if (item.equalsIgnoreCase("arkansas"))
            return new Arkansas();
        else if (item.equalsIgnoreCase("alaska"))
            return new Alaska();
        else if (item.equalsIgnoreCase("alabama"))
            return new Alabama();
        else if (item.equalsIgnoreCase("california"))
            return new California();
        else if (item.equalsIgnoreCase("colorada"))
            return new Colorado();
        else if (item.equalsIgnoreCase("connecticut"))
            return new Connecticut();
        else
            return null;
    }
}
