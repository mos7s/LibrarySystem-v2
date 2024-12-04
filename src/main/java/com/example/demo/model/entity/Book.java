package com.example.demo.model.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "Books")
@Entity
@Data
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "books_authors",
	joinColumns = {@JoinColumn(name = "books_id")},
	inverseJoinColumns = {@JoinColumn(name = "author_id")})
	private List <Author> authors = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "books_categories",
	joinColumns = {@JoinColumn(name = "books_id")},
	inverseJoinColumns = {@JoinColumn(name = "category_id")})
	
	private List <Category> categories = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "books_publisher",
	joinColumns = {@JoinColumn(name = "books_id")},
	inverseJoinColumns = {@JoinColumn(name = "publisher_id")})
	
	private List <Publisher> publishers = new ArrayList<>();

	
	
	

}
