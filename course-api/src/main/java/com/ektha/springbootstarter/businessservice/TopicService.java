package com.ektha.springbootstarter.businessservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ektha.springbootstarter.topic.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring Framework Description", "Spring Framework "),
			new Topic(2, "Spring Description", "Spring "),
			new Topic(3, "Core Java Description", "Core Java ")));

	public List<Topic> getAllTopics() {

		return topics;
	}

	public Topic getTopic(int id) {

		return topics.stream().filter(t -> t.getId() == id).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {

	for(int i =0; i<topics.size(); i++) {
		Topic t = topics.get(i);
		if(t.getId()==id) {
			topics.set(i, topic);
			return;
		}
	}
	}

	public void deleteTopic(int id) {

		topics.removeIf(t -> t.getId()==id);
	}
}
