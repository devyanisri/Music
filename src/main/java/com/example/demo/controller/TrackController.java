package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tracks;
import com.example.demo.repo.TrackRepo;

@RestController
public class TrackController {
	@Autowired
	private TrackRepo dal;

	@PostMapping("/tracks")
	private Tracks create(@RequestBody  Tracks c)
	{
		return dal.create(c);
	}

	@GetMapping("/tracks")
	private List<Tracks> findAll(){
		return dal.findAll();
	}

	@GetMapping("/tracks/{releasedate}")
	private Tracks findByArtisttype(@PathVariable String releasedate) {
		return dal.findByreleasedate(releasedate);
	}

	@DeleteMapping("/tracks/{id}")
	public Tracks delete(@PathVariable String releasedate ){
		Tracks deletedart = dal.findByreleasedate(releasedate);
		if(dal.delete(deletedart))
			return deletedart;
		else
			return null;
		
	}
	
}
