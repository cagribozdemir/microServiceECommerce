package discoveryServer.orderService.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import discoveryServer.orderService.business.abstracts.OrderService;
import discoveryServer.orderService.business.requests.create.CreateOrderRequest;
import discoveryServer.orderService.business.requests.update.UpdateOrderRequest;
import discoveryServer.orderService.business.responses.create.CreateOrderResponse;
import discoveryServer.orderService.business.responses.get.GetAllOrdersResponse;
import discoveryServer.orderService.business.responses.get.GetOrderResponse;
import discoveryServer.orderService.business.responses.update.UpdateOrderResponse;
import discoveryServer.orderService.dataAccess.OrderRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderManager implements OrderService {
	private OrderRepository orderRepository;

	public List<GetAllOrdersResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public GetOrderResponse getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateOrderResponse add(CreateOrderRequest createOrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdateOrderResponse update(UpdateOrderRequest updateOrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
