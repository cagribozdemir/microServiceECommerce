package discoveryServer.invoiceService.business.requests.create;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInvoiceRequest {

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
	
    @NotNull
	@NotEmpty
	private double totalPrice;
	
    @NotNull
	@NotEmpty
	private String address;
}
