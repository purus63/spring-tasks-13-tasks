package com.stackroute.repository;

import com.stackroute.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlDAO  extends JpaRepository<Music,Integer> {
    // you can use JpaRepository methods out of the box or write custom ones
}