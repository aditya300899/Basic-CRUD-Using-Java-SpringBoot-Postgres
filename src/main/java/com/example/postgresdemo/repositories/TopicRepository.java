package com.example.postgresdemo.repositories;

import com.example.postgresdemo.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
