package br.iftm.edu.prova01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.iftm.edu.prova01.model.Pacote;
import br.iftm.edu.prova01.repository.PacoteRepository;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;


    public List<Pacote> buscaPacotes() {
        List<Pacote> pacotes = new ArrayList<>();
        pacoteRepository.findAll().forEach(pacotes::add);
        return pacotes;
    }

    public Pacote adicionaPacote(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    public Pacote buscaPacoteEspecifico(Long id) {
        return pacoteRepository.findById(id).orElse(null);
    }

    public Pacote atualizaPacote(Long id){
        return pacoteRepository.save(buscaPacoteEspecifico(id));
    }

    public void deletaPacote(Long id){
        Pacote pacote = buscaPacoteEspecifico(id);
        pacoteRepository.delete(pacote);
    }
}
