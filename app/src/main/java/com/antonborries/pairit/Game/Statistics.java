package com.antonborries.pairit.Game;

/**
 * Created by antonborries on 31.08.15.
 */
public class Statistics {
    private long time = 1; //in Milliseconds
    private int deletedPairs;
    private final int numbers;
    private final int colors;
    private int undos;
    private int adds;

    public Statistics(int numbers, int colors) {
        this.numbers = numbers;
        this.colors = colors;
    }

    public double getScore() {
        //TODO: CALCULATE SCORE
        if (time  + undos + adds != 0) {
            double score = ((double) (numbers * colors+deletedPairs) / ((double) ((time) / 10000)  + undos + adds)) * 1000;
            return score;
        } else return 0;
    }


    public long getTime() {
        return time;
    }

    public void addTime(long time) {
        this.time += time;
    }

    public int getDeletedPairs() {
        return deletedPairs;
    }

    public void addDeletedPairs() {
        this.deletedPairs++;
    }

    public int getNumbers() {
        return numbers;
    }

    public int getColors() {
        return colors;
    }

    public int getUndos() {
        return undos;
    }

    public void addUndos() {
        this.undos++;
    }

    public int getAdds() {
        return adds;
    }

    public void addAdds() {
        this.adds++;
    }
}
