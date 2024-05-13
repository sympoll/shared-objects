package com.MTAPizza.Sympoll.object.poll.vote;

import com.MTAPizza.Sympoll.object.user.User;

public class Vote {
    private int voteID;
    private User voter;

    private int pollID;
    private int answerID;
    private long voteDateTime;

    public Vote(int voteID, User voter, int pollID, int answerID, long voteDateTime) {
        this.voteID = voteID;
        this.voter = voter;
        this.pollID = pollID;
        this.answerID = answerID;
        this.voteDateTime = voteDateTime;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }

    public User getVoter() {
        return voter;
    }

    public void setVoter(User voter) {
        this.voter = voter;
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public long getVoteDateTime() {
        return voteDateTime;
    }

    public void setVoteDateTime(long voteDateTime) {
        this.voteDateTime = voteDateTime;
    }
}
