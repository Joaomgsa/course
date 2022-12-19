package br.com.squad.course.repositories;

import br.com.squad.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem,Long> {
}
