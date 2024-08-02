package br.iftm.edu.prova01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.iftm.edu.prova01.model.Pacote;
import br.iftm.edu.prova01.model.Rastreamento;
import br.iftm.edu.prova01.repository.RastreamentoRepository;

@Service
public class RastreamentoService {

    @Autowired
    private RastreamentoRepository rastreamentoRepository;

    // public Rastreamento adicionaRastreamento(Rastreamento rastreamento) {
    //     return rastreamentoRepository.save(rastreamento);
    // }

    public Rastreamento buscaRastreamentosEspecifico(Long id){
        return rastreamentoRepository.findById(id).orElse(null);
    }

}
