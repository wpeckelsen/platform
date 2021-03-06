package nl.wessel.platform.C.Repository;

import nl.wessel.platform.B.BusinessLogic.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findOrdersByName(String name);
}
