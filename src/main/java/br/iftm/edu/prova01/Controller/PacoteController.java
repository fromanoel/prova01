package br.iftm.edu.prova01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.iftm.edu.prova01.model.Pacote;
import br.iftm.edu.prova01.service.PacoteService;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    
    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public List<Pacote> buscaPacotes(){
        return pacoteService.buscaPacotes();
    }
    @PostMapping
    public Pacote adicionaPacote(@RequestBody Pacote pacote){
        return pacoteService.adicionaPacote(pacote);
    }
    @GetMapping("/{id}")
    public Pacote buscaPacoteEspecifico(@PathVariable Long id){
        return pacoteService.buscaPacoteEspecifico(id);
    }
    @PutMapping("/{id}")
    public Pacote atualizaPacote(@PathVariable Long id){
        return pacoteService.atualizaPacote(id);
    }

    @DeleteMapping("/{id}")
    public void deletaPacote(@PathVariable Long id){
        pacoteService.deletaPacote(id);
    }
}
