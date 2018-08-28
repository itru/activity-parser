package com.aplana.jira.xml.unmarshal;


import com.aplana.jira.model.Category;
import com.aplana.jira.model.Entry;
import com.aplana.jira.model.Feed;
import com.aplana.jira.object.Activity;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.aplana.jira.object.Constants.ACTIVITY_JIRA;
import static java.util.stream.Collectors.groupingBy;

public class XmlToProductTest {
    private Feed feed;

    @Test
    public void testXmlToObject() throws JAXBException, FileNotFoundException {
        File file = new File("feed.xml");
        assert file.exists();
        JAXBContext jaxbContext = JAXBContext.newInstance(Feed.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        feed = (Feed) unmarshaller.unmarshal(file);

        List<Activity> activities = new ArrayList<>();
        for (Entry entry : feed.getEntry()) {
            System.out.println(entry);
            Activity activity = new Activity();
            activity.setAuthor(entry.getAuthor().getName());

            LocalDateTime localDateTime = LocalDateTime.parse(entry.getPublished(), DateTimeFormatter.ISO_DATE_TIME);
            LocalDateTime newLocalDateTime = localDateTime.atZone(ZoneOffset.UTC)
                    .withZoneSameInstant(ZoneOffset.of(entry.getTimezoneOffset())).toLocalDateTime();

            Date date = Date.from(newLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());
            activity.setDateTime(date);
            String issueId = "";
            String issueName = "";
            if (ACTIVITY_JIRA.equals(entry.getApplication())) {
                Category category = entry.getCategory();

                if (entry.getTarget() != null) {
                    issueId = entry.getTarget().getTitle().getContent();
                    issueName = entry.getTarget().getSummary().getContent();
                } else {
                    issueId = entry.getObject().getTitle().getContent();
                    issueName = entry.getObject().getSummary().getContent();
                }
                activity.setIssueId(issueId);
                activity.setIssueName(issueName);


                if (category == null) {

                    activity.setType(Activity.ActivityType.UPDATE);
                } else if (category.getTerm().equals("comment")) {
                    activity.setType(Activity.ActivityType.COMMENT);
                } else if (category.getTerm().equals("created")) {
                    activity.setType(Activity.ActivityType.CREATE);
                } else if ((entry.getVerb().size() >= 2 && new String(entry.getVerb().get(1).getBytes()).contains("transition"))) {
                    activity.setType(Activity.ActivityType.TRANSITION);
                }
                activities.add(activity);
            }
        }
        System.out.println(activities);

        Map<Date, Map<String, List<Activity>>> collect = activities.stream()
                .collect(groupingBy(Activity::getDate, groupingBy(Activity::getIssueFullName)));
        for (Map.Entry<Date, Map<String, List<Activity>>> dateMapEntry : collect.entrySet()) {
            System.out.println(dateMapEntry.getKey());
            for (Map.Entry<String, List<Activity>> stringListEntry : dateMapEntry.getValue().entrySet()) {
                // System.out.println("\t("+ stringListEntry.getValue().size()+ ") " + stringListEntry.getKey());
                System.out.println("\t(" + stringListEntry.getValue().size() + ") " + stringListEntry.getKey());
                for (Activity activity : stringListEntry.getValue()) {
                    System.out.println("\t\t" + activity);
                }

            }

        }


        //System.out.println(feed);
    }
}
