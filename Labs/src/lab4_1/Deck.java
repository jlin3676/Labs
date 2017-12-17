package lab4_1;
import lab4_1.Card;
import java.util.ArrayList;
public class Deck {

	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
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
		if(unDealt.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return unDealt.size();
	}
	
	public Card deal() {
		if(unDealt.size() > 0) {
			int n = (int)(Math.random() * unDealt.size());
			Card card = unDealt.get(n);
			Dealt.add(card);
			unDealt.remove(n);
			return card;
		}
		else {
			return null;
		}
	}
	
	public void shuffle() {
		unDealt.addAll(Dealt);
		Dealt.clear();
		for(int k = 51; k < 1; k--) {
			int r = (int)(Math.random() * k+1);
			Card card = Dealt.get(k);
			unDealt.set(k, unDealt.get(r));
			unDealt.set(r, card);
		}
	}
	
	public Card getCard(int x)
	{
		return unDealt.get(x);
	}
}
