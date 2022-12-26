package discoveryServer.paymentService.business.abstracts;

import java.util.List;

import discoveryServer.paymentService.business.requests.create.CreatePaymentRequest;
import discoveryServer.paymentService.business.requests.update.UpdatePaymentRequest;
import discoveryServer.paymentService.business.responses.create.CreatePaymentResponse;
import discoveryServer.paymentService.business.responses.get.GetAllPaymentsResponse;
import discoveryServer.paymentService.business.responses.get.GetPaymentResponse;
import discoveryServer.paymentService.business.responses.update.UpdatePaymentResponse;

public interface PaymentService {
	List<GetAllPaymentsResponse> getAll();
	GetPaymentResponse getById(String id);
	CreatePaymentResponse add(CreatePaymentRequest createPaymentRequest);
	UpdatePaymentResponse update(UpdatePaymentRequest updatePaymentRequest);
	void delete(String id);
}
