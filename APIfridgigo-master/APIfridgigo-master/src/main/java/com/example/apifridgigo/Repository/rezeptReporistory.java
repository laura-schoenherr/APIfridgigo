package com.example.apifridgigo.rezeptRepository;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezeptRepository extends JpaRepository<rezeptid, Integer>{
}