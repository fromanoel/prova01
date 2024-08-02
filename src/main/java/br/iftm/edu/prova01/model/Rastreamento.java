package br.iftm.edu.prova01.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Rastreamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataHora;

    private String status;

    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;

    private String resumo = "Data e hora: " + dataHora + ", Status: " + status + ", Localização: " + localizacao;

    
}
