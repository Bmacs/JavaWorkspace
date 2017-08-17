package MidtermHarryPotter;

public class Driver {
    public static void main(String[] args) {
        Game alabama = new Alabama();
        Game alaska = new Alaska();
        Game arizona = new Arizona();
        Game arkansas = new Arkansas();
        Game california = new California();
        Game colorado = new Colorado();
        Game connecticut = new Connecticut();

        System.out.println(arizona.potentialRevenue() * arizona.getStateTax());
        System.out.println(alaska.potentialRevenue());
        System.out.println(alabama.potentialRevenue() * alabama.getStateTax());
        System.out.println(arkansas.potentialRevenue() * arkansas.getStateTax());
        System.out.println(california.potentialRevenue() * california.getStateTax());
        System.out.println(colorado.potentialRevenue() * colorado.getStateTax());
        System.out.println(connecticut.potentialRevenue() * connecticut.getStateTax());



    }
}
