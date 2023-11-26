package xyz.testProject.xyz.model;

import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Data;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "product_seq")
    private Long id;
	
	private String name, description;
	
	private String details;//element with ","
	
	private double cost;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Users users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Product(Long id, String name, String description, String details, double cost, Users users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.details = details;
		this.cost = cost;
		this.users = users;
	}

	public Product() {
		super();
	}
	
}
