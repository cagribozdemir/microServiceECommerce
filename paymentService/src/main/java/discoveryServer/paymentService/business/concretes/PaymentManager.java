package discoveryServer.paymentService.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import discoveryServer.paymentService.business.abstracts.PaymentService;
import discoveryServer.paymentService.business.requests.create.CreatePaymentRequest;
import discoveryServer.paymentService.business.requests.update.UpdatePaymentRequest;
import discoveryServer.paymentService.business.responses.create.CreatePaymentResponse;
import discoveryServer.paymentService.business.responses.get.GetAllPaymentsResponse;
import discoveryServer.paymentService.business.responses.get.GetPaymentResponse;
import discoveryServer.paymentService.business.responses.update.UpdatePaymentResponse;
import discoveryServer.paymentService.dataAccess.PaymentRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
	private PaymentRepository paymentRepository;

	@Override
	public List<GetAllPaymentsResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetPaymentResponse getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreatePaymentResponse add(CreatePaymentRequest createPaymentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdatePaymentResponse update(UpdatePaymentRequest updatePaymentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
}
