package com.stackroute.service;

import com.stackroute.domain.Music;
import com.stackroute.exception.MusicAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import com.stackroute.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("potato")
//@Profile({"one","two"})
public class MusicServiceImp implements MusicService {

    MusicRepository musicRepository;

    @Autowired
    public MusicServiceImp(MusicRepository musicRepository){
        this.musicRepository = musicRepository;               // at runtime spring will provide this service a userRepository object via constructor dependency injection
    }

    @Override
    public Music saveMusic(Music music) throws MusicAlreadyExistsException {
        if(musicRepository.existsById(music.getTrackId()))
        {
            throw new MusicAlreadyExistsException("Music Already Exists");
        }
        Music saveMusic = musicRepository.save(music);      // this save method comes from the jpa repository interface that our user repository interface extends
        if(saveMusic==null)
            throw new MusicAlreadyExistsException("Music Already Exists");
        return saveMusic;
    }

    @Override
    public List<Music> getAllMusics() {
        return musicRepository.findAll();
    }

    @Override
    public Music updateMusic(Music music) {
        //music.setComment("Hello");
        Music m=musicRepository.save(music);
        return m;
    }

    @Override
    public void deleteMusic(Music music) {
        musicRepository.delete(music);
    }

    @Override
    public List<String> findById(int x) throws TrackNotFoundException {
        System.out.println("------ Service new 200");
        if(!musicRepository.existsById(x))
        {
            throw new TrackNotFoundException("Music doesnot exist");
        }
        var trackName = (List<String>) musicRepository.findByMyTrackId(x);
        return trackName;
    }
}
