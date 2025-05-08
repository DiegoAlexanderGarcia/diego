package com.taller.diego.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller.diego.entity.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
