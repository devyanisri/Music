package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Tracks {
@Id

private String id;
private String trackname;
private String genre;
private String releasedate;

public Tracks() {
	
}



public Tracks(String id, String trackname, String genre, String releasedate) {
	this.id = id;
	this.trackname = trackname;
	this.genre = genre;
	this.releasedate = releasedate;
}



public String getReleasedate() {
	return releasedate;
}



public void setReleasedate(String releasedate) {
	this.releasedate = releasedate;
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getTrackname() {
	return trackname;
}

public void setTrackname(String trackname) {
	this.trackname = trackname;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}


}

