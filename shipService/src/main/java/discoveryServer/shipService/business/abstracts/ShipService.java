package discoveryServer.shipService.business.abstracts;

import java.util.List;

import discoveryServer.shipService.business.requests.create.CreateShipRequest;
import discoveryServer.shipService.business.requests.update.UpdateShipRequest;
import discoveryServer.shipService.business.responses.create.CreateShipResponse;
import discoveryServer.shipService.business.responses.get.GetAllShipsResponse;
import discoveryServer.shipService.business.responses.get.GetShipResponse;
import discoveryServer.shipService.business.responses.update.UpdateShipResponse;

public interface ShipService {

	List<GetAllShipsResponse> getAll();
	CreateShipResponse add(CreateShipRequest createShipRequest);
	void delete(String id);
	UpdateShipResponse update(UpdateShipRequest updateShipRequest);
	GetShipResponse getById(String id);
}
