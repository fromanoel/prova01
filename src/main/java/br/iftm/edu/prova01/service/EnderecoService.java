package br.iftm.edu.prova01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.iftm.edu.prova01.model.Endereco;
import br.iftm.edu.prova01.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> buscaEnderecos() {
        List<Endereco> enderecos = new ArrayList<Endereco>();
        enderecoRepository.findAll().forEach(enderecos::add);
        return enderecos;
    }

    public Endereco adicionaEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
