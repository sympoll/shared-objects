package com.MTAPizza.Sympoll.poll;

import com.MTAPizza.Sympoll.answer.Answer;

import java.util.List;

public class Poll {
    private PostgresPoll postgresPoll;
    private List<Answer> answersList;

    public Poll(PostgresPoll postgresPoll, List<Answer> answersList) {
        this.postgresPoll = postgresPoll;
        this.answersList = answersList;
    }

    public int getPollID() {
        return postgresPoll.getPollID();
    }

    public void setPollID(int pollID) {
        this.postgresPoll.setPollID(pollID);
    }

    public String getTitle() {
        return postgresPoll.getTitle();
    }

    public void setTitle(String title) {
        this.postgresPoll.setTitle(title);
    }

    public String getDescription() {
        return postgresPoll.getDescription();
    }

    public void setDescription(String description) {
        this.postgresPoll.setDescription(description);
    }

    public String getCreator() {
        return postgresPoll.getCreator();
    }

    public void setCreator(String creator) {
        this.postgresPoll.setCreator(creator);
    }

    public int getGroupID() {
        return postgresPoll.getGroupID();
    }

    public void setGroupID(int groupID) {
        this.postgresPoll.setGroupID(groupID);
    }

    public int getNumAnswersAllowed() {
        return postgresPoll.getNumAnswersAllowed();
    }

    public void setNumAnswersAllowed(int numAnswersAllowed) {
        this.postgresPoll.setNumAnswersAllowed(numAnswersAllowed);
    }

    public long getTimeCreated() {
        return postgresPoll.getTimeCreated();
    }

    public void setTimeCreated(long timeCreated) {
        this.postgresPoll.setTimeCreated(timeCreated);
    }

    public long getTimeUpdated() {
        return postgresPoll.getTimeUpdated();
    }

    public void setTimeUpdated(long timeUpdated) {
        this.postgresPoll.setTimeUpdated(timeUpdated);
    }

    public long getTimeEnds() {
        return postgresPoll.getTimeEnds();
    }

    public void setTimeEnds(long timeEnds) {
        this.postgresPoll.setTimeEnds(timeEnds);
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }
}
