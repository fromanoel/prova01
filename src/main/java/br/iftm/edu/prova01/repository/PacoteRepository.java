package br.iftm.edu.prova01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.prova01.model.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Long> {
    
}
