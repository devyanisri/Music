package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;

public interface AlbumRepo {
public List<Album> findAll();
	
	public Album create(Album c);
	public Album findBySongno(String songno);
	Boolean delete(Album a);
}
