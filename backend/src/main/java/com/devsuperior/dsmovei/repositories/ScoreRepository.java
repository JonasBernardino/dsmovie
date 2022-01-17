package com.devsuperior.dsmovei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovei.entities.Score;
import com.devsuperior.dsmovei.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
