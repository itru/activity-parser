package com.aplana.jira.object;

import java.util.Date;

public class Activity {


    public enum ActivityType {
        TRANSITION,
        COMMENT,
        CREATE,
        RELATE,
        UPDATE,
        LOG
    }

    private String author;
    private ActivityType type;
    private String issueId;
    private String issueName;
    private Date dateTime;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDate() {
        Date dateWithoutTime =
                new Date(dateTime.getYear(),dateTime.getMonth(),dateTime.getDate());
        return dateWithoutTime;
    }

    public String getIssueFullName() {
        return issueId + " - " + issueName;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "author='" + author + '\'' +
                ", type=" + type +
                ", issueId='" + issueId + '\'' +
                ", issueName='" + issueName + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
