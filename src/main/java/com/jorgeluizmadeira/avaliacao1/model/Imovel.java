package com.jorgeluizmadeira.avaliacao1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoImovel;
    @ManyToOne
    private Proprietario proprietario;
    private String endereco;
    private String detalhes;
    private LocalDate dataRegistro;
    private String status;
}

