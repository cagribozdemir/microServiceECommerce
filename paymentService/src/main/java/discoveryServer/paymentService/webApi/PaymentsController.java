package discoveryServer.paymentService.webApi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import discoveryServer.paymentService.business.abstracts.PaymentService;
import discoveryServer.paymentService.business.requests.create.CreatePaymentRequest;
import discoveryServer.paymentService.business.requests.update.UpdatePaymentRequest;
import discoveryServer.paymentService.business.responses.create.CreatePaymentResponse;
import discoveryServer.paymentService.business.responses.get.GetAllPaymentsResponse;
import discoveryServer.paymentService.business.responses.get.GetPaymentResponse;
import discoveryServer.paymentService.business.responses.update.UpdatePaymentResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentsController {
	private PaymentService paymentService;
	
	@GetMapping
	public List<GetAllPaymentsResponse> getAll() {
		return paymentService.getAll();
	}

	@GetMapping("/{id}")
	public GetPaymentResponse getById(@PathVariable String id) {
		return paymentService.getById(id);
	}
	
	@PostMapping
	public CreatePaymentResponse add(@Valid @RequestBody CreatePaymentRequest createPaymentRequest) {
		return paymentService.add(createPaymentRequest);
	}

	@PutMapping
	public UpdatePaymentResponse update(@Valid @RequestBody UpdatePaymentRequest updatePaymentRequest) {
		return paymentService.update(updatePaymentRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		paymentService.delete(id);
	}
}
