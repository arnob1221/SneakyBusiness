package com.Stock_Overflow.Sneaky_Business.repository;

import com.Stock_Overflow.Sneaky_Business.model.Business;
import com.Stock_Overflow.Sneaky_Business.model.DocumentUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentUploadRepository extends JpaRepository<DocumentUpload, Long> {
    List<DocumentUpload> findByBusiness(Business business);
}
