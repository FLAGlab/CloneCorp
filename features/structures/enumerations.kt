
enum class Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING
}

fun simpleDescription(Rank r) {
        switch(r) {
            case ACE:
                return "ace"
            case JACK:
                return "jack"
            case QUEEN:
                return "queen"
            case KING:
                return "king"
            default:
                return to_string((int)r)
        }
    }
}


enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

fun simpleDescription(Suit r) {
        return when(s) {
            Suit.SPADES -> "spades"
            Suit.HEARTS -> "hearts"
            Suit.DIAMONDS -> "diamonds"
            Suit.CLUBS -> "clubs"
        }
    }
}

fun main() {
	vale ace = Rank.ACE
	val hearts = Suit.HEARTS
	simpleDescription(ace)
	simpleDescription(hearts)
}

