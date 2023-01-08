package discoveryServer.shipService.business.concretes;

import java.util.List;

import discoveryServer.shipService.business.abstracts.ShipService;
import discoveryServer.shipService.business.requests.create.CreateShipRequest;
import discoveryServer.shipService.business.requests.update.UpdateShipRequest;
import discoveryServer.shipService.business.responses.create.CreateShipResponse;
import discoveryServer.shipService.business.responses.get.GetAllShipsResponse;
import discoveryServer.shipService.business.responses.get.GetShipResponse;
import discoveryServer.shipService.business.responses.update.UpdateShipResponse;
import discoveryServer.shipService.dataAccess.ShipRepository;

public class ShipManager implements ShipService{

	private ShipRepository shipRepository;
	@Override
	public List<GetAllShipsResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetShipResponse getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateShipResponse add(CreateShipRequest createShipRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateShipResponse update(UpdateShipRequest updateShipRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
