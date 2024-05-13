package com.MTAPizza.Sympoll.object.poll.answer;

public class Answer {

    private int answerID;
    private int pollID;
    private int ordinal;
    private String answerText;
    private int numOfVotes;

    public Answer(int answerID, int pollID, int ordinal, String answerText, int numOfVotes) {
        this.answerID = answerID;
        this.pollID = pollID;
        this.ordinal = ordinal;
        this.answerText = answerText;
        this.numOfVotes = numOfVotes;
    }
}
