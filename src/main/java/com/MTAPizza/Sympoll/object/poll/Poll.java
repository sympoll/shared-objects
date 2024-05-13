package com.MTAPizza.Sympoll.object.poll;

import com.MTAPizza.Sympoll.object.group.Group;
import com.MTAPizza.Sympoll.object.poll.answer.Answer;
import com.MTAPizza.Sympoll.object.user.User;

import java.util.List;

public class Poll {
    private int pollID;
    private String title;
    private String description;
    private User creator;
    private Group group;
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

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
