package week3;

public class HonoluluBuffetBuilder extends SoupBuffetBuilder {

	public void buildClamChowder() {
		soupBuffet.clamChowder = new HonoluluClamChowder();
	}
	
	public void buildFishBuilder() {
		soupBuffet.fishChowder = new HonoluluFishChowder();
	}
	
	public void setSoupBuffetName() {
		soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
	}
}
