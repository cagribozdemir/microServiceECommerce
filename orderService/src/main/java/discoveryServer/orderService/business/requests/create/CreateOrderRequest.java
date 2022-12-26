package discoveryServer.orderService.business.requests.create;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
	private String customerId;
	private String shipperId;
	private String campaignId;
	private List<String> productsId;
}
