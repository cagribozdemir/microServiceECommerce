package discoveryServer.paymentService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import discoveryServer.paymentService.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
