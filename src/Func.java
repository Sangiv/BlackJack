
public class Func {
	
	public String Play() {
		int dealer1 = (int)(Math.random()*22);
		int dealer2 = (int)(Math.random()*22);
		int dealerHand = dealer1 + dealer2;
		
		int player1 = (int)(Math.random()*22);
		int player2 = (int)(Math.random()*22);
		int playerHand = player1 + player2;
		
		System.out.println("Dealer Hand: " + dealerHand);
		System.out.println("Player Hand: " + playerHand);
		
		
		if(dealerHand > 21) {
			return ("Dealer is Bust, Player wins");
		} else if ((dealerHand < 22) && (dealerHand > playerHand)) {
			return ("Dealer Wins");
		} else if ((playerHand < 22) && (playerHand > dealerHand)) {
			return ("Player Wins");
		} else {
			return ("Player is Bust, Dealer Wins");
		}
	}
	
}
