package com.MTAPizza.Sympoll.poll;

import com.MTAPizza.Sympoll.answer.Answer;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.List;

public class Poll {
    private int pollID;
    private String title;
    private String description;
    private int creatorID;
    private int groupID;
    private int votingID;
    private int numAnswersAllowed;
    private long timeCreated;
    private long timeUpdated;
    private long timeEnds;
    private List<Answer> answersList;

    public Poll(List<Answer> answersList) {
        this.answersList = answersList;
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getVotingID() {
        return votingID;
    }

    public void setVotingID(int votingID) {
        this.votingID = votingID;
    }

    public int getNumAnswersAllowed() {
        return numAnswersAllowed;
    }

    public void setNumAnswersAllowed(int numAnswersAllowed) {
        this.numAnswersAllowed = numAnswersAllowed;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public long getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(long timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public long getTimeEnds() {
        return timeEnds;
    }

    public void setTimeEnds(long timeEnds) {
        this.timeEnds = timeEnds;
    }
}
