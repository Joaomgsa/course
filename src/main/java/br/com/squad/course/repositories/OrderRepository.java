package br.com.squad.course.repositories;

import br.com.squad.course.entities.Order;
import br.com.squad.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
