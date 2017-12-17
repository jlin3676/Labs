package lab4_1;
import lab4_1.Card;
import lab4_1.Deck;
public class DeckTester {

	public static void main(String[] args)
	{
		String[] rank = {"A", "B", "C"};
		String[] suit = {"heart", "spade", "club", "diamond"};
		int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck Deck = new Deck(rank, suit, pointValue);
		
		System.out.println(Deck.isEmpty());
		
		Deck.shuffle();
		
		for(int i = 0; i < Deck.size(); i++)
		{
			System.out.println(Deck.getCard(i).toString());
		}
		System.out.println(Deck.size());
		
		Deck.shuffle();
		
		for(int i = 0; i < Deck.size(); i++)
		{
			System.out.println(Deck.getCard(i).toString());
		}
		System.out.println(Deck.size());
		
		System.out.println(Deck.isEmpty());
	}

}
