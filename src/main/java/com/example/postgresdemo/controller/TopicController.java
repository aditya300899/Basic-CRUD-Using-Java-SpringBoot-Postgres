package com.example.postgresdemo.controller;

import com.example.postgresdemo.Topic;
import com.example.postgresdemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        System.out.println("aaa");
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic, id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {   
        topicService.deleteTopic(id);

    }


}
