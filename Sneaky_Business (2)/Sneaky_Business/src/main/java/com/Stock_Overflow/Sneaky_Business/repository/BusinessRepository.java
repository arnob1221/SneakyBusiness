package com.Stock_Overflow.Sneaky_Business.repository;

import com.Stock_Overflow.Sneaky_Business.model.Business;
import com.Stock_Overflow.Sneaky_Business.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {
    List<Business> findByApprovedTrue();
    List<Business> findByApprovedFalse();
    //Optional<Business> findByBusinessOwner(User owner);
}
