package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.ZonaEleitoral;

@Repository

public interface ZonaEleitoralRepository extends CrudRepository<ZonaEleitoral, Long> {

}
