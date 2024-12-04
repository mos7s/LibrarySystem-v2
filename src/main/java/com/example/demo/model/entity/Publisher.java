package com.example.demo.model.entity;

import java.util.List;
import java.util.Set;

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
@Table(name = "publishers")
@Entity
@Data
@NoArgsConstructor
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "publisher_name")
	private String name;
	@ManyToMany(mappedBy = "publishers",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set <Book> books ;

}
