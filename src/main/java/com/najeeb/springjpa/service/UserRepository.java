package com.najeeb.springjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.najeeb.springjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
