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
	GetShipResponse getById(String id);
	CreateShipResponse add(CreateShipRequest createShipRequest);
	UpdateShipResponse update(UpdateShipRequest updateShipRequest);
	void delete(String id);
}
