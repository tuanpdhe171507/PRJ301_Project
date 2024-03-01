/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author G5 5590
 */
public class Group {
    private int groupID;
    private String groupName;
    private Subject subject;
    private Teacher teacher;

    public Group() {
    }

    public Group(int groupID, String groupName, Subject subject, Teacher teacher) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.subject = subject;
        this.teacher = teacher;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Group{" + "groupID=" + groupID + ", groupName=" + groupName + ", subject=" + subject + ", teacher=" + teacher + '}';
    }

   
    
}
