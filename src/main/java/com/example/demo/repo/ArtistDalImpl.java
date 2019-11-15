package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Artist;
@Repository

public class ArtistDalImpl implements ArtistRepository {

	@Autowired
	private MongoTemplate db;
	@Override
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return db.findAll(Artist.class);
	}
	@Override
	public Artist create(Artist a) {
		// TODO Auto-generated method stub
		return db.save(a);
	}
	@Override
	public Artist findByArtisttype(String artisttype) {
		// TODO Auto-generated method stub
		Query q=new Query();
		q.addCriteria(Criteria.where("artisttype").is(artisttype));
		return db.findOne(q, Artist.class);
	}
	@Override
	public Boolean delete(Artist a) {
		// TODO Auto-generated method stub
		return db.remove(a).wasAcknowledged();
	}
	@Override
	public Artist update(String id, Artist artist) {
			// TODO Auto-generated method stub
			Query query= new Query();
			query.addCriteria(Criteria.where("id").is(id));
			return db.save(artist);

	


}}
