package discoveryServer.invoiceService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import discoveryServer.invoiceService.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {

}
