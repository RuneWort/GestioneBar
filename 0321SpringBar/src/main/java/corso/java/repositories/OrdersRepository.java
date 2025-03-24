package corso.java.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.Order;

public interface OrdersRepository extends JpaRepository<Order, Integer> {
List<Order> findAll();
//List<Order> findByFulfilledOrder(Boolean fulfilled);
}