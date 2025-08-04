package com.Stock_Overflow.Sneaky_Business.repository;

import com.Stock_Overflow.Sneaky_Business.model.Business;
import com.Stock_Overflow.Sneaky_Business.model.Investment;
import com.Stock_Overflow.Sneaky_Business.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
    List<Investment> findByInvestor(User investor);
    List<Investment> findByBusiness(Business business);
}
