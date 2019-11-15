package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;

@Repository
public class AlbumDalImpl implements AlbumRepo{

	@Autowired
	private MongoTemplate db;
	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return db.findAll(Album.class);
	}
	@Override
	public Album create(Album c) {
		// TODO Auto-generated method stub
		return db.save(c);
	}
	
	@Override
	public Boolean delete(Album a) {
		// TODO Auto-generated method stub
		return db.remove(a).wasAcknowledged();
	}
	@Override
	public Album findBySongno(String songno) {
		// TODO Auto-generated method stub
		Query q=new Query();
		q.addCriteria(Criteria.where("songno").is(songno));
		return db.findOne(q, Album.class);
	}
	}


