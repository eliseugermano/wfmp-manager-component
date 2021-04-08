package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.ServiceEntity;

public interface ServiceRepository extends PagingAndSortingRepository<ServiceEntity, Long>{

}