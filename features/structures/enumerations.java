


//Java enumerations do not have raw values
public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING
}


public enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

public class Main {
	
	public String simpleDescription(Rank r) {
	        switch(r) {
	            case ACE:
	                return "ace";
	            case JACK:
	                return "jack";
	            case QUEEN:
	                return "queen";
	            case KING:
	                return "king";
	            default:
	                return String.parseInt(r);
	        }
	    }
	}
	
	public String simpleDescription(Suit r) {
	        switch(s) {
	            case SPADES = return "spades";
	            case HEARTS = return "hearts";
	            case DIAMONDS = return "diamonds";
	            case CLUBS = return "clubs";
	        }
	    }
	}
	
	public static void main(String[] args) {
			Suit hearts = Suit.HEARTS;
			Rank ace = Rank.ACE;
			
	}
}
