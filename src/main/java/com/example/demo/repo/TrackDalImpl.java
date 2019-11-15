package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.example.demo.model.Artist;
import com.example.demo.model.Tracks;

public class TrackDalImpl implements TrackRepo{
	@Autowired
	private MongoTemplate db;
	@Override
	public List<Tracks> findAll() {
		// TODO Auto-generated method stub
		return db.findAll(Tracks.class);
	}

	@Override
	public Tracks create(Tracks c) {
		// TODO Auto-generated method stub
		return db.save(c);
	}

	@Override
	public Tracks findByreleasedate(String releasedate) {
		// TODO Auto-generated method stub
		Query q=new Query();
		q.addCriteria(Criteria.where("releasedate").is(releasedate));
		return db.findOne(q, Tracks.class);
	}

	@Override
	public Boolean delete(Tracks a) {
		// TODO Auto-generated method stub
		return db.remove(a).wasAcknowledged();
	}
	

	

}
