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
@Table(name = "orders")

public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orders_seq")
    private Long id;
	
	private String orderCode;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Users customer;
	
	/*@ManyToOne
	@JoinColumn(name = "customer_id")
	private Users seller;
	*/
	
	@ManyToOne
	@JoinColumn(name = "product")
	private Product product;
	
	private Double cost;
	
	private Short status;// 0. Completed, 1.in Progress, 2.In Stock

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Users getCustomer() {
		return customer;
	}

	public void setCustomer(Users customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Orders(Long id, String orderCode, Users customer, Product product, Double cost, Short status) {
		super();
		this.id = id;
		this.orderCode = orderCode;
		this.customer = customer;
		this.product = product;
		this.cost = cost;
		this.status = status;
	}

	public Orders() {
		super();
	}
	
}