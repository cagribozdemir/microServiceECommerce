package discoveryServer.orderService.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "shipperId")
	private String shipperId;
	
	@Column(name = "campaignId")
	private String campaignId;
	
	/*@Column(name = "productsId")
	private List<String> productsId;*/
	
	@Column(name = "orderNo")
	private int orderNo;
	
	@Column(name = "totalPrice")
	private double totalPrice;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "shipDate")
	private LocalDate shipDate;
	
}
