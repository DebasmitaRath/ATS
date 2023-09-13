package com.boot.aatral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.aatral.entity.BuManager;


@Repository
public interface BuManagerRepository extends JpaRepository<BuManager, Integer> {
     
}
