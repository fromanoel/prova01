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

    private String statusRastreamento;

    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;

    public Rastreamento(Date dataHora, String status, String localizacao) {
        this.dataHora = dataHora;
        this.statusRastreamento = status;
        this.localizacao = localizacao;
    }


    public String getResumo(){
        return "Data e Hora: " + dataHora + ", Status: " + statusRastreamento + ", Localização: " + localizacao + ".";
    }

    
}
