package com.kata.pvbarredo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BowlingGameTest {

    BowlingGame bowlingGame;
    List<Frame> frames;

    @Before
    public void setup(){
        bowlingGame = new BowlingGame();
        frames = bowlingGame.getFrames();
    }

    @Test
    public void given_all_shot_is_gutter_balls_then_score_should_be_0() {

        for (int i = 0; i < 10 ; i++) {
            frames.add(new Frame(0, 0));
        }

        Assert.assertEquals(0, bowlingGame.getScore());
    }

    @Test
    public void given_all_shot_is_3_then_score_should_be_60() {
        for (int i = 0; i < 10 ; i++) {
            frames.add(new Frame(3, 3));
        }

        Assert.assertEquals(60, bowlingGame.getScore());
    }

    @Test
    public void given_10_pairs_of_5_and_spare_and_the_last_is_5_then_the_score_is_150() {
        for (int i = 0; i < 10; i++) {
            frames.add(new Frame(5,5));

        }
        frames.add(new Frame(5,0));

        Assert.assertEquals(150, bowlingGame.getScore());


    }
}