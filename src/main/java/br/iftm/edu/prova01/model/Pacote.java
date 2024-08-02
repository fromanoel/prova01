package br.iftm.edu.prova01.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pacote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idString;
    private String destinatario;

    @ManyToOne
    private Endereco endereco;

    private String statusEntrega;

    @OneToMany(mappedBy = "pacote")
    private List<Rastreamento> rastreamentos = new ArrayList<Rastreamento>();

    public Pacote(String idString, String destinatario, Endereco endereco, String statusEntrega) {
        this.idString = idString;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.statusEntrega = statusEntrega;
    }

    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao){
        this.statusEntrega = novoStatus;
        Rastreamento rastreamento = new Rastreamento();
        rastreamento.setDataHora(dataHora);
        rastreamento.setStatusRastreamento(novoStatus);
        rastreamento.setLocalizacao(localizacao);
        rastreamento.setPacote(this);
        rastreamentos.add(rastreamento);
    }

    public String consultarInformacoes() {
        return "ID: " + idString + ", Destinatário: " + destinatario + ", Endereço: " + endereco.getEnderecoCompleto() + ", Status: " + statusEntrega + ", Rastreamento histórico: " + rastreamentos;
    }





    
}
