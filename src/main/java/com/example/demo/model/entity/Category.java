package com.example.demo.model.entity;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "categories")
@Entity
@Data
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column(name = "catg_name")
	private String name;
	@ManyToAny
	@ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Book> books ;

}
