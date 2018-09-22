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


        for (int i = 0; i < 10; i++) {
            Frame frame = frames.get(i);
            if(isStrike(frame)){
                Frame secondFrame = frames.get(i + 1);
                if(isStrike(secondFrame)){
                    Frame thirdFrame = frames.get(i + 2);
                    score += 20 + thirdFrame.getFirstRoll();

                }else{
                    score += 10 + secondFrame.getFirstRoll() + secondFrame.getSecondRoll();
                }


            }else if(isSpare(frame)){

                Frame secondFrame = frames.get(i + 1);
                score += 10 + secondFrame.getFirstRoll();

            }else{
                score += frame.getFirstRoll()  + frame.getSecondRoll();
            }


        }

        return score;
    }

    private boolean isStrike(Frame secondFrame) {
        return secondFrame.getFirstRoll() == 10;
    }

    private boolean isSpare(Frame frame) {
        return frame.getFirstRoll()  + frame.getSecondRoll() == 10;
    }


}
