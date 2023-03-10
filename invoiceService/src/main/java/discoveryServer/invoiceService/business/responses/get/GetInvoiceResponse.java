package discoveryServer.invoiceService.business.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInvoiceResponse {

    private String id;
	
	private String paymentId;

	private String customerFirstName;

	private String customerLastName;

	private double totalPrice;

	private String address;
}
