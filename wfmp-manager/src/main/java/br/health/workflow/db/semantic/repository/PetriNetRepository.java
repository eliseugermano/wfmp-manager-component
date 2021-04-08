package br.health.workflow.db.semantic.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.PetriNetEntity;

public interface PetriNetRepository extends PagingAndSortingRepository<PetriNetEntity, Long>{
	
	@Query("select p from PetriNetEntity p where p.name = ?1")
    PetriNetEntity findByName(String name);
}
