package com.kata.pvbarredo;

public class Frame {
    private final int firstRoll;
    private final int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }
}
