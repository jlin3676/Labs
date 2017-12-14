package lab4_1;

public class Card {

	private int PointValue;
	private String rank;
	private String suit;

	public Card(String rank, String suit, int PointValue) {
		this.rank = rank;
		this.suit = suit;
		this.PointValue = PointValue;
	}

	public boolean equals(Card otherCard) {
		if (PointValue == otherCard.PointValue) {
			return true;
		}
		return false;
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getPointValue() {
		return PointValue;
	}

	public void setRank(String rank) { 
		this.rank = rank;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setPointValue(int pointValue) {
		this.PointValue = pointValue;
	}

	public String toString() {
		return "Card [PointValue=" + this.PointValue + ", rank=" + this.rank + ", suit=" + this.suit + "]";
	}
          
}
