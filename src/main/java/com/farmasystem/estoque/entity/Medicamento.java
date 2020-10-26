package com.farmasystem.estoque.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="tb_medicamento")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 255)
    private String nome;
    @Column(length = 40)
    private String lote;
    private LocalDate dataVencimento;
}
