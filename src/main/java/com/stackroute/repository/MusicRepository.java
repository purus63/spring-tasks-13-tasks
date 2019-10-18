package com.stackroute.repository;

import com.stackroute.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // Allows spring-data-jpa repository infrastructure to scan the classpath for this interface and create a springbean for it (it will be created at runtime)
public interface MusicRepository extends JpaRepository<Music,Integer> {
        @Query("SELECT m.trackName FROM Music m where m.trackId = :id")
        public List<String> findByMyTrackId(int id);
}
