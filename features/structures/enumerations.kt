
enum class Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING
}

fun rankDescription(r : Rank) : String {
    return when(r) {
        Rank.ACE ->  "ace"
        Rank.JACK ->  "jack"
        Rank.QUEEN ->  "queen"
        Rank.KING ->  "king"
        else -> (r.ordinal + 1).toString()
    }
}



enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

fun suitDescription(s : Suit) : String {
    return when(s) {
        Suit.SPADES -> "spades"
        Suit.HEARTS -> "hearts"
        Suit.DIAMONDS -> "diamonds"
        Suit.CLUBS -> "clubs"
    }
}


fun main() {
    val ace = Rank.ACE
    val hearts = Suit.HEARTS
    rankDescription(ace)
    suitDescription(hearts)
}

