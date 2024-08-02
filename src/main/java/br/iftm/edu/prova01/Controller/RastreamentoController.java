package br.iftm.edu.prova01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.iftm.edu.prova01.model.Rastreamento;
import br.iftm.edu.prova01.service.RastreamentoService;

@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {
    
    @Autowired
    private RastreamentoService rastreamentoService;


    @GetMapping("/{id}")
    public Rastreamento buscaRastreamentosEspecifico(@PathVariable Long id){
        return rastreamentoService.buscaRastreamentosEspecifico(id);
    }

    
}
