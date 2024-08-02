package br.iftm.edu.prova01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.iftm.edu.prova01.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    
}
