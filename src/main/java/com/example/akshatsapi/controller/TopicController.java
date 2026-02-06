package com.example.akshatsapi.controller;
import com.example.akshatsapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    // localhost:8080/
    @RequestMapping(value = "/")
    public String home() {
        return "Welcome to Course-API!";
    }

    // localhost:8080/topics
    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void save(@RequestBody Topic topic) {
        topicService.save(topic);
    }

}