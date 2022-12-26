package discoveryServer.orderService.business.requests.update;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {
	private String id;
	private String customerId;
	private String shipperId;
	private String campaignId;
	private List<String> productsId;
}
