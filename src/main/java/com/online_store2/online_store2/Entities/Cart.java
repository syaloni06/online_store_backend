package com.online_store2.online_store2.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="Cart")   //specify the name of table in database

public class Cart {
	@Id //primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY)  //for auto incrementing 
private Long id;
	
	private Long prodid;
	private Long qty;
	private Long total;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//@JsonIgnorePrope    rties
	@JsonBackReference
	private Customer orderno;
	
}
