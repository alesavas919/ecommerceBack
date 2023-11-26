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
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "complaints")

public class Complaints {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "complaints_seq")
	private Long id;

	private String message;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Users customer;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Users seller;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Users getCustomer() {
		return customer;
	}

	public void setCustomer(Users customer) {
		this.customer = customer;
	}

	public Users getSeller() {
		return seller;
	}

	public void setSeller(Users seller) {
		this.seller = seller;
	}

	public Complaints(Long id, String message, Users customer, Users seller) {
		super();
		this.id = id;
		this.message = message;
		this.customer = customer;
		this.seller = seller;
	}
          public Complaints() {
        	  
          }
}
