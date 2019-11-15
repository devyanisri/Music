package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {
@Id
private String id;
private String artistname;
private String artisttype;

private List<Album> albums;



public Artist(String id, String artistname, String artisttype, List<Album> albums) {
	super();
	this.id = id;
	this.artistname = artistname;
	this.artisttype = artisttype;
	this.albums = albums;
	
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getArtistname() {
	return artistname;
}



public void setArtistname(String artistname) {
	this.artistname = artistname;
}



public String getArtisttype() {
	return artisttype;
}



public void setArtisttype(String artisttype) {
	this.artisttype = artisttype;
}



public List<Album> getAlbums() {
	return albums;
}



public void setAlbums(List<Album> albums) {
	this.albums = albums;
}


}
