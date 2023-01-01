package discoveryServer.shipService.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ships")
public class Ship {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name="shipperFirstName")
	private String shipperFirstName;
	
	@Column(name="shipperLastName")
	private String shipperLastName;
	
	@Column(name="shipDate")
	private LocalDate shipDate;
	
	@Column(name="orderNo")
	private String orderNo;
	
	@Column(name="deliveryDate")
	private LocalDate deliveryDate;
	
	@Column(name="price")
	private double price;
	
}
