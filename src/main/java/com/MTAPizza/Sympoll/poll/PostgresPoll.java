package com.MTAPizza.Sympoll.poll;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "polls")
public class PostgresPoll {
    @Id
    @Column(name = "poll_id", nullable = false)
    private int pollID;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "creator", nullable = false)
    private String creator;
    @Column(name = "group_id", nullable = false)
    private int groupID;
//    @Column(name = "title", nullable = false)
//    private int votingID;
    @Column(name = "num_answers_allowed", nullable = false)
    private int numAnswersAllowed;
    @Column(name = "time_created")
    private long timeCreated;
    @Column(name = "time_updated")
    private long timeUpdated;
    @Column(name = "time_ends")
    private long timeEnds;

    public PostgresPoll() {
    }

    public PostgresPoll(int pollID, String title, String description, String creator, int groupID, int numAnswersAllowed, long timeCreated, long timeUpdated, long timeEnds) {
        this.pollID = pollID;
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.groupID = groupID;
        this.numAnswersAllowed = numAnswersAllowed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEnds = timeEnds;
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
}
