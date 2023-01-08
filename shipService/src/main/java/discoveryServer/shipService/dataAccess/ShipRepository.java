package discoveryServer.shipService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import discoveryServer.shipService.entities.Ship;

public interface ShipRepository extends JpaRepository<Ship, String>{

}
