package com.ektha.springbootstarter.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ektha.springbootstarter.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
