package org.example;

public class Ball {
    private String ballField;
    private int numberOfRuns;
    private boolean isOut;

    Ball() {
        this.ballField = "Dot Ball";
        this.numberOfRuns = 0;
        this.isOut = false;
    }

    Ball(String ballField, int numberOfRuns, boolean isOut) {
        this.ballField = ballField;
        this.numberOfRuns = numberOfRuns;
        this.isOut = isOut;
    }

    public void ballNotHitOrNotRun() {
        this.ballField = "Dot Ball";
        this.numberOfRuns = 0;
        this.isOut = false;
    }

    public void ballBowledBatterOut() {
        this.ballField = "Wicket";
        this.numberOfRuns = 0;
        this.isOut = true;
    }

    public void ballHitForRuns(int numberOfRuns) {
        this.ballField = numberOfRuns + " Run(s)";
        this.numberOfRuns = numberOfRuns;
        this.isOut = false;
    }

    public int getNumberOfRuns() {
        return this.numberOfRuns;
    }

    public boolean getIsOut() {
        return this.isOut;
    }

    public String getBallField() {
        return this.ballField;
    }
}
