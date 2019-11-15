package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;
import com.example.demo.model.Tracks;

public interface TrackRepo {
public List<Tracks> findAll();
	
	public Tracks create(Tracks c);
	public Tracks findByreleasedate(String releasedate);
	Boolean delete(Tracks a);
}
