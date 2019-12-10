package com.techelevator.finalcapstonespringboot.repository;

import com.techelevator.finalcapstonespringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
