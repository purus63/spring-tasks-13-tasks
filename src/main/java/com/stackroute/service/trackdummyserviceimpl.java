package com.stackroute.service;

import com.stackroute.domain.Music;
import com.stackroute.exception.MusicAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("three")
public class trackdummyserviceimpl implements MusicService{

    @Override
    public Music saveMusic(Music music) throws MusicAlreadyExistsException{
        return null;
    }

    @Override
    public List<Music> getAllMusics() {
        return null;
    }

    @Override
    public Music updateMusic(Music music) {
        return null;
    }

    @Override
    public void deleteMusic(Music music) {

    }

    @Override
    public List<String> findById(int id) throws TrackNotFoundException {
        return null;
    }
}