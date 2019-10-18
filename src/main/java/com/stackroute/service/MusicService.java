package com.stackroute.service;

import com.stackroute.domain.Music;
import com.stackroute.exception.MusicAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;

import java.util.List;

public interface MusicService {

    public Music saveMusic(Music music) throws MusicAlreadyExistsException;  // method to accept a user object to save and return the saved user object

    public List<Music> getAllMusics();  // returns all user objects stored in the database as a list of user objects

    public  Music updateMusic(Music music);

    public void deleteMusic(Music music);

    public List<String> findById(int id) throws TrackNotFoundException;
}
