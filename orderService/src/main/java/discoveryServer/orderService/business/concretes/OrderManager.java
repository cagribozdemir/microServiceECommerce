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
	
	@Override
	public List<GetAllOrdersResponse> getAll() {
		return null;
	}

	@Override
	public GetOrderResponse getById(String id) {
		return null;
	}

	@Override
	public CreateOrderResponse add(CreateOrderRequest createOrderRequest) {
		return null;
	}

	@Override
	public UpdateOrderResponse update(UpdateOrderRequest updateOrderRequest) {
		return null;
	}

	@Override
	public void delete(String id) {
		
	}

}
