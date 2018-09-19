package com.kata.pvbarredo;

import org.junit.Assert;
import org.junit.Test;

public class BowlingTest {

    @Test
    public void given_a_bowling_game_it_should_score() {

        BowlingGame bowlingGame = new BowlingGame();

        Frame frame = new Frame();

        Assert.assertNotNull(bowlingGame.getScore());

    }
}
