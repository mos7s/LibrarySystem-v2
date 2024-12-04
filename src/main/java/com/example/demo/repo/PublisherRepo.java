package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Publisher;
@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Integer>{

}
