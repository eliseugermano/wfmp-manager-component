package br.health.workflow.db.communication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.communication.entity.EndpointEntity;

public interface EndPointRepository extends PagingAndSortingRepository<EndpointEntity, Long>{

}
