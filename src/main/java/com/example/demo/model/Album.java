package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {
@Id
String id;
String albumname;
String songno;
String alreleasedate;

private List<Tracks> tracks;


public Album() {
	
}

public Album(String id, String albumname, String songno, String alreleasedate) {
	super();
	this.id = id;
	this.albumname = albumname;
	this.songno = songno;
	this.alreleasedate = alreleasedate;
}



public Album(String id, String albumname, String songno, String alreleasedate, List<Tracks> tracks) {
	super();
	this.id = id;
	this.albumname = albumname;
	this.songno = songno;
	this.alreleasedate = alreleasedate;
	this.tracks = tracks;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAlbumname() {
	return albumname;
}

public void setAlbumname(String albumname) {
	this.albumname = albumname;
}

public String getSongno() {
	return songno;
}

public void setSongno(String songno) {
	this.songno = songno;
}

public String getAlreleasedate() {
	return alreleasedate;
}

public void setAlreleasedate(String alreleasedate) {
	this.alreleasedate = alreleasedate;
}

public List<Tracks> getTracks() {
	return tracks;
}

public void setTracks(List<Tracks> tracks) {
	this.tracks = tracks;
}




}
