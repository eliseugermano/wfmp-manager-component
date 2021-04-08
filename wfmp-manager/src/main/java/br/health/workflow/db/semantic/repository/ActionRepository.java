package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.ActionEntity;

public interface ActionRepository extends PagingAndSortingRepository<ActionEntity, Long>{

}
