package com.devsuperior.dsmovei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovei.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
