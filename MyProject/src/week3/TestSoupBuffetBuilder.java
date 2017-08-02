package week3;

public class TestSoupBuffetBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoupBuffet bostonSoupBuffet = CreateSoupBuffer(new BostonSoupBuffetBuilder());
		System.out.println("At the " + bostonSoupBuffet.getSoupBuffetName() + bostonSoupBuffet.getTodaysSoups());
		
		SoupBuffet honoluluSoupBuffet = CreateSoupBuffer(new HonoluluBuffetBuilder());
		System.out.println("At the " + honoluluSoupBuffet.getSoupBuffetName() + honoluluSoupBuffet.getTodaysSoups());

	}
	
	public static SoupBuffet CreateSoupBuffer (SoupBuffetBuilder soupBuffetBuilder) {
		
		soupBuffetBuilder.buildSoupBuffet();
		
		soupBuffetBuilder.setSoupBuffetName();
		soupBuffetBuilder.buildChickenSoup();
		soupBuffetBuilder.buildClamChowder();
		soupBuffetBuilder.buildFishChowder();
		soupBuffetBuilder.buildMinnestrone();
		soupBuffetBuilder.buildPastafazul();
		soupBuffetBuilder.buildTofuSoup();
		soupBuffetBuilder.buildVegatableSoup();
		
		return soupBuffetBuilder.getSoupBuffet();


	}

}
