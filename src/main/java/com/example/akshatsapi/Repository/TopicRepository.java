package com.example.akshatsapi.Repository;
import com.example.akshatsapi.controller.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends MongoRepository<Topic, String> {

} //repository ek interface ko inherit kar rahi hai