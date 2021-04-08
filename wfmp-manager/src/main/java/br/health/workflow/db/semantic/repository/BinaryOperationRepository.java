package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.BinaryOperationEntity;

public interface BinaryOperationRepository extends PagingAndSortingRepository<BinaryOperationEntity, Long>{

}
