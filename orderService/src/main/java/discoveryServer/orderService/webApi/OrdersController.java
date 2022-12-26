package discoveryServer.orderService.webApi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import discoveryServer.orderService.business.abstracts.OrderService;
import discoveryServer.orderService.business.requests.create.CreateOrderRequest;
import discoveryServer.orderService.business.requests.update.UpdateOrderRequest;
import discoveryServer.orderService.business.responses.create.CreateOrderResponse;
import discoveryServer.orderService.business.responses.get.GetAllOrdersResponse;
import discoveryServer.orderService.business.responses.get.GetOrderResponse;
import discoveryServer.orderService.business.responses.update.UpdateOrderResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrdersController {
	private OrderService orderService;
	
	@GetMapping
	public List<GetAllOrdersResponse> getAll() {
		return orderService.getAll();
	}

	@GetMapping("/{id}")
	public GetOrderResponse getById(@PathVariable String id) {
		return orderService.getById(id);
	}
	
	@PostMapping
	public CreateOrderResponse add(@Valid @RequestBody CreateOrderRequest createOrderRequest) {
		return orderService.add(createOrderRequest);
	}

	@PutMapping
	public UpdateOrderResponse update(@Valid @RequestBody UpdateOrderRequest updateOrderRequest) {
		return orderService.update(updateOrderRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		orderService.delete(id);
	}
}
