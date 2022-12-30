package discoveryServer.invoiceService.business.abstracts;

import java.util.List;

import discoveryServer.invoiceService.business.requests.create.CreateInvoiceRequest;
import discoveryServer.invoiceService.business.requests.update.UpdateInvoiceRequest;
import discoveryServer.invoiceService.business.responses.create.CreateInvoiceResponse;
import discoveryServer.invoiceService.business.responses.get.GetAllInvoicesResponse;
import discoveryServer.invoiceService.business.responses.get.GetInvoiceResponse;
import discoveryServer.invoiceService.business.responses.update.UpdateInvoiceResponse;

public interface InvoiceService {

	List<GetAllInvoicesResponse> getAll();
	CreateInvoiceResponse add(CreateInvoiceRequest createInvoiceRequest);
	void delete(String id);
	UpdateInvoiceResponse update(UpdateInvoiceRequest updateInvoiceRequest);
	GetInvoiceResponse getById(String id);
}
