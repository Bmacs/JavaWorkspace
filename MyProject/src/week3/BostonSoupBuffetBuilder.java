package week3;

public class BostonSoupBuffetBuilder extends SoupBuffetBuilder {

	public void buildClamChowder() {
		soupBuffet.clamChowder = new BostonClamChowder();
	}
	
	public void buildFishChowder() {
		soupBuffet.fishChowder = new BostonFishChowder();
	}
	
	public void setSoupBuffetName() {
		soupBuffet.soupBuffetName = "Boston Soup Buffet";
	}
}
