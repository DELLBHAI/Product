package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer bookId;
	private String bookName;
	private String bookPrice;
	
}
