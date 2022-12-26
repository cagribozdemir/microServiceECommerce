package discoveryServer.orderService.business.abstracts;

import java.util.List;

import discoveryServer.orderService.business.requests.create.CreateOrderRequest;
import discoveryServer.orderService.business.requests.update.UpdateOrderRequest;
import discoveryServer.orderService.business.responses.create.CreateOrderResponse;
import discoveryServer.orderService.business.responses.get.GetAllOrdersResponse;
import discoveryServer.orderService.business.responses.get.GetOrderResponse;
import discoveryServer.orderService.business.responses.update.UpdateOrderResponse;

public interface OrderService {
	List<GetAllOrdersResponse> getAll();
	GetOrderResponse getById(String id);
	CreateOrderResponse add(CreateOrderRequest createOrderRequest);
	UpdateOrderResponse update(UpdateOrderRequest updateOrderRequest);
	void delete(String id);

}
