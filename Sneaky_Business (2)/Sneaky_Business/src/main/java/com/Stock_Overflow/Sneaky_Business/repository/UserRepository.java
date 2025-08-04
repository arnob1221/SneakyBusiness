package com.Stock_Overflow.Sneaky_Business.repository;

import com.Stock_Overflow.Sneaky_Business.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Optional<User> findByEmail(String email);
}
