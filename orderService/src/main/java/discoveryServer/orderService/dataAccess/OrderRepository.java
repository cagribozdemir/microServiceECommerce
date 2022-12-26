package discoveryServer.orderService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import discoveryServer.orderService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
