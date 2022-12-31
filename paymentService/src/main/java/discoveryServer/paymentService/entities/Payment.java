package discoveryServer.paymentService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paymemts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@Column(name = "id")
	private String id;



}
