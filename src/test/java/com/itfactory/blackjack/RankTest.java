package com.itfactory.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {

    @Test
    void getValueOfKing() {
        //we might think to Rank.KING to something like:
        //Rank QUEEN = new Rank("QUEEN");
        //Rank JACK = new Rank("JACK");
        assertEquals(10, Rank.KING.getValue());
    }
}