struct Card {
    Rank rank;
    Suit suit;

	string simpleDescription() {
    	return "The \(rank.simpleDescription()) of \(suit.simpleDescription())"
	}
};

struct Card threeOfSpades = {three, "spades"};
string threeOfSpadesDescription = threeOfSpades.simpleDescription();
