package com.example.akshatsapi.services;
import com.example.akshatsapi.controller.Topic;
import com.example.akshatsapi.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;  //interface ka object kaise bana?-->BTS ek class banega aur wahi func call hoga jo runtime pe use ho raha hoga
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(String id) {
        Optional<Topic> foundTopic = topicRepository.findById(id); //db manage repository kar raha hai
        if(foundTopic.isPresent()) return foundTopic.get();
        else return new Topic("N/A", "N/A", "N/A");
    }

    public void save(Topic topic) {
        topicRepository.save(topic);
    }
}