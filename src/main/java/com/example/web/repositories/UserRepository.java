package com.example.web.repositories;

import org.springframework.stereotype.Repository;

import com.example.web.models.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    
    
}
