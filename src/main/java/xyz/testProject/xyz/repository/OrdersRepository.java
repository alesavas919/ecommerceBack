package xyz.testProject.xyz.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import xyz.testProject.xyz.model.Orders;


public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
