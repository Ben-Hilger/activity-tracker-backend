package com.benhilger.activitytracker.repository;

import com.benhilger.activitytracker.model.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityRepository {

    private final Map<Integer, List<Activity>> tempMap = new HashMap<>();


    public ActivityRepository() {
        List<Activity> tempList = new ArrayList<>();
        tempList.add(new Activity(1, "Leetcode"));
        tempList.add(new Activity(2, "Work"));

        tempMap.put(1, tempList);
    }

    public List<Activity> getAllActivities(int userId) {
        return tempMap.get(userId);
    }

    public Activity createActivity(int userId, String name) {
        final Activity newActivity = new Activity(3, name);

        final List<Activity> userMap = tempMap.getOrDefault(userId, new ArrayList<>());

        userMap.add(newActivity);

        tempMap.put(userId, userMap);

        return newActivity;
    }
}
