package com.example.postgresdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @Column(name = "topic_id")
    String id;
    @Column(name = "topic_name")
    String name;
    @Column(name = "topic_description")
    String description;


    public Topic(){

    }

    public Topic(String id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId()
    {
        return id;
    }

    public void setId()
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription()
    {
        this.description = description;
    }

}
