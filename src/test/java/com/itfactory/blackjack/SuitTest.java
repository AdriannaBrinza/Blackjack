package com.itfactory.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    public void heartPrintsHeart() {
        assertEquals("\u2665", Suit.HEARTS.toString());
    }

}