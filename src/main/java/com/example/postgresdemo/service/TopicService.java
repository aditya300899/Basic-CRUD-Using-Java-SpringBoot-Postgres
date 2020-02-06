package com.example.postgresdemo.service;

import com.example.postgresdemo.Topic;
import com.example.postgresdemo.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("1", "Spring framework", "Spring description"),
//            new Topic("2", "GIT", "GIT description"),
//            new Topic("3", "Python", "Python description")
//    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        //throw new NullPointerException();
        topicRepository.findAll().forEach(topics::add);
        return topics;
        //return null;
    }

    public Topic getTopic(String id) {
    //    return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
//        for (int i = 0; i < topics.size(); i++)
//        {
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(topicRepository.findById(id).orElse(null));
    }
}
