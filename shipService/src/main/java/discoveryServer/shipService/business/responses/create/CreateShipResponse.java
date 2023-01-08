package discoveryServer.shipService.business.responses.create;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateShipResponse {

	private String id;
	private String shipperFirstName;
	private String shipperLastName;
	private LocalDate shipDate;
	private String orderNo;
	private LocalDate deliveryDate;
	private double price;
}
