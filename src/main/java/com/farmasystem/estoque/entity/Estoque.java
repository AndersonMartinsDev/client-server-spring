package com.farmasystem.estoque.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="tb_estoque")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 5)
    private Integer quantidade;
    @Column(length = 40)
    private SetorEnum setor;
    @OneToOne
    private Medicamento medicamento;
}
