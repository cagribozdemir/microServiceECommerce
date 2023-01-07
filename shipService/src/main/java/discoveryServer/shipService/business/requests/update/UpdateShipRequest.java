package discoveryServer.shipService.business.requests.update;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShipRequest {

	@NotNull
	@Min(1)
	private String id;
	
	@NotEmpty
	@NotNull
	@Size(min = 3)
	private String shipperFirstName;
	
	@NotEmpty
	@NotNull
	private String shipperLastName;
	
	@NotEmpty
	@NotNull
	private LocalDate shipDate;
	
	@NotEmpty
	@NotNull
	private String orderNo;
	
	@NotEmpty
	@NotNull
	private LocalDate deliveryDate;
	
	@NotEmpty
	@NotNull
	private double price;
}
