package discoveryServer.shipService.webApi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import discoveryServer.shipService.business.abstracts.ShipService;
import discoveryServer.shipService.business.requests.create.CreateShipRequest;
import discoveryServer.shipService.business.requests.update.UpdateShipRequest;
import discoveryServer.shipService.business.responses.create.CreateShipResponse;
import discoveryServer.shipService.business.responses.get.GetAllShipsResponse;
import discoveryServer.shipService.business.responses.get.GetShipResponse;
import discoveryServer.shipService.business.responses.update.UpdateShipResponse;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/ships")
public class ShipController {

	private ShipService shipService;
	
	@GetMapping
    public List<GetAllShipsResponse> getAll() {
        return shipService.getAll();
    }

    @GetMapping("/{id}")
    public GetShipResponse getById(@PathVariable String id) {
        return shipService.getById(id);
    }

    @PostMapping
    public CreateShipResponse add(@Valid @RequestBody CreateShipRequest request) {
        return shipService.add(request);
    }

    @PutMapping("/{id}")
    public UpdateShipResponse update(@Valid @RequestBody UpdateShipRequest request) {
        return shipService.update(request);
    }
    

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        shipService.delete(id);
    }
	
}
