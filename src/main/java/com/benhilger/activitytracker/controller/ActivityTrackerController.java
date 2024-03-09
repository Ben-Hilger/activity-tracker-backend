package com.benhilger.activitytracker.controller;

import com.benhilger.activitytracker.model.Activity;
import com.benhilger.activitytracker.repository.ActivityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActivityTrackerController {

    private final ActivityRepository activityRepository = new ActivityRepository();

    @GetMapping("api/v1/activity/{userId}")
    public List<Activity> getAll(@PathVariable Integer userId) {
        return activityRepository.getAllActivities(userId);
    }

    @GetMapping("api/v1/activity/{userId}/{id}")
    public Activity getActivity(@PathVariable String id, @PathVariable String userId) {
        return null;
    }

    @PostMapping("/api/v1/activity/{userId}")
    public Activity addActivity(@PathVariable Integer userId, @RequestParam String name) {
        return activityRepository.createActivity(userId, name);
    }

}
