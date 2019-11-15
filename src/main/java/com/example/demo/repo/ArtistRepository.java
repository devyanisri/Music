package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Artist;



public interface ArtistRepository {

	public List<Artist> findAll();
	
	public Artist create(Artist c);
	
	public Artist findByArtisttype(String artisttype);

	Artist update(String id, Artist artist);


	Boolean delete(Artist a);
}
