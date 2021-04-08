package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.TransitionEntity;

public interface TransitionRepository extends PagingAndSortingRepository<TransitionEntity, Long>{

}
