package discoveryServer.invoiceService.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import discoveryServer.invoiceService.business.abstracts.InvoiceService;
import discoveryServer.invoiceService.business.requests.create.CreateInvoiceRequest;
import discoveryServer.invoiceService.business.requests.update.UpdateInvoiceRequest;
import discoveryServer.invoiceService.business.responses.create.CreateInvoiceResponse;
import discoveryServer.invoiceService.business.responses.get.GetAllInvoicesResponse;
import discoveryServer.invoiceService.business.responses.get.GetInvoiceResponse;
import discoveryServer.invoiceService.business.responses.update.UpdateInvoiceResponse;
import discoveryServer.invoiceService.dataAccess.InvoiceRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InvoiceManager implements InvoiceService {
	private InvoiceRepository invoiceRepository;
	
	@Override
	public List<GetAllInvoicesResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetInvoiceResponse getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateInvoiceResponse add(CreateInvoiceRequest createInvoiceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateInvoiceResponse update(UpdateInvoiceRequest updateInvoiceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	

}
