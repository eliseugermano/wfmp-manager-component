package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.EventEntity;

public interface EventRepository extends PagingAndSortingRepository<EventEntity, Long>{

}
