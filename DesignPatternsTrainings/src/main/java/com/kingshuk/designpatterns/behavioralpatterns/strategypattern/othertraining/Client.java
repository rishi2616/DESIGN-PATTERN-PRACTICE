package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.othertraining;


public class Client {

    public static void main(String[] args) {

        Chess chess = new Chess();

        System.out.println("Chess next step " + chess.calculateNextStep());

        chess.setDifficulty(Difficulty.HARD);

        System.out.println("Chess next step " + chess.calculateNextStep());

    }

}
