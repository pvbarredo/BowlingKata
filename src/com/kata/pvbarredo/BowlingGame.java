package com.kata.pvbarredo;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private List<Frame> frames = new ArrayList<>();

    public List<Frame> getFrames() {
        return frames;
    }


    public int getScore() {
        int score = 0;
        for (Frame frame : frames) {
            score += frame.getFirstRoll() + frame.getSecondRoll();
            if(frame.getFirstRoll() + frame.getSecondRoll() == 10){

            }
        }


        return score;
    }


}
