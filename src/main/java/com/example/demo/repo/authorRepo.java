package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Author;
@Repository
public interface authorRepo extends JpaRepository<Author, Integer> {

}
