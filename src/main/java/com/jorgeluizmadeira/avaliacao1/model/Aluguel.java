package com.jorgeluizmadeira.avaliacao1.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Proprietario proprietario;
    @ManyToOne
    private Imovel imovel;
    private BigDecimal valorAluguel;
    private LocalDate dataInicio;
    private LocalDate dataFim;

}
