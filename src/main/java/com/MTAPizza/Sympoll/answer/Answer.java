package com.MTAPizza.Sympoll.answer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_options")
public class Answer {
    @Id
    @Column(name = "answer_id", nullable = false)
    private int answerID;
    @Column(name = "poll_id", nullable = false)
    private int pollID;
    @Column(name = "ordinal", nullable = false)
    private int ordinal;
    @Column(name = "answer_text")
    private String answerText;
    @Column(name = "num_of_votes")
    private long numOfVotes;

    public Answer() {
    }

    public Answer(int answerID, int pollID, int ordinal, String answerText, long numberOfVotes) {
        this.answerID = answerID;
        this.pollID = pollID;
        this.ordinal = ordinal;
        this.answerText = answerText;
        this.numOfVotes = numberOfVotes;
    }

    public int getAnswerID() {
        return answerID;
    }

    public int getPollID() {
        return pollID;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getAnswerText() {
        return answerText;
    }

    public long getNumOfVotes() {
        return numOfVotes;
    }
}
