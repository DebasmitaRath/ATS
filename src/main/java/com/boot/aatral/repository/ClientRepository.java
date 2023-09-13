package com.boot.aatral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.aatral.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String> {

}
