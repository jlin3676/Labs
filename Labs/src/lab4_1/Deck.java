package lab4_1;
import lab4_1.Card;
import java.util.ArrayList;
public class Deck {

	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[]rank, String[]suit, int[] PointValue) {
		ArrayList<Card> undealt = new ArrayList<Card>();
		for(int i = 0; i < rank.length; i++) {
			String a = rank[i];
			int c = PointValue[i];
			for(String b : suit) {
				Card card = new Card(a,b,c);
				undealt.add(card);
			}
		}
		this.unDealt = undealt;
	}

	public boolean isEmpty() {
		return true;
	}
	
	public int size() {
		return 1;
	}
	
	public void shuffle() {
		
	}
}
