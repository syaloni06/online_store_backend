package com.online_store2.online_store2.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   //for creating table
@Table(name="Customer")   //specify the name of table in database

public class Customer {
	@Id //primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY)  //for auto incrementing   
	private Long orderno;
	private String name;
	private Long phone;
	Double totalPrice;
	
	@OneToMany(mappedBy="orderno",cascade=CascadeType.PERSIST)
	@JsonManagedReference
	private List<Cart> cart;
	
}
