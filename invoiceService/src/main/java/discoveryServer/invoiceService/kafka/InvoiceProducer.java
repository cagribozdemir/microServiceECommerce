package discoveryServer.invoiceService.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InvoiceProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceProducer.class);

	private NewTopic topic;
	
	
}
