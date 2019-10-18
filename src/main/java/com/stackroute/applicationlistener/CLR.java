package com.stackroute.applicationlistener;

import com.stackroute.domain.Music;
import com.stackroute.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {

    private MusicRepository musicRepository;
    @Autowired
    public void CLR(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        musicRepository.save(new Music(12, "Sone Lagde", "From Battle Studies"));
    }
}
