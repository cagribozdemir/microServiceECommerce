package discoveryServer.invoiceService.business.requests.update;

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
public class UpdateInvoiceRequest {

	@NotNull
	@Min(1)
	private String id;

	@NotNull
	@NotEmpty
	private String paymentId;
	
	@NotEmpty
	@NotNull
	@Size(min = 3)
	private String customerFirstName;

	@NotEmpty
	@NotNull
	private String customerLastName;

	@NotEmpty
	@NotNull
	private double totalPrice;

	@NotEmpty
	@NotNull
	private String address;
}
