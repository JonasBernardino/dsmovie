package com.devsuperior.dsmovei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovei.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
