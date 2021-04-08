package br.health.workflow.db.semantic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.health.workflow.db.semantic.entity.TokenEntity;

public interface TokenRepository extends PagingAndSortingRepository<TokenEntity, Long>{

}
