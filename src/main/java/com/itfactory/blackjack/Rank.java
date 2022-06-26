package com.itfactory.blackjack;

public enum Rank {
    ACE(1),    //I want that this instance (ACE) be associated with the "1" value.
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    /* A constructor is a method that returns a new instance of a class */
    Rank(int value) {
        this.value = value;
    }

    /* we might think to Rank.KING to something like:
       Rank QUEEN = new Rank("QUEEN");    Each time when we define a CONSTANT for an ENUM, it is fairly equivalent to having a line
                                          of code like this, where we have automatically generated a constructor that is sort of
                                          automatically setting the text of the CONSTANT on a property that we can't see, but it
                                          exists, and it's called NAME
                                          We can kind of override the default constructor !  fn+ALT+INSERT  */
    // Rank JACK = new Rank("JACK");
    // assertEquals(10, Rank.KING.getValue());
    public int getValue() {
        return value;
    }

    public int getValue1() {
        return switch (this) {
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
        };
    }
}
