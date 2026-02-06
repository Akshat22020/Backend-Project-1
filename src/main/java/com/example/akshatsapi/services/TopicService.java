package com.example.akshatsapi.services;

import com.example.akshatsapi.controller.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("101", "Spring Boot", "Spring Boot Description"),
                    new Topic("102", "Data Structures", "Data Structures Description"),
                    new Topic("103", "Competitive-Coding", "Competitive-Coding Description"),
                    new Topic("104", "Microservices", "Microservices Description")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void saveTopic(Topic topic) {
        topics.add(topic);
    }



}