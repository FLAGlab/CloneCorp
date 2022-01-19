enum Rank {
    jack, queen, king, ace = 1, two = 2, three = 3, four = 4, five = 5, six=6, seven=7, eight=8, nine=9, ten=10
};

string simpleDescription(Rank r) {
        switch(r) {
            case ace:
                return "ace"
            case jack:
                return "jack"
            case queen:
                return "queen"
            case king:
                return "king"
            default:
                return to_string((int)r)
        }
    }
}
Rank a = two;
int twoValue = two;

enum Suit {
    spades, hearts, diamonds, clubs
};

string simpleDescription(Suit s) {
        switch(s) {
            case spades:
                return "spades"
            case hearts:
                return "hearts"
            case diamonds:
                return "diamonds"
            case clubs:
                return "clubs"
        }
    }
}
Suit h = hearts;
string heartsDescription = simpleDescription(h);
