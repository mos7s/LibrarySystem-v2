package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.entity.Category;
@Repository
public interface CatgRepo extends JpaRepository<Category, Integer>{

}
