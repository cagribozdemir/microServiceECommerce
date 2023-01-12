package discoveryServer.invoiceService.business.concretes;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;


import discoveryServer.invoiceService.business.abstracts.InvoiceService;
import discoveryServer.invoiceService.business.requests.create.CreateInvoiceRequest;
import discoveryServer.invoiceService.business.requests.update.UpdateInvoiceRequest;
import discoveryServer.invoiceService.business.responses.create.CreateInvoiceResponse;
import discoveryServer.invoiceService.business.responses.get.GetAllInvoicesResponse;
import discoveryServer.invoiceService.business.responses.get.GetInvoiceResponse;
import discoveryServer.invoiceService.business.responses.update.UpdateInvoiceResponse;
import discoveryServer.invoiceService.dataAccess.InvoiceRepository;
import discoveryServer.invoiceService.entities.Invoice;
import discoveryServer.invoiceService.kafka.InvoiceProducer;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InvoiceManager implements InvoiceService {
	
	private InvoiceRepository invoiceRepository;
	
	
	@Override
	public List<GetAllInvoicesResponse> getAll() {
	   return null;

	}

	@Override
	public GetInvoiceResponse getById(String id) {
		checkIfInvoiceExists(id);
		Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        GetInvoiceResponse response =  modelMapperService.forResponse().map(invoice, GetInvoiceResponse.class);
        return response;
		
	}

	@Override
	public CreateInvoiceResponse add(CreateInvoiceRequest createInvoiceRequest) {
		Invoice invoice = modelMapperService.forRequest().map(createInvoiceRequest, Invoice.class);
		invoice.setId(UUID.randomUUID().toString());
		
		Invoice createdInvoice = invoiceRepository.save(invoice);
		// event created
		/*InvoiceCreatedEvent invoiceCreatedEvent = new InvoiceCreatedEvent();
		invoiceCreatedEvent.setPaymentId(createdInvoice.getPaymentId());
		invoiceCreatedEvent.setMessage("Payment Created");
		
		this.invoiceProducer.sendMessage(invoiceCreatedEvent);*/
		
		CreateInvoiceResponse createPaymentResponse = modelMapperService.forResponse().map(invoice, CreateInvoiceResponse.class);
		
		return createPaymentResponse;
		
	}

	@Override
	public UpdateInvoiceResponse update(UpdateInvoiceRequest updateInvoiceRequest,String id) {
		 checkIfInvoiceExists(id);
		 Invoice invoice =  modelMapperService.forRequest().map(updateInvoiceRequest, Invoice.class);
	     invoice.setId(id);
	     invoiceRepository.save(invoice);
	     UpdateInvoiceResponse response =  modelMapperService.forResponse().map(invoice, UpdateInvoiceResponse.class);

	        return response;
	}

	@Override
	public void delete(String id) {
		checkIfInvoiceExists(id);
		invoiceRepository.deleteById(id);
		
	}
	private void checkIfInvoiceExists(String id) {
        if (!invoiceRepository.existsById(id)) {
            throw new BusinessException("INVOICE_NOT_FOUND");
        }
    }
	

}
