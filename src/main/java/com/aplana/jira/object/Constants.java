package com.aplana.jira.object;

public class Constants {

    public static String REGEX_RELATED = "&lt;div class=\"linked-jira-issue-key\">.*\\d\">(.*)&lt;\\/a>.*&lt;\\/div>";  //GROUP 1
    public static String REGEX_LOG = "'(\\d.*)'.*&lt;a href=\"https:\\/\\/.*\\/browse";  //GROUP 1
    public static String ACTIVITY_JIRA = "com.atlassian.jira";
}
