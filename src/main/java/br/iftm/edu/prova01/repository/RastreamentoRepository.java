package br.iftm.edu.prova01.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.prova01.model.Rastreamento;

@Repository
public interface RastreamentoRepository extends CrudRepository<Rastreamento, Long> {

    List<Rastreamento> findByPacoteId(Long id);
    
}
