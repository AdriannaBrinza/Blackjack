package com.itfactory.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.KING);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);

        System.out.println(card1);
        System.out.println(card2);
        // int total = card1.plus(card2);
        // Hand myHand = new Hand();
        // myHand.add(card1)
        // myHand.add(card2)
        // int total = myHand.getTotal();
    }

    @Override
    public String toString() {
        // JACK {Clubs symbol}
        return this.rank.toString().concat(" ").concat(this.suit.toString());
    }

    public int getValue() {
        return this.rank.getValue();
    }
}
