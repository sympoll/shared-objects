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

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
    }
}
