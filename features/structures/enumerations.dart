//Dart only supports structs with fields of types int, double, or pointer
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING
}

rankDescription(Rank r) {
  switch(r) {
      case Rank.ACE:
          return "ace";
      case Rank.JACK:
          return "jack";
      case Rank.QUEEN:
          return "queen";
      case Rank.KING:
          return "king";
      default:
          return (r.index + 1).toString();
  }
}


enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

suitDescription(Suit s) {
  switch(s) {
      case Suit.SPADES : return "spades";
      case Suit.HEARTS : return "hearts";
      case Suit.DIAMONDS : "diamonds";
      case Suit.CLUBS : "clubs";
  }
}

void main() {
	Rank ace = Rank.ACE;
	Suit hearts = Suit.HEARTS;
	rankDescription(ace);
	suitDescription(hearts);
}

