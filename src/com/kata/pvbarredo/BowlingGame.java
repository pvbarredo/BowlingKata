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

        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            Frame frame = frames.get(frameIndex);
            if(isStrike(frame)){
                score += getTotalStrikeBonus(frameIndex);

            }else if(isSpare(frame)){

                Frame secondFrame = frames.get(frameIndex + 1);
                score += 10 + secondFrame.getFirstRoll();

            }else{
                score += frame.getFirstRoll()  + frame.getSecondRoll();
            }


        }

        return score;
    }

    private int getTotalStrikeBonus(int currentFrameIndex) {
        int bonusScore = 0;
        Frame secondFrame = frames.get(currentFrameIndex + 1);
        if(isStrike(secondFrame)){
            Frame thirdFrame = frames.get(currentFrameIndex + 2);
            bonusScore += 20 + thirdFrame.getFirstRoll();

        }else{
            bonusScore += 10 + secondFrame.getFirstRoll() + secondFrame.getSecondRoll();
        }
        return bonusScore;
    }

    private boolean isStrike(Frame secondFrame) {
        return secondFrame.getFirstRoll() == 10;
    }

    private boolean isSpare(Frame frame) {
        return frame.getFirstRoll()  + frame.getSecondRoll() == 10;
    }


}
