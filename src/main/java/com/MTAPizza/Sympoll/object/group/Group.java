package com.MTAPizza.Sympoll.object.group;

import com.MTAPizza.Sympoll.object.poll.Poll;
import com.MTAPizza.Sympoll.object.user.User;

import java.util.List;

public class Group {
    private int groupID;

    private String groupName;

    private List<User> groupMembers;

    private List<Poll> polls;

    public Group(int groupID, String groupName, List<User> groupMembers, List<Poll> polls) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.groupMembers = groupMembers;
        this.polls = polls;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }
}
