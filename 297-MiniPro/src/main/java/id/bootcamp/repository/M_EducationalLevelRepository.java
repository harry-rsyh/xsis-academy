package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import id.bootcamp.model.M_EducationalLevel;

public interface M_EducationalLevelRepository extends JpaRepository<M_EducationalLevel, Long>{
	
	//Find By Name (name = :name)
	List<M_EducationalLevel> findByName(String name);
	
	@Query(value = "SELECT * FROM m_education_level WHERE name = :name AND is_delete = false", nativeQuery = true)
	List<M_EducationalLevel> findDuplicateName(String name);
		
	//Find By Name ignore Case Sensitif (name ILIKE :name)
	List<M_EducationalLevel> findByNameIgnoreCase(String name);
	
	// Find Name Contains Keyword (name ILIKE %keyword%)
	List<M_EducationalLevel> findByNameContainingIgnoreCase(String keyword);
	
	//Find By is_deleted = false
	@Query(value = "SELECT * FROM m_education_level WHERE is_delete = false ORDER BY id", nativeQuery = true)
	List<M_EducationalLevel> findByIsDeleteFalse();
	
	//Find By is_deleted = true
	@Query(value = "SELECT * FROM m_education_level WHERE is_delete = true ORDER BY id", nativeQuery = true)
	List<M_EducationalLevel> findByIsDeleteTrue();
}
