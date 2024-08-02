package br.iftm.edu.prova01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(exclude = "id")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String numero;

    private String cidade;

    private String estado;

    private String CEP;
 

    public Endereco(Long id, String rua, String numero, String cidade, String estado, String CEP) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;

    }


    public String getEnderecoCompleto() {
        return rua + ", " + numero + ", " + cidade + ", " + estado + ", " + CEP;
    }


}
