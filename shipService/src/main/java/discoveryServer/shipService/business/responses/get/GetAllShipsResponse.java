package discoveryServer.shipService.business.responses.get;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllShipsResponse {

	private String id;
	private String shipperFirstName;
	private String shipperLastName;
	private LocalDate shipDate;
	private String orderNo;
	private LocalDate deliveryDate;
	private double price;
}
