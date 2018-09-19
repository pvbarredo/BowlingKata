package com.kata.pvbarredo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BowlingTest {

    BowlingGame bowlingGame;
    List<Frame> frames;

    @Before
    public void setup(){
        bowlingGame = new BowlingGame();
        frames = bowlingGame.getFrames();
    }

    @Test
    public void given_a_bowling_game_it_should_score() {

        Assert.assertNotNull(bowlingGame.getScore());

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
    public void given_all_shot_is_spare_and_the_first_ball_is_4_then_score_should_be_140() {
        for (int i = 0; i < 11; i++) {
            frames.add(new Frame(4,6));
            
        }
        frames.add(new Frame(4,0));

        Assert.assertEquals(140, bowlingGame.getScore());
    }
}
