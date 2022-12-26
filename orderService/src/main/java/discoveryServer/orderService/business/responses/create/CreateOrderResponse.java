package discoveryServer.orderService.business.responses.create;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderResponse {
	private String id;
	private String customerId;
	private String shipperId;
	private String campaignId;
	private List<String> productsId;
	private int orderNo;
	private double totalPrice;
	private LocalDate date;
	private LocalDate shipDate;
}
