package discoveryServer.invoiceService.business.responses.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInvoiceResponse {

    private String id;
	
	private String paymentId;

	private String customerFirstName;

	private String customerLastName;

	private double totalPrice;

	private String address;
}
