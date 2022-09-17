package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.LocationData;
import id.bootcamp.dto.LocationSpesificData;
import id.bootcamp.model.M_Location;

@Repository
public interface Rep_Location extends JpaRepository<M_Location, Long>{
	
	@Query(nativeQuery = true)
	public List<LocationData> getLocationList();
	
	@Query(nativeQuery = true)
	public List<LocationSpesificData> getKecamatanList();
	
	@Query(nativeQuery = true)
	public List<LocationSpesificData> getKabKotaList();
}
