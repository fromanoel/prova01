package br.iftm.edu.prova01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.iftm.edu.prova01.model.Endereco;
import br.iftm.edu.prova01.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public Endereco adiciona(@RequestBody Endereco endereco){
        return enderecoService.adicionaEndereco(endereco);
    }

    @GetMapping
    public List<Endereco> buscaEnderecos(){
        return enderecoService.buscaEnderecos();
    }
}
