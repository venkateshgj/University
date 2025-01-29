package com.venkatesh.university.repository;

import com.venkatesh.university.model.Enrolement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolementRepository extends JpaRepository<Enrolement,Integer> {
}
