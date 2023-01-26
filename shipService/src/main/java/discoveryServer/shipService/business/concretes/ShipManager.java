package discoveryServer.shipService.business.concretes;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.common.utilities.mapping.ModelMapperService;


import discoveryServer.shipService.business.abstracts.ShipService;
import discoveryServer.shipService.business.requests.create.CreateShipRequest;
import discoveryServer.shipService.business.requests.update.UpdateShipRequest;
import discoveryServer.shipService.business.responses.create.CreateShipResponse;
import discoveryServer.shipService.business.responses.get.GetAllShipsResponse;
import discoveryServer.shipService.business.responses.get.GetShipResponse;
import discoveryServer.shipService.business.responses.update.UpdateShipResponse;
import discoveryServer.shipService.dataAccess.ShipRepository;
import discoveryServer.shipService.entities.Ship;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ShipManager implements ShipService{

	private ShipRepository shipRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllShipsResponse> getAll() {
		 List<Ship> ships = shipRepository.findAll();
	        return ships.stream().map(ship -> modelMapperService.forResponse()
	                .map(ship, GetAllShipsResponse.class))
	                .collect(Collectors.toList());
		
	}

	@Override
	public GetShipResponse getById(String id) {
		 Ship ship= shipRepository.findById(id).get();
	        GetShipResponse response = modelMapperService.forResponse().map(ship,GetShipResponse.class);
	        return response;
	
	}

	@Override
	public CreateShipResponse add(CreateShipRequest createShipRequest) {
		Ship ship = modelMapperService.forRequest().map(createShipRequest, Ship.class);
		ship.setId(UUID.randomUUID().toString());
		shipRepository.save(ship);
        CreateShipResponse createShipResponse = modelMapperService.forResponse().map(ship, CreateShipResponse.class);
		return createShipResponse;
	}

	@Override
	public UpdateShipResponse update(UpdateShipRequest updateShipRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		shipRepository.deleteById(id);
		
	}

}
