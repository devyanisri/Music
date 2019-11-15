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

import com.example.demo.model.Album;
import com.example.demo.repo.AlbumRepo;


@RestController
public class AlbumController {
	@Autowired
	private AlbumRepo dal;

	@PostMapping("/albums")
	private Album create(@RequestBody Album c)
	{
		return dal.create(c);
	}

	@GetMapping("/albums")
	private List<Album> findAll(){
		return dal.findAll();
	}

	@GetMapping("/albums/{songno}")
	private Album findByArtisttype(@PathVariable String songno) {
		return dal.findBySongno(songno);
	}

	@DeleteMapping("/albums/{id}")
	public Album delete(@PathVariable String songno ){
		Album deletedart = dal.findBySongno(songno);
		if(dal.delete(deletedart))
			return deletedart;
		else
			return null;
		
}}
