package com.online_store2.online_store2.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   //for creating table
@Table(name="Product")   //specify the name of table in database
public class Product {
		 
	@Id //primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY)  //for auto incrementing   
	    private Long Id;

	   private String name;
	  private Long stk;
	   private Long price;
	   
	   
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@JsonBackReference
//	private Store store;
	   

}
