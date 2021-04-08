package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.PlaceEntity;

public interface PlaceRepository extends PagingAndSortingRepository<PlaceEntity, Long>{

}
