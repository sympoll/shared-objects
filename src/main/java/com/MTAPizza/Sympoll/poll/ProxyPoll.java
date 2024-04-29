package com.MTAPizza.Sympoll.poll;

import com.MTAPizza.Sympoll.answer.Answer;

import java.util.List;

public class ProxyPoll {
    private final int pollID;
    private String title;
    private String description;
    private final String creator;
    private final int groupID;
    private final int votingID;
    private final int numAnswersAllowed;
    private final long timeCreated;
    private long timeUpdated;
    private long timeEnds;
    private List<Answer> answersList;

    public ProxyPoll(int pollID, String title, String description, String creator, int groupID, int votingID, int numAnswersAllowed, long timeCreated, long timeEnds, List<Answer> answersList) {
        this.pollID = pollID;
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.groupID = groupID;
        this.votingID = votingID;
        this.numAnswersAllowed = numAnswersAllowed;
        this.timeCreated = timeCreated;
        this.timeEnds = timeEnds;
        this.answersList = answersList;
        this.timeUpdated = 0;
    }

    public int getPollID() {
        return pollID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCreator() {
        return creator;
    }

    public int getGroupID() {
        return groupID;
    }

    public int getVotingID() {
        return votingID;
    }

    public int getNumAnswersAllowed() {
        return numAnswersAllowed;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public long getTimeUpdated() {
        return timeUpdated;
    }

    public long getTimeEnds() {
        return timeEnds;
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }
}
