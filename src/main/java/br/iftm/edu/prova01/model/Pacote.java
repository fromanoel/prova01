package br.iftm.edu.prova01.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    
    private Endereco endereco;
    private String statusEntrega;

    public Pacote(String idString, String destinatario, String statusEntrega) {
        this.idString = idString;
        this.destinatario = destinatario;
        this.statusEntrega = statusEntrega;
    }

    
}
