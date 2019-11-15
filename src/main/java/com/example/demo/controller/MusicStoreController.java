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

import com.example.demo.model.Artist;

import com.example.demo.repo.ArtistRepository;


@RestController
public class MusicStoreController {
@Autowired
private ArtistRepository dal;

@PostMapping("/artists")
private Artist create(@RequestBody Artist c)
{
	return dal.create(c);
}

@GetMapping("/artists")
private List<Artist> findAll(){
	return dal.findAll();
}

@GetMapping("/artists/{artisttype}")
private Artist findByArtisttype(@PathVariable String artisttype) {
	return dal.findByArtisttype(artisttype);
}

@DeleteMapping("/artists/{id}")
public Artist delete(@PathVariable String artisttype ){
	Artist deletedart = dal.findByArtisttype(artisttype);
	if(dal.delete(deletedart))
		return deletedart;
	else
		return null;
	
}
@PutMapping("/artists/{id}")
public Artist update(@PathVariable String id, @RequestBody Artist artist){
	return dal.update(id, artist);
}

}
