package com.kata.pvbarredo;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BowlingTest {

    @Test
    public void given_a_bowling_game_it_should_score() {

        BowlingGame bowlingGame = new BowlingGame();
        Assert.assertNotNull(bowlingGame.getScore());

    }

    @Test
    public void given_all_shot_is_gutter_balls_then_score_should_be_0() {

        BowlingGame bowlingGame = new BowlingGame();
        List<Frame> frames = bowlingGame.getFrames();

        for (int i = 0; i < 10 ; i++) {
            frames.add(new Frame(0, 0));
        }

        Assert.assertEquals(0, bowlingGame.getScore());
    }
}
