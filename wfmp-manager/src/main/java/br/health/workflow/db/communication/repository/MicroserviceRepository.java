package br.health.workflow.db.communication.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.communication.entity.MicroserviceEntity;

public interface MicroserviceRepository extends PagingAndSortingRepository<MicroserviceEntity, Long>{
	
	@Query("select m from MicroserviceEntity m where m.reference = ?1")
    MicroserviceEntity findByReference(String reference);
}
